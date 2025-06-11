package biblioteca.salas.duoc.biblioteca.salas.duoc.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 9)
    private String run;

    @Column(nullable = false, unique = false, length = 100)
    private String nombres;

    @Column(length = 100)
    private String correo;

    @Column(nullable = false, length = 1)
    private Character jornada;

    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "codigo_carrera", nullable = false)
    private Carrera carrera;






}
