package pedroscy.padroesdio.model.util;

import jakarta.persistence.*;
import lombok.Data;
import pedroscy.padroesdio.model.Sala;

import java.math.BigDecimal;

@Entity
@Data
public abstract class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isDisponivel;

    @ManyToOne
    private Sala sala;

}
