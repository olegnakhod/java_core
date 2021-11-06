package academy.lgs.exercice_02;

import java.util.Arrays;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		RandomValues rv = new RandomValues();
		Scanner sc = new Scanner(System.in);

		Car arraysCar[][] = new Car[rv.getRandom(1, 10)][rv.getRandom(1, 10)];

		for (int i = 0; i < arraysCar.length; i++) {
			for (int j = 0; j < arraysCar[i].length; j++) {
				arraysCar[i][j] = new Car((rv.getRandom(150, 600)), rv.getRandom(1980, 2021),
						new SteeringWheel(rv.getRandom(17, 22)), new Engine((rv.getRandom(3, 16))));
			}
		}

		System.out.println("Натисніть 1 щоб вивести всі обєкти массиву arraysCar");
		System.out.println("Натисніть 2 щоб ввести дані про авто");
		boolean flag = true;
		int value = sc.nextInt();
		while (flag) {
			switch (value) {
			case 1: {
				System.out.println(Arrays.deepToString(arraysCar));
				break;
			}
			case 2: {
				for (int i = 0; i < arraysCar.length; i++) {
					for (int j = 0; j < arraysCar[i].length; j++) {
						Arrays.fill(arraysCar[i], new Car((rv.getRandom(150, 600)), rv.getRandom(1980, 2021),
								new SteeringWheel(rv.getRandom(17, 22)), new Engine((rv.getRandom(3, 16)))));
					}
				}
				break;
			}
			}
			System.out.println(" ");
			System.out.println("Щоб продовжити натисніть 1 або 2, щоб вийти натисніть 0");
			value = sc.nextInt();
			
			if (sc.nextInt() == 0) {
				flag = false;
			}
		}

	}
}
