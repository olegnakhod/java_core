package academy.lgs.max.exercice_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aplication {

	public static void main(String[] args) {
		
		Set<Pets> pets = new HashSet<Pets>();
		
		pets.add(new Pets("Lola", 1));
		pets.add(new Pets("Asja", 6));
		pets.add(new Pets("Betti", 2));
		pets.add(new Pets("Jessi",7));
		
		pets.stream().forEach(System.out::println);
		System.out.println("");
		
		pets.stream().sorted().forEach(System.out::println);
		System.out.println("");
		
		pets.stream().sorted(Comparator.comparing(Pets::getAge)).forEach(System.out::println);
	}

}
