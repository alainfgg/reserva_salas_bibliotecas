package biblioteca.salas.duoc.biblioteca.salas.duoc.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Table(name = "reserva")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = false)
    private Date fecha_solicitada;

    @Column(nullable = false, unique = false)
    private Date hora_solicitada;

    @Column(nullable = false, unique = false)
    private Date hora_cierre;

    @Column(nullable = false, unique = false)
    private Integer estado;

    //FOREIGN KEYS - M:1

    @ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false) //<== el atributo a conectar perteneciente a una fk?
    private Estudiante estudiante; //inyecta el modelo

    @ManyToOne
    @JoinColumn(name = "codigo_sala", nullable = false)
    private Sala sala;
}
