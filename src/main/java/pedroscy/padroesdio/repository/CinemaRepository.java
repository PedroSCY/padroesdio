package pedroscy.padroesdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroscy.padroesdio.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
