package biblioteca.salas.duoc.biblioteca.salas.duoc.Repository;

import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, String> {
}
