package academy.lgs.max.exercice_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ConsoleApplication {

	private Set<Commodity> commodity = new HashSet<Commodity>();
	public Scanner sc = new Scanner(System.in);
	
	public Set<Commodity> getCommodity() {
		return commodity;
	}
	
	
	public ConsoleApplication(){
		commodity.add(new Commodity("Поліно",30,60,5));
		commodity.add(new Commodity("Дошка",20,30,3));
		commodity.add(new Commodity("Брус",25,100,10));
		commodity.add(new Commodity("Цвях",5,10,1));
		
		
		
	}
	
	

	public void startConsoleApi() {
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				addCommodity();
				break;
			}
			case 2: {
				removeCommodity();
				break;
			}
			case 3: {
				setElement();
				break;
			}
			case 4: {
				sortByName();
				break;
			}
			case 5: {
				sortByLenght();
				break;
			}
			case 6: {
				sortByWeight();
				break;
			}
			case 7: {
				sortByWidht();
				break;
			}
			case 8: {
				outCommodityByIndex();
				break;
			}
			case 9: {
				System.exit(0);
			}
			}
		}
	}

	private void menu() {
		System.out.println("Натисніть 1 щоб додати товар");
		System.out.println("Натисніть 2 щоб видалити товар");
		System.out.println("Натисніть 3 замінити товар");
		System.out.println("Натисніть 4 сортувати за назвоню");
		System.out.println("Натисніть 5 сортувати за довжиною");
		System.out.println("Натисніть 6 сортувати за вагою");
		System.out.println("Натисніть 7 сортувати за шириною");
		System.out.println("Натисніть 8 вивести і-тий елемент колекції");
		System.out.println("Натисніть 9 щоб вийти");
	}

	private void addCommodity() {
		RandomValues r = new RandomValues();
		System.out.println("Введіть назву товару");
		String name = sc.next().toLowerCase();
		int widht = r.getRandom(30, 100);
		int length = r.getRandom(40, 90);
		int weight = r.getRandom(1, 10);

		commodity.add(new Commodity(name, widht, length, weight));
		outSet();
	}

	private void removeCommodity() {
		System.out.println("Введіть назву товару що потрібно видалити");
		String name = sc.next();
		Set<Commodity> collect = commodity.stream().filter(x->!name.equalsIgnoreCase(x.getName())).collect(Collectors.toSet());
		commodity.clear();
		commodity.addAll(collect);
		outSet();
	}

	private void setElement() {
		RandomValues r = new RandomValues();
		List<Commodity> listCom = new ArrayList<Commodity>(commodity);
		System.out.println("Введіть індекс попереднього елементу та назву нового елементу що потрібно замінити ");
		Integer index = sc.nextInt();
		listCom.set(index,
				new Commodity(sc.next().toLowerCase(), r.getRandom(30, 100), r.getRandom(40, 90), r.getRandom(1, 10)));
		commodity = new HashSet<Commodity>(listCom);
		outSet();
	}


	private void sortByName() {
		commodity.stream().sorted(Comparator.comparing(Commodity::getName)).forEach(System.out::println);
		System.out.println("-------------------------");
	}


	private void sortByWeight() {
		commodity.stream().sorted(Comparator.comparing(Commodity::getWeight)).forEach(System.out::println);
		System.out.println("-------------------------");
	}


	private void sortByWidht() {
		commodity.stream().sorted(Comparator.comparing(Commodity::getWidht)).forEach(System.out::println);
		System.out.println("-------------------------");
	}


	private void sortByLenght() {
		commodity.stream().sorted(Comparator.comparing(Commodity::getLength)).forEach(System.out::println);
		System.out.println("-------------------------");
	}

	private void outCommodityByIndex() {
		List<Commodity> listCom = new ArrayList<Commodity>(commodity);
		System.out.println(listCom.get(sc.nextInt()));
	}

	private void outSet() {
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
		System.out.println("-------------------------");
	}
}
