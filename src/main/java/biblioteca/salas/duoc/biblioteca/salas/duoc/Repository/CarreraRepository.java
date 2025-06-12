package biblioteca.salas.duoc.biblioteca.salas.duoc.Repository;

import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, String> {
}
