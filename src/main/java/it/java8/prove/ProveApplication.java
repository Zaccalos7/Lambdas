package it.java8.prove;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;
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

		System.out.println(city.stream()
			.collect(Collectors.groupingBy(String::length)));

		System.out.println(ordina(city));

	}

	public static List<String> ordina(List<String> input){
		return input.stream().sorted(comparing(String::length).thenComparing(naturalOrder()))
			.collect(Collectors.toList());
	}
}
