package academy.lgs;

import java.time.Month;
import java.util.Scanner;

public class Aplication {

	static void menu() {
		System.out.println("Натисніть 0, щоб перевірити чи існує такий місяць");
		System.out.println("Натисніть 1, щоб вивести місяці з такою ж порою року");
		System.out.println("Натисніть 2, щоб вивести місяці з такою ж кількістю днів");
		System.out.println("Натисніть 3, щоб вивести місяці з меншою кількістю днів");
		System.out.println("Натисніть 4, щоб вивести місяці з більшою кількістю днів");
		System.out.println("Натисніть 5, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 6, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 7, щоб вивести на екран місяці з парною кількістю днів");
		System.out.println("Натисніть 8, щоб вивести на екран місяці з не парною кількістю днівт");
		System.out.println("Натисніть 9, щоб вивести на екран чи вказаний місяць має парну кількість днів");
	}

	public static void main(String[] args) {
		menu();

		Months[] months = Months.values();
		Seasons[] seasons = Seasons.values();
		Scanner scanner = new Scanner(System.in);

		switch (scanner.next()) {
		case "0": {
			System.out.println("Ввведіть місяць");
			String month = scanner.next().toUpperCase();

			boolean flag = isMonthPresent(months, month);

			if (!flag) {
				System.out.println("Місяця із такою назвою не існує");
			}
			break;
		}
		case "1": {
			System.out.println("Введіть пору року");
			String seasonSc = scanner.next().toUpperCase();

			boolean flag = false;

			for (Months mon : months) {
				if (mon.getSeason().name().equals(seasonSc)) {
					flag = true;
				}
			}

			if (flag) {
				for (Months mon : months) {
					if (mon.getSeason().toString().equalsIgnoreCase(seasonSc)) {
						System.out.println(mon);
					}
				}
			}

			if (!flag) {
				System.out.println("Місяця із такою назвою не існує");
			}
			break;

		}
		case "2": {

			System.out.println("Введіть кількість днів");
			int daysSc = scanner.nextInt();

			boolean flag = false;

			for (Months mon : months) {
				if (mon.getDays() == daysSc) {
					flag = true;
				}
			}

			if (flag) {
				for (Months mon : months) {
					if (mon.getDays() == daysSc) {
						System.out.println(mon);
					}
				}
			}

			if (!flag) {
				System.out.println("Місяця із такою кількістю днів не існує");
			}
			break;

		}
		case "3": {

			System.out.println("Введіть кількість днів");
			int daysSc = scanner.nextInt();

			boolean flag = false;
			int count = 0;

			for (Months mon : months) {
				if (mon.getDays() == daysSc) {
					flag = true;
				}
			}

			if (flag) {
				for (Months mon : months) {
					if (mon.getDays() < daysSc) {
						System.out.println(mon);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Місяців із меншою кількістю днів не існує");
				}
			}

			if (!flag) {
				System.out.println("Місяця із такою кількістю днів не існує");
			}
			break;

		}
		case "4": {

			System.out.println("Введіть кількість днів");
			int daysSc = scanner.nextInt();

			boolean flag = false;
			int count = 0;

			for (Months mon : months) {
				if (mon.getDays() == daysSc) {
					flag = true;
				}
			}

			if (flag) {
				for (Months mon : months) {
					if (mon.getDays() > daysSc) {
						System.out.println(mon);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Місяців із більшою кількістю днів не існує");
				}
			}

			if (!flag) {
				System.out.println("Місяця із такою кількістю днів не існує");
			}
			break;

		}
		case "5": {

			System.out.println("Введіть пору року");
			String season = scanner.next().toUpperCase();

			boolean flag = isSeasonPresent(seasons, season);

			if (flag) {
				
				Seasons seasonTwo = Seasons.valueOf(season);
				int ordinal = seasonTwo.ordinal();

				if (ordinal == (seasons.length - 1)) {
					ordinal = 0;
					System.out.println(seasons[ordinal]);
				} else {
					System.out.println(seasons[ordinal + 1]);
				}
			}

			if (!flag) {
				System.out.println("Такої пори року не існує");
			}
			break;

		}
		case "6": {

			System.out.println("Введіть пору року");
			String season = scanner.next().toUpperCase();

			boolean flag = isSeasonPresent(seasons, season);

			if (flag) {
				Seasons seasonTwo = Seasons.valueOf(season);
				int ordinal = seasonTwo.ordinal();

				if (ordinal == (seasons.length)) {
					ordinal = ordinal - 1;
					System.out.println(seasons[ordinal]);
				} else if (ordinal == 0) {
					System.out.println(seasons[seasons.length - 1]);
				} else {
					System.out.println(seasons[ordinal - 1]);
				}
			}

			if (!flag) {
				System.out.println("Такої пори року не існує");
			}
			break;

		}
		case "7": {
			for (Months mon : months) {
				if (mon.getDays() % 2 == 0) {
					System.out.println(mon);
				}
			}
			break;
		}
		case "8": {
			for (Months mon : months) {
				if (mon.getDays() % 2 != 0) {
					System.out.println(mon);
				}
			}
			break;
		}
		case "9": {

			System.out.println("Ввведіть місяць");
			String month = scanner.next().toUpperCase();

			boolean flag = false;

			for (Months mon : months) {
				if (mon.name().equals(month)) {
					flag = true;
				}
			}

			if (flag) {
				Months monthTwo = Months.valueOf(month);
				
				if (monthTwo.getDays() % 2 == 0) {
					System.out.println("Місяць має парну кількість днів");
				}else {
					System.out.println("Місяць має не парну кількість днів");
				}
			}
			if (!flag) {
				System.out.println("Такого місяця не існує");
			}
			break;
		}
		}
	}

	private static boolean isMonthPresent(Months[] months, String month) {
		boolean flag = false;

		for (Months m : months) {

			if (m.name().equals(month)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(Seasons[] seasons, String season) {
		boolean flag = false;

		for (Seasons s : seasons) {

			if (s.name().equals(season)) {
				flag = true;
			}
		}
		return flag;
	}
}
