package biblioteca.salas.duoc.biblioteca.salas.duoc;

import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.Estudiante;
import biblioteca.salas.duoc.biblioteca.salas.duoc.Model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.Repository.CarreraRepository;
import biblioteca.salas.duoc.biblioteca.salas.duoc.Repository.EstudianteRepository;
import biblioteca.salas.duoc.biblioteca.salas.duoc.Repository.TipoSalaRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Profile("dev")//Perfil adecuado que ejecuta ciertas lineas o modulos de programación, esto se ve en application.properties
@Component
public class DataLoader implements CommandLineRunner {


    @Autowired
    private TipoSalaRepository tipoSalaRepository;
    @Autowired
    private CarreraRepository carreraRepository;
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override //sobrecarga de métoddo
    //no utilizar el commandlinerunner, utiliza el metoddo posterior a la notación
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        Random random = new Random();
        //orden de generación importa
        //siempre el orden es desde tablas que son pequeñas, o que no cuentan con foreign key, ya que
        //por ejemplo, la tabla estudiante requiere del campo codigo_carrera

        //Creando tipos de sala ==> la tabla que es débil de relación
        for (int i = 0; i < 3; i++) {
            TipoSala tipoSala = new TipoSala();
            tipoSala.setNombre(faker.redDeadRedemption2().majorCharacter());
            tipoSalaRepository.save(tipoSala); //guarda bolsa, que es tipo sala
        }

        //Generar carreras
        for (int i = 0; i < 5; i++) {
            Carrera carrera = new Carrera();
            carrera.setCodigo(faker.code().asin()); //entrega un código, más no uno único.
            carrera.setNombre(faker.educator().course());
            carreraRepository.save(carrera);
        }

        List<Carrera> carreras = carreraRepository.findAll();

        //Generamos carreras
        for (int i = 0; i < 50; i++) {
            Estudiante estudiante = new Estudiante();
            estudiante.setRun(faker.idNumber().valid());
            estudiante.setNombres(faker.name().fullName());
            estudiante.setCorreo(faker.internet().emailAddress());
            estudiante.setJornada(faker.options().option("D", "N").charAt(0));
            estudiante.setTelefono(faker.number().numberBetween(100000000, 999999999));
            estudiante.setCarrera(carreras.get(random.nextInt(carreras.size())));
            estudianteRepository.save(estudiante);
        }
    }
}