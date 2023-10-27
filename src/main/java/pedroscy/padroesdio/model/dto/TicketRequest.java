package pedroscy.padroesdio.model.dto;

import lombok.Data;

@Data
public class TicketRequest {
    private Long usuarioId;
    private Long sessaoId;
    private Long assentoId;
}
