package pedroscy.padroesdio.model;

import jakarta.persistence.*;
import lombok.Data;
import pedroscy.padroesdio.model.util.Assento;

import java.util.ArrayList;

@Data
@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int NSala;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Assento> assentos;




}
