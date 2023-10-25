package pedroscy.padroesdio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedroscy.padroesdio.model.util.Assento;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AssentoBasic extends Assento {

    private BigDecimal preco;

}
