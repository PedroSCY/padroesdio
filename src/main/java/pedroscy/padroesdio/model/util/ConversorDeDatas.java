package pedroscy.padroesdio.model.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class ConversorDeDatas {

    private static final String PADRAO_FORMATACAO_ALL = "dd/MM/yyyy HH:mm:ss";
    private static final String PADRAO_FORMATACAO_DATE = "dd/MM/yyyy";
    private static final String PADRAO_FORMATACAO_TIME = "HH:mm:ss";

    public static String formatarLocalDateTime(LocalDateTime dataHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PADRAO_FORMATACAO_ALL);
        return dataHora.format(formatter);
    }

    public static String formatarDate(Date data) {
        SimpleDateFormat formatter = new SimpleDateFormat(PADRAO_FORMATACAO_DATE);
        return formatter.format(data);
    }

    public static LocalDateTime parseLocalDateTime(String dataHoraString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PADRAO_FORMATACAO_ALL);
        return LocalDateTime.parse(dataHoraString, formatter);
    }

    public static Date parseDate(String dataString) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(PADRAO_FORMATACAO_DATE);
        return formatter.parse(dataString);
    }
}
