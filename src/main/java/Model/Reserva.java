package Model;

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
    public Integer id;

    @Column(nullable = false, unique = false)
    public Date fecha_solicitada;

    @Column(nullable = false, unique = false)
    public Date hora_solicitada;

    @Column(nullable = false, unique = false)
    public Date hora_cierre;

    @Column(nullable = false, unique = false)
    public Integer estado;

}
