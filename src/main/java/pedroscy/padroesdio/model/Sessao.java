package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Entity
@Data
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Filme filme;

    private BigDecimal preco;

    private LocalDateTime dataHoraInicio;

    private LocalDateTime dataHoraFim;

    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Ticket> tickets;

    @ManyToOne
    private Sala sala;

}
