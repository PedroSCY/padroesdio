package pedroscy.padroesdio.model.util;

import org.springframework.stereotype.Component;
import pedroscy.padroesdio.model.AssentoBasic;
import pedroscy.padroesdio.model.interfaces.AssentoFactory;

import java.math.BigDecimal;
@Component
public class AssentoBasicFactory implements AssentoFactory {

    @Override
    public Assento criarAssento(BigDecimal preco) {
        return new AssentoBasic(preco);
    }
}
