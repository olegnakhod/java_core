package academy.lgs.min;

import java.util.Iterator;
import java.util.Scanner;

public class Aplication {

	public static Parlament parlament = Parlament.getInstance();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	realisationMenu();
	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію ");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції ");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію ");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію ");
		System.out.println("Введіть 6 щоб додати депутата в фракцію ");
		System.out.println("Введіть 7 щоб видалити депутата з фракції ");
		System.out.println("Введіть 8 щоб вивести список хабарників ");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника ");
		System.out.println("Введіть 0 щоб вийти із програми");
	}

	public static void realisationMenu() {
		boolean flag = true;

		while (flag) {
			menu();
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: {
				flag = false;
			}
				break;
			case 1: {
				parlament.addFaction();
				break;
			}
			case 2: {
				parlament.removeFaction();
				break;
			}
			case 3: {
				parlament.outAllFaction();
				break;
			}
			case 4: {
				parlament.removeFaction();
				break;
			}
			case 5: {
				parlament.outFaction();
				break;
			}
			case 6: {
				Iterator<Faction> iterator = parlament.getListParlament().iterator();
				while (iterator.hasNext()) {
					Faction faction = iterator.next();
					System.out.println("Введіть назву фракції");
					if (faction.getName().equals(scanner.next().toLowerCase())) {
						parlament.getListParlament().iterator().next().addDeputy();
						break;
					} else {
						System.out.println("Введіть будь ласка вже існуючу фракцію");
					}
				}
				break;
			}
			case 7: {
				parlament.removeDeputyInFaction();
				break;
			}
			case 8: {
				parlament.outAllGrifterInParlament();
				break;
			}
			case 9: {
				parlament.outMostGrifterInParlament();
				break;
			}

			}
		}

	}

}
