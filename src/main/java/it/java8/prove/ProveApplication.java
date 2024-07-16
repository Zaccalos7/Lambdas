package it.java8.prove;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProveApplication.class, args);
		
		List<String> city = Arrays.asList(
        "Roma",
        "Milano",
        "Napoli",
        "Torino",
        "Palermo",
        "Genova",
        "Firenze"
		);

		
	}

}
