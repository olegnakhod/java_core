package academy.lgs.exercice_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		RandomValues rv = new RandomValues();
		Scanner sc = new Scanner(System.in);

		List<Car> listCar = new ArrayList<Car>();
		
		int listCarSize = rv.getRandom(1, 10);
		
		for (int i = 0; i < listCarSize; i++) {
			listCar.add(new Car((rv.getRandom(150, 600)), rv.getRandom(1980, 2021),
					new SteeringWheel(rv.getRandom(17, 22)), new Engine((rv.getRandom(3, 16)))));
		}

		System.out.println("Натисніть 1 щоб вивести всі обєкти массиву arraysCar");
		System.out.println("Натисніть 2 щоб ввести дані про авто");
		System.out.println("Натисніть 0 щоб вийти із програми");
		
		boolean flag = true;
		while (flag) {
			switch (sc.nextInt()) {
			case 0: {
				flag = false;
				break;
			}
			case 1: {
				System.out.println(listCar);
				System.out.println(listCar.size());
				break;
			}
			case 2: {
				for (int i = 0; i < listCar.size(); i++) {
					listCar.set(i, new Car((rv.getRandom(150, 600)), rv.getRandom(1980, 2021),
							new SteeringWheel(rv.getRandom(17, 22)), new Engine((rv.getRandom(3, 16)))));
				}
				System.out.println(listCar);
				break;
			}
				
			}

		}
	}

}
