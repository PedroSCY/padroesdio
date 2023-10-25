package pedroscy.padroesdio.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.interfaces.AssentoFactory;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.model.AssentoBasic;
import pedroscy.padroesdio.model.AssentoPremium;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.repository.AssentoRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AssentoService {

    @Autowired
    private final AssentoRepository assentoRepository;

    @Autowired
    private final AssentoFactory assentoBasicFactory;

    @Autowired
    private final AssentoFactory assentoPremiumFactory;


    public Assento criarAssento(BigDecimal preco, Sala sala, boolean isPremium) {
        Assento assento = isPremium ? assentoPremiumFactory.criarAssento(preco) : assentoBasicFactory.criarAssento(preco);
        assento.setSala(sala);
        return assentoRepository.save(assento);
    }

    public Optional<Assento> obterAssentoPorId(Long assentoId) {
        return assentoRepository.findById(assentoId);
    }

    public List<Assento> obterAssentosPorSala(Sala sala) {
        return assentoRepository.findBySala(sala);
    }

    public void removerAssento(Long assentoId) {
        assentoRepository.deleteById(assentoId);
    }
}
