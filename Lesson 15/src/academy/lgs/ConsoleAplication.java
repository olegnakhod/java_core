package academy.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ConsoleAplication {

	private ZooClub zoo = new ZooClub();
	private Scanner sc = new Scanner(System.in);

	public void consoleAplication() {
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				addParticipant();
				break;
			}
			case 2: {
				addAnimalForParticipant();
				break;
			}
			case 3: {
				removeAnimalFromParticipant();
				break;
			}
			case 4: {
				removeParticipant();
				break;
			}
			case 5: {
				removeKindAnimal();
				break;
			}
			case 6: {
				outAllZooClub();
				break;
			}
			case 0: {
				System.exit(0);
			}
			}
		}
	}

	private void menu() {
		System.out.println("Натисніть 1 щоб додати учасника клубу");
		System.out.println("Натисніть 2 щоб додати тваринку до учасника клубу");
		System.out.println("Натисніть 3 щоб видалити тваринку з учасника клубу");
		System.out.println("Натисніть 4 щоб видалити учасника з клубу");
		System.out.println("Натисніть 5 щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Натисніть 6 щоб вивести на екран усіх учасників із їх тваринками");
		System.out.println("Натисніть 0 щоб завершити роботу із програмою");
	}

	private void addParticipant() {
		System.out.println("Entry name new person");
		String name = sc.next();
		System.out.println("Entry age new person");
		int age = sc.nextInt();
		zoo.getMap().put(new Person(name, age), new ArrayList<Animal>());
	}

	private void addAnimalForParticipant() {
		System.out.println("Entry name person");
		String name = sc.next();

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.getMap().entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Entry kind new animal");
				String kind = sc.next();
				System.out.println("Entry name new animal");
				String nameAnimal = sc.next();
				List<Animal> value = next.getValue();
				value.add(new Animal(kind, nameAnimal));
			}
		}

	}

	private void removeAnimalFromParticipant() {
		System.out.println("Entry name person");
		String name = sc.next();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.getMap().entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				ArrayList<Animal> personsAnimals = next.getValue();
				Iterator<Animal> animalIterator = personsAnimals.iterator();
				while (animalIterator.hasNext()) {
					System.out.println("Entry name animal");
					String nameAnimal = sc.next();
					Animal next2 = animalIterator.next();
					if (next2.getName().equalsIgnoreCase(nameAnimal)) {
						animalIterator.remove();
					}
				}
			}
		}

	}

	private void removeParticipant() {
		System.out.println("Entry name person");
		String name = sc.next();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.getMap().entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
	}

	private void removeKindAnimal() {
		System.out.println("Entry kind animal");
		String kindAnimal = sc.next();

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.getMap().entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			ArrayList<Animal> personsAnimals = next.getValue();
			Iterator<Animal> animalIterator = personsAnimals.iterator();
			while (animalIterator.hasNext()) {
				Animal next2 = animalIterator.next();
				if (next2.getKind().equalsIgnoreCase(kindAnimal)) {
					animalIterator.remove();
				}

			}
		}

	}
	
	private void outAllZooClub() {
		Set<Entry<Person, ArrayList<Animal>>> entrySet = zoo.getMap().entrySet();
		for (Entry<Person, ArrayList<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + " \n " + entry.getValue());
		}
	}

}
