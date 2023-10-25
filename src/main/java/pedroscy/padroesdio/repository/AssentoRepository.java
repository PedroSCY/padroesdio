package pedroscy.padroesdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroscy.padroesdio.model.util.Assento;
import pedroscy.padroesdio.model.Sala;

import java.util.List;

@Repository
public interface AssentoRepository extends JpaRepository<Assento, Long> {

    public List<Assento> findBySala(Sala sala);
}
