package pedroscy.padroesdio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Cinema;
import pedroscy.padroesdio.repository.CinemaRepository;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository repository;

    public void salvarCinema(Cinema cinema) {
        repository.save(cinema);
    }
    public Cinema recuperarCinema(){
        return repository.findAll().get(0);
    }

    public boolean cinemaIsPresent(){
        return !repository.findAll().isEmpty();
    }

    public void deletarCinema(Cinema cinema){
        repository.deleteById(cinema.getId());
    }

}
