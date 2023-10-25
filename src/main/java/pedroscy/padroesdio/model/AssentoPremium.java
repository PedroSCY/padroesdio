package pedroscy.padroesdio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import pedroscy.padroesdio.model.util.Assento;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AssentoPremium extends Assento {

    private BigDecimal preco;

}
