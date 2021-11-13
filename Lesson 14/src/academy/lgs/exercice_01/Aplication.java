package academy.lgs.exercice_01;

import java.util.ArrayList;
import java.util.Collections;
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
		
		for (Pets pets2 : pets) {
			System.out.println(pets2);
		}
		System.out.println("");
		
		List<Pets> listPets = new ArrayList<Pets>(pets);
		Collections.sort(listPets);
		for (Pets pets2 : listPets) {
			System.out.println(pets2);
		}
		System.out.println("");
		
		List<Pets> listPets2 = new ArrayList<Pets>(pets);
		Collections.sort(listPets2, new AgeOfPetsComparator());
		for (Pets pets2 : listPets2) {
			System.out.println(pets2);
		}
	}

}
