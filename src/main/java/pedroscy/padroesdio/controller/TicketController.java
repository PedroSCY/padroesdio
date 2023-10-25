package pedroscy.padroesdio.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedroscy.padroesdio.controller.dto.TicketRequest;
import pedroscy.padroesdio.facade.TicketFacede;
import pedroscy.padroesdio.model.Ticket;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketFacede ticketFacede;

    @PostMapping
    public ResponseEntity<Ticket> reservarIngresso(@RequestBody TicketRequest ticketRequest) {
        Ticket ticket = ticketFacede.criarNovoTicket(ticketRequest.getUsuarioId(),ticketRequest.getSessaoId(),ticketRequest.getAssentoId());
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> obterTodosOsTickets() {
        List<Ticket> tickets = ticketFacede.obterTodosOsTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> obterTicketPorId(@PathVariable Long id) {
        Ticket ticket = ticketFacede.obterTicketPorId(id);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }



}
