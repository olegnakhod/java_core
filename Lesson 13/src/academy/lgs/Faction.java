package academy.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {

	private String name;
	public Scanner scanner = new Scanner(System.in);
	private ArrayList<Deputy> listFaction = new ArrayList<Deputy>();
	ListIterator<Deputy> listIterator = listFaction.listIterator();

	public Faction() {
		System.out.println("Введіть назву фракції");
		this.name = scanner.next();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Deputy> getListFaction() {
		return listFaction;
	}

	public void addDeputy() {
		RandomValues r = new RandomValues();
		System.out.println("Введіть ім'я депутата");
		String name = scanner.next();
		System.out.println("Введіть прізвище депутата");
		String surName = scanner.next();
		int age = r.getRandom(21, 90);
		int weight = r.getRandom(60, 120);
		int height = r.getRandom(156, 210);
		boolean isGrafter;
		if (r.getRandom(0, 1) == 1) {
			isGrafter = true;
		} else {
			isGrafter = false;
		}

		listIterator.add(new Deputy(weight, height, name, surName, age, isGrafter));
	}

	public void removeDeputy() {
		Iterator<Deputy> iterator = listFaction.iterator();
		while ( iterator.hasNext()) {
			Deputy findDeputy =  iterator.next();
			if (findDeputy.getSurName().toLowerCase().equals(scanner.next().toLowerCase())) {
				iterator.remove();
			}
		}

	}

	public void outAllGrifter() {
		Iterator<Deputy> iterator = listFaction.iterator();
		while (iterator.hasNext()) {
			Deputy findDeputy = iterator.next();
			if (findDeputy.isGrafter() == true) {
				System.out.println(findDeputy);
			}
		}
	}

	public void outMostGrifter() {
		Collections.sort(listFaction);
		Deputy deputy = listFaction.get(0);
		System.out.println(deputy);
	}

	public void outAllDeputy() {
		Iterator<Deputy> iterator = listFaction.iterator();
		while ( iterator.hasNext()) {
			Deputy findDeputy =  iterator.next();
			System.out.println(findDeputy);
		}

	}

	public void removeAllDeputy() {
		Iterator<Deputy> iterator = listFaction.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
	}

	@Override
	public String toString() {
		return "name= " + name + getListFaction().toString();

	}

}
