package pedroscy.padroesdio.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedroscy.padroesdio.model.util.Assento;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaDTO {

    private int NSala;
    private int capacidade;
    private ArrayList<Assento> assentos;

}
