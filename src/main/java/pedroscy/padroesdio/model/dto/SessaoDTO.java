package pedroscy.padroesdio.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedroscy.padroesdio.model.Filme;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessaoDTO {

    private Filme filme;
    private Double preco;
    private String dataHoraInicio;
    private String dataHoraFim;
    private Long sala;

}
