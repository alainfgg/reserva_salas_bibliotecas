package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estudiante")

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = true, length = 9)
    public String run;

    @Column(nullable = false, unique = false, length = 100)
    public String nombres;

    @Column(nullable = false, unique = true, length = 100)
    public String correo;

    @Column(nullable = false, unique = false, length = 1)
    public Character jornada;

    @Column(nullable = false, unique = true)
    public String numero;





}
