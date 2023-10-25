package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.Data;
import pedroscy.padroesdio.model.util.Assento;

@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Usuario user;

    @ManyToOne()
    private Sessao sessao;

    @OneToOne()
    private Assento assento;

}
