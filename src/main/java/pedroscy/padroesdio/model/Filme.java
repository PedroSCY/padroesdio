package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Timer;

@Entity
@Data
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Long duracaoMs;
    private String sinopse;

    @Enumerated(EnumType.STRING)
    private Classificacao classific;
}
