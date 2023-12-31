package pedroscy.padroesdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroscy.padroesdio.model.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}
