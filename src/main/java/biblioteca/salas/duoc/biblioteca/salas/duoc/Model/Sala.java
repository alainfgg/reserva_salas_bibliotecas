package biblioteca.salas.duoc.biblioteca.salas.duoc.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sala")
@Entity

public class Sala {

    @Id
    @Column(nullable = false, unique = false)
    private String codigo;

    @Column(nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(nullable = false, unique = false)
    private Integer capacidad;

    @Column(nullable = false, unique = false)
    private Integer id_instituto;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private TipoSala tipoSala;

}
