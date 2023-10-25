package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date aNascimento;
    private boolean isStudent;
    private String telefone;
    private String endereco;

}
