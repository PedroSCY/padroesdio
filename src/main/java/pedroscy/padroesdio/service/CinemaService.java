package pedroscy.padroesdio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Cinema;
import pedroscy.padroesdio.repository.CinemaRepository;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public void salvarCinema(Cinema cinema) {
        cinemaRepository.save(cinema);
    }
    public Cinema recuperarCinema(){
        return cinemaRepository.findAll().get(0);
    }

    public boolean cinemaIsPresent(){
        return !cinemaRepository.findAll().isEmpty();
    }

    public void deletarCinema(Cinema cinema){
        cinemaRepository.deleteById(cinema.getId());
    }

}
