package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedroscy.padroesdio.model.enums.Classificacao;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
