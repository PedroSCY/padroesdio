package pedroscy.padroesdio.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pedroscy.padroesdio.model.Cinema;
import pedroscy.padroesdio.service.CinemaService;

@Configuration
public class beans {

//    @Autowired
//    private CinemaService service;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Cinema cinema() {
//        if(service.cinemaIsPresent()){
//            return service.recuperarCinema();
//        }
            return new Cinema();
    }

}
