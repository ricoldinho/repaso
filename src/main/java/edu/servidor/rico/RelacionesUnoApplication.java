package edu.servidor.rico;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.servidor.rico.entities.Alumno;
import edu.servidor.rico.entities.Dni;

@SpringBootApplication
public class RelacionesUnoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RelacionesUnoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("INICIANDO PROYECTO");
		Dni dni1 = new Dni();
		dni1.setNumero("34887654");
		dni1.setLetra('L');
		dni1.setFechaExpedicion(LocalDate.of(2023, 10, 10));
		dni1.setFechaValidez(LocalDate.of(2033, 10, 10));

		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Antonio Pérez Álvarez");
		alumno1.setEdad(24);
		alumno1.setModulo("DAW2");
		alumno1.setDni(dni1);

		System.out.println(alumno1);
	}


}
