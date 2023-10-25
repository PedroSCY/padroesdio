package pedroscy.padroesdio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pedroscy.padroesdio.model.Cinema;
import pedroscy.padroesdio.service.CinemaService;

import java.util.ArrayList;

@SpringBootApplication
public class PadroesdioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PadroesdioApplication.class, args);
    }

}
