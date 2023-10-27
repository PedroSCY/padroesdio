package pedroscy.padroesdio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Filme;
import pedroscy.padroesdio.repository.FilmeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public Filme criarFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    public Optional<Filme> obterFilmePorId(Long filmeId) {
        return filmeRepository.findById(filmeId);
    }

    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }

    public void removerFilme(Long filmeId) {
        filmeRepository.deleteById(filmeId);
    }
}
