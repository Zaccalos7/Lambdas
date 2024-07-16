package it.java8.prove;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.java8.prove.Enums.BandieraBLu;

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
        "Firenze",
		"Ancona"
		);

		System.out.println(city.stream()
			.collect(Collectors.groupingBy(String::length)));

		System.out.println(ordina(city));

		getAllBandiereBluList2(city);



	}

	public static List<String> ordina(List<String> input){
		return input.stream().sorted(comparing(String::length).thenComparing(naturalOrder()))
			.collect(Collectors.toList());
	}

	public static List<String> getAllBandiereBluList(List<String> input){
		List<String> appoggioInput = new ArrayList<>();
		for(String element: input){
			try{
				BandieraBLu bandiera = BandieraBLu.valueOf(element);
				if(bandiera.getFlag())
					appoggioInput.add(element);
			}catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		System.out.println(appoggioInput.stream().collect(Collectors.toList()));
		return appoggioInput;
	}

	public static List<String> getAllBandiereBluList2(List<String> input){

		return input.stream()
				.map(element -> {
					try {
						return BandieraBLu.valueOf(element);
					} catch (IllegalArgumentException e) {
						return null;
					}
				})
				.filter(Objects::nonNull)
				.filter(BandieraBLu::getFlag)
				.map(bandieraBLu -> bandieraBLu.name())
				.collect(Collectors.toList());

	}
}

