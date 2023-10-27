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
public class AssentoPremium extends Assento implements AssentoInterface {

    public AssentoPremium(BigDecimal preco) {
        super(preco);
    }


    @Override
    public String InclinarAssento() {
        String text = "Inclinando em 90º";
        System.out.println(text);
        return text;
    }
}
