package pedroscy.padroesdio.model.interfaces;

import org.springframework.stereotype.Component;
import pedroscy.padroesdio.model.util.Assento;

import java.math.BigDecimal;

@Component
public interface AssentoFactory {

    Assento criarAssento(BigDecimal preco);

}
