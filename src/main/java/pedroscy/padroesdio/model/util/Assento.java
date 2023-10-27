package pedroscy.padroesdio.model.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.model.enums.TipoAssento;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assento {

    public Assento(BigDecimal preco) {
        this.preco = preco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isDisponivel;
    private BigDecimal preco;
    private TipoAssento tipoAssento;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    @JsonIgnore
    private Sala sala;

}
