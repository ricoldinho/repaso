package edu.servidor.rico;

import java.time.LocalDate;
import java.util.LinkedList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.servidor.rico.entities.Alumno;
import edu.servidor.rico.entities.Dni;
import edu.servidor.rico.entities.Instituto;

@SpringBootApplication
public class RelacionesUnoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RelacionesUnoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("INICIANDO PROYECTO");

		LinkedList<Alumno> listaAlumnosLiceo = new LinkedList<>();

		Instituto instituto1 = new Instituto();
		instituto1.setNombre("Liceo La Paz");
		instituto1.setLocalidad("A Coruña");
		instituto1.setCapacidadAlumnos(5);
		instituto1.setAlumnos(listaAlumnosLiceo);

		Dni dni1 = new Dni();
		dni1.setNumero("34887654");
		dni1.setLetra('L');
		dni1.setFechaExpedicion(LocalDate.of(2023, 10, 10));
		dni1.setFechaValidez(LocalDate.of(2033, 10, 10));

		Dni dni2 = new Dni("12345678", 'L', LocalDate.of(2023, 10, 10), LocalDate.of(2033, 10, 10));
		Dni dni3 = new Dni("12345679", 'K', LocalDate.of(2023, 10, 10), LocalDate.of(2033, 10, 10));
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Antonio Pérez Álvarez");
		alumno1.setEdad(24);
		alumno1.setModulo("DAW2");
		alumno1.setDni(dni1);


		Alumno alumno2 = new Alumno("Juan Cuesta", 60, "DAM1", dni2, instituto1);
		Alumno alumno3 = new Alumno("Antonio Recio", 70, "DAW2", dni3, instituto1);

		listaAlumnosLiceo.add(alumno2);
		listaAlumnosLiceo.add(alumno3);
		instituto1.setAlumnos(listaAlumnosLiceo);
		
		System.out.println(alumno2);
		System.out.println(alumno3);
		System.out.println(instituto1);
	}


}
