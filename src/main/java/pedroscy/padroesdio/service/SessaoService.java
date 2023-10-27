package pedroscy.padroesdio.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Sessao;
import pedroscy.padroesdio.repository.SessaoRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SessaoService {

    @Autowired
    private final SessaoRepository sessaoRepository;

    public Sessao criarSessao(Sessao sessao) {
        return sessaoRepository.save(sessao);
    }

    public List<Sessao> obterTodasAsSessoes() {
        return sessaoRepository.findAll();
    }

    public Optional<Sessao> obterSessaoPorId(Long id) {
        return sessaoRepository.findById(id);
    }

    public void removerSessao(Long id) {
        sessaoRepository.deleteById(id);
    }

}
