package pedroscy.padroesdio.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.repository.SalaRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public Sala criarSala(Sala sala){
        return salaRepository.save(sala);
    }

    public Optional<Sala> obterSalaPorId(Long salaId){
        return salaRepository.findById(salaId);
    }

    public List<Sala> listarSalas(){
        return salaRepository.findAll();
    }

    public void addAssentosASala(List<Assento> assentos, Sala sala){
        for(Assento a: assentos){
            a.setSala(sala);
        }
        sala.getAssentos().addAll(assentos);
        salaRepository.save(sala);
    }

    public void addMAssento(Assento assento, Sala sala){
        assento.setSala(sala);
        sala.getAssentos().add(assento);
        salaRepository.save(sala);
    }
}
