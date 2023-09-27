package digital.dmtran.api.repository;

import digital.dmtran.api.domain.Relatorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {

    Page<Relatorio> findAllByAtivoTrue(Pageable paginacao);
}
