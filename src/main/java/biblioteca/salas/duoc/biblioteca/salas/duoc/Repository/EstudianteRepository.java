package biblioteca.salas.duoc.biblioteca.salas.duoc.Repository;

import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.Estudiante;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
