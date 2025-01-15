package edu.servidor.rico;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
