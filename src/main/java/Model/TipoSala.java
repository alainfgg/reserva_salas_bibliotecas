package Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tipo_sala")

public class TipoSala {

    @Id
    @Column(nullable = false, unique = true)
    public Integer id_tipo;

    @Column(nullable = false, unique = false, length = 30)
    public String nombre;
}
