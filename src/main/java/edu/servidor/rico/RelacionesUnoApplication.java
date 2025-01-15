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

	}


}
