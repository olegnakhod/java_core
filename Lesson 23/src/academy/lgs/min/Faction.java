package academy.lgs.min;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Faction {

	private String name;
	public Scanner scanner = new Scanner(System.in);
	private List<Deputy> listFaction = new ArrayList<Deputy>();
	ListIterator<Deputy> listIterator = listFaction.listIterator();

	public Faction(String name) {
		this.name = name;
	}
	
	public Faction() {
		this.name = scanner.next();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Deputy> getListFaction() {
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

	public List<Deputy> removeDeputy() {
		System.out.println("Введіть прізвище депутата якого потрібно видалити");
		String name = scanner.next();
		return this.listFaction = listFaction.stream().filter(x-> !name.equals(x.getSurName())).collect(Collectors.toList());
	}

	public void outAllGrifter() {
		listFaction.stream().filter(x->true == x.isGrafter()).forEach(System.out::println);
	}

	public Deputy outMostGrifter() {
		Deputy mostGrifterDeputy = listFaction.stream().filter(x->true == x.isGrafter()).max(Comparator.comparing(Deputy::getSizeOfBribe)).get();
		return mostGrifterDeputy;
	}

	public void outAllDeputy() {
		listFaction.stream().forEach(x->System.out.println(x));

	}

	public void removeAllDeputy() {
		listFaction.clear();
	}

	@Override
	public String toString() {
		return "name= " + name + getListFaction().toString();

	}

}
