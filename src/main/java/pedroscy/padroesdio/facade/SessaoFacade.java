package pedroscy.padroesdio.facade;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.model.Sessao;
import pedroscy.padroesdio.model.dto.SessaoDTO;
import pedroscy.padroesdio.service.SalaService;
import pedroscy.padroesdio.service.SessaoService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Component
@AllArgsConstructor
public class SessaoFacade {

    @Autowired
    private final SessaoService sessaoService;

    @Autowired
    private final SalaService salaService;

    public Sessao criarNovaSessao(SessaoDTO sessaoDTO){
        Sessao sessao = Sessao.builder()
                .filme(sessaoDTO.getFilme())
                .preco(BigDecimal.valueOf(sessaoDTO.getPreco()))
                .dataHoraInicio(LocalDateTime.parse(sessaoDTO.getDataHoraInicio()))
                .dataHoraFim(LocalDateTime.parse(sessaoDTO.getDataHoraFim()))
                .sala(salaService.obterSalaPorId(sessaoDTO.getSala()).get()).build();

        return sessaoService.criarSessao(sessao);
    }

    public List<Sessao> obterTodasAsSessoes(){
        return sessaoService.obterTodasAsSessoes();
    }

    public Sessao obterSessaoPorId(long id) {
        return sessaoService.obterSessaoPorId(id).get();
    }



}
