package pedroscy.padroesdio.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pedroscy.padroesdio.model.*;
import pedroscy.padroesdio.model.enums.Classificacao;
import pedroscy.padroesdio.model.enums.TipoAssento;
import pedroscy.padroesdio.model.util.*;
import pedroscy.padroesdio.service.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Configuration
public class MyAPP implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private SessaoService sessaoService;

    @Autowired
    private SalaService salaService;

    @Autowired
    private FilmeService filmeService;

    @Autowired
    private AssentoService assentoService;

    @Override
    public void run(String... args) throws Exception {

        preCriarUsuario();
        preCriarSessao(preCriarSala());

    }

    private void preCriarUsuario() throws Exception {
        Usuario user = Usuario.builder()
                .nome("Pedro")
                .aNascimento(ConversorDeDatas.parseDate("13/04/2001"))
                .isStudent(true)
                .telefone("83998286346")
                .endereco("Rua 7 de janeiro").build();


        if(!usuarioService.verificarExistenciausuario(user)) {
            usuarioService.criarUsuario(user);
        }
    }

    private void preCriarSessao(Sala sala) throws Exception {
        Filme filme = Filme.builder()
                .titulo("As tranças do rei careca")
                .duracaoMs(Long.parseLong(String.valueOf(60*60*60)))
                .sinopse("Um rei que usou minoxidiu")
                .classific(Classificacao.LIVRE)
                .build();

        filmeService.criarFilme(filme);

        LocalDateTime ldtI = LocalDateTime.of(2023,10,29,20,0,0);
        LocalDateTime ldtF = ldtI.plusSeconds(ConversorDeTempo.converterMilissegundosParaSegundos(filme.getDuracaoMs()));

        Sessao sessao = Sessao.builder()
                .filme(filme)
                .preco(BigDecimal.valueOf(20.10))
                .dataHoraInicio(ldtI)
                .dataHoraFim(ldtF)
                .sala(salaService.obterSalaPorId(sala.getId()).get()).build();

        sessaoService.criarSessao(sessao);
    }

    private Sala preCriarSala() {

        ArrayList<Assento> assentos = new ArrayList<>();
        Double porcentagemPremium = 0.2;

        Sala sala = new Sala();
        sala.setNSala(1);
        sala.setCapacidade(50);

        for(int i = 0; i < sala.getCapacidade(); i++){
            Assento assento;
            if(i < sala.getCapacidade() * porcentagemPremium){
                assento = assentoService.criarAssento(BigDecimal.valueOf(15.00), TipoAssento.PREMIUM);
            } else {
                assento = assentoService.criarAssento(BigDecimal.valueOf(10.00), TipoAssento.BASIC);
            }
            assentos.add(assento);
        }
        salaService.addAssentosASala(assentos, sala);
        return salaService.criarSala(sala);
    }
}
