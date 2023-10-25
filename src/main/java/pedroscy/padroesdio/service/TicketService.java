package pedroscy.padroesdio.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.model.Sessao;
import pedroscy.padroesdio.model.Ticket;
import pedroscy.padroesdio.model.Usuario;
import pedroscy.padroesdio.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketService {

    @Autowired
    private final TicketRepository ticketRepository;


    public Ticket reservarIngresso(Usuario usuario, Sessao sessao, Assento assento) {
        Ticket ticket = new Ticket();
        ticket.setUser(usuario);
        ticket.setSessao(sessao);
        ticket.setAssento(assento);
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> buscarTicketPorId(Long id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> recuperarTodos(){
        return ticketRepository.findAll();
    }

}
