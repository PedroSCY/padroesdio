package pedroscy.padroesdio.model.util;

import org.springframework.stereotype.Component;

@Component
public class ConversorDeTempo {

    public static long converterHorasParaMinutos(long horas) {
        return horas * 60;
    }

    public static long converterMinutosParaHoras(long minutos) {
        return minutos / 60;
    }

    public static long converterMinutosParaSegundos(long minutos) {
        return minutos * 60;
    }

    public static long converterSegundosParaMinutos(long segundos) {
        return segundos / 60;
    }

    public static long converterSegundosParaMilissegundos(long segundos) {
        return segundos * 1000;
    }

    public static long converterMilissegundosParaSegundos(long milissegundos) {
        return milissegundos / 1000;
    }

    public static long converterMilissegundosParaMinutos(long milissegundos) {
        return converterSegundosParaMinutos(converterMilissegundosParaSegundos(milissegundos));
    }

    public static long converterMilissegundosParaHoras(long milissegundos) {
        return converterMinutosParaHoras(converterMilissegundosParaMinutos(milissegundos));
    }
}
