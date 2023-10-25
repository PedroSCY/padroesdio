package pedroscy.padroesdio.model.util;

import org.springframework.stereotype.Component;
import pedroscy.padroesdio.model.AssentoPremium;
import pedroscy.padroesdio.model.interfaces.AssentoFactory;

import java.math.BigDecimal;
@Component
public class AssentoPremiumFactory implements AssentoFactory {

    @Override
    public Assento criarAssento(BigDecimal preco) {
        return new AssentoPremium(preco);
    }
}
