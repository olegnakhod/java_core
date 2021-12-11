package academy.lgs.min;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Parlament {

	private static Parlament instance;
	private List<Faction> listParlament = new ArrayList<Faction>();
	public Scanner scanner = new Scanner(System.in);
	
	static {
		instance = new Parlament();
	}

	private Parlament() {
		Faction freedom = new Faction("freedom");
		Faction lgbt = new Faction("lgbt");
		freedom.getListFaction().add(new Deputy(90, 100, "John", "Smitt", 40, true));
		freedom.getListFaction().add(new Deputy(90, 100, "Mike", "Lebovskee", 40, false));
		freedom.getListFaction().add(new Deputy(90, 100, "Vova", "Zeleniy", 40, true));
		lgbt.getListFaction().add(new Deputy(90, 100, "Gogi", "Shvilli", 40, true));
		lgbt.getListFaction().add(new Deputy(90, 100, "Martin", "King", 40, true));
		listParlament.add(freedom);
		listParlament.add(lgbt);

	}

	public static Parlament getInstance() {
		return instance;
	}

	public List<Faction> getListParlament() {
		return listParlament;
	}

	public void addFaction() {
		System.out.println("Введіть назву фракції");
		String name = scanner.next();
		ListIterator<Faction> iterator = listParlament.listIterator();
		iterator.add(new Faction(name));
		System.out.println("Фракція не може бути порожньою");
		
		ListIterator<Faction> iteratorDep = listParlament.listIterator();
		while (iteratorDep.hasNext()) {
			Faction findFaction = iteratorDep.next();
			if (findFaction.getName().toLowerCase().equals(name)) {
				findFaction.addDeputy();
			}
		}
	}

	public List<Faction> removeFaction() {
		System.out.println("Введіть назву фракції яку хочете видалити");
		String name = scanner.next();
		return this.listParlament = listParlament.stream().filter(x -> !name.equalsIgnoreCase(x.getName()))
				.collect(Collectors.toList());
	}

	public void outAllFaction() {
		listParlament.stream().forEach(System.out::println);
	}

	public void outFaction() {
		System.out.println("Введіть назву фракції яку хочете вивести на екран");
		String name = scanner.next();
		listParlament.stream().filter(x -> name.equalsIgnoreCase(x.getName())).forEach(System.out::println);
	}

	public void addDeputyInFaction() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			if (findFaction.getName().toLowerCase().equals(scanner.next().toLowerCase())) {
				findFaction.addDeputy();
			}
		}
	}

	public void removeDeputyInFaction() {
		System.out.println("Введіть назву фракції у якій ви хочете видалити депутата");
		String name = scanner.next();
		listParlament.stream().filter(x->name.equalsIgnoreCase(x.getName())).forEach(x->x.removeDeputy());

	}

	public void outAllGrifterInParlament() {
		listParlament.stream().forEach(x->x.outAllGrifter());
	}

	public void outMostGrifterInParlament() {
		System.out.println(listParlament.stream().map(Faction::outMostGrifter).max(Comparator.comparing(Deputy::getSizeOfBribe)));

	}

	public void outAllDeputyInParlament() {
		listParlament.stream().forEach(Faction::outAllDeputy);
	}

}
