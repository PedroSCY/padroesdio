package pedroscy.padroesdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroscy.padroesdio.model.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
