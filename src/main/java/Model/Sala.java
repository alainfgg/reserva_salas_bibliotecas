package Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    public String codigo;

    @Column(nullable = false, unique = false, length = 50)
    public String nombre;

    @Column(nullable = false, unique = false)
    public Integer capacidad;

    @Column(nullable = false, unique = false)
    public Integer id_instituto;

}
