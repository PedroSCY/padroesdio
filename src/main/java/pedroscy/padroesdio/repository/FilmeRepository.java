package pedroscy.padroesdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroscy.padroesdio.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
