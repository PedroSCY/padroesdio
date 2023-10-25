package pedroscy.padroesdio.facade;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import pedroscy.padroesdio.model.Sessao;
import pedroscy.padroesdio.model.Ticket;
import pedroscy.padroesdio.model.Usuario;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.service.AssentoService;
import pedroscy.padroesdio.service.SessaoService;
import pedroscy.padroesdio.service.TicketService;
import pedroscy.padroesdio.service.UsuarioService;

import java.util.List;

@Component
@AllArgsConstructor
public class TicketFacede {

    @Autowired
    private final TicketService ticketService;
    @Autowired
    private final UsuarioService usuarioService;
    @Autowired
    private final SessaoService sessaoService;
    @Autowired
    private final AssentoService assentoService;

    public Ticket criarNovoTicket( Long usuarioId,  Long sessaoId,  Long assentoId){

        Usuario usuario = usuarioService.buscarUsuarioPorId(usuarioId).get();
        Sessao sessao = sessaoService.obterSessaoPorId(sessaoId).get();
        Assento assento = assentoService.obterAssentoPorId(assentoId).get();

        return ticketService.reservarIngresso(usuario,sessao,assento);
    }


    public List<Ticket> obterTodosOsTickets() {
        return ticketService.recuperarTodos();
    }

    public Ticket obterTicketPorId(Long id) {
        return ticketService.buscarTicketPorId(id).get();
    }
}
