package academy.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Parlament {

	private static Parlament instance;
	private ArrayList<Faction> listParlament = new ArrayList<Faction>();
	public Scanner scanner = new Scanner(System.in);

	static {
		instance = new Parlament();
	}

	private Parlament() {
	}

	public static Parlament getInstance() {
		return instance;
	}

	public ArrayList<Faction> getListParlament() {
		return listParlament;
	}

	public void addFaction() {
		ListIterator<Faction> iterator = listParlament.listIterator();
		iterator.add(new Faction());
	}

	public void removeFaction() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			if (findFaction.getName().toLowerCase().equals(scanner.next().toLowerCase())) {
				iterator.remove();
			}
		}
	}

	public void outAllFaction() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			System.out.println(findFaction);
		}
	}

	public void outFaction() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			if (findFaction.getName().toLowerCase().equals(scanner.next().toLowerCase())) {
				System.out.println(findFaction);
			}
		}
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
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			if (findFaction.getName().toLowerCase().equals(scanner.next().toLowerCase())) {
				findFaction.removeDeputy();
			}
		}
	}

	public void outAllGrifterInParlament() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			findFaction.outAllGrifter();
		}
	}

	public void outMostGrifterInFaction() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			if (findFaction.getName().toLowerCase().equals(scanner.next().toLowerCase())) {
				findFaction.outMostGrifter();
			}
		}
	}

	public void outAllDeputyInParlament() {
		Iterator<Faction> iterator = listParlament.iterator();
		while (iterator.hasNext()) {
			Faction findFaction = iterator.next();
			findFaction.outAllDeputy();
		}
	}

}
