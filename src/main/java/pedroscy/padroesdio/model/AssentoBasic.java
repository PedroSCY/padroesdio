package pedroscy.padroesdio.model;

import jakarta.persistence.Entity;
import lombok.*;
import pedroscy.padroesdio.model.interfaces.AssentoInterface;
import pedroscy.padroesdio.model.util.Assento;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class AssentoBasic extends Assento implements AssentoInterface {

    public AssentoBasic(BigDecimal preco) {
        super(preco);
    }

    @Override
    public String InclinarAssento() {
        String text = "Inclinando em 45º";
        System.out.println(text);
        return text;
    }
}
