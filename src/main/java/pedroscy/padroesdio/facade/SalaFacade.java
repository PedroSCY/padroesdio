package pedroscy.padroesdio.facade;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.model.dto.SalaDTO;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.service.SalaService;

import java.util.List;

@Component
@AllArgsConstructor
public class SalaFacade {

    @Autowired
    private final SalaService salaService;

    public Sala criarNovaSala(SalaDTO salaDTO){
        Sala sala = new Sala();
        sala.setNSala(salaDTO.getNSala());
        sala.setCapacidade(salaDTO.getCapacidade());
        sala.setAssentos(salaDTO.getAssentos());

        for(Assento assento: sala.getAssentos()){
            assento.setSala(sala);
        }
        return salaService.criarSala(sala);
    }

    public List<Sala> obterTodasAsSalas(){
        return salaService.listarSalas();
    }

    public Sala obterSalaPorId(long id) {
        return salaService.obterSalaPorId(id).get();
    }

}
