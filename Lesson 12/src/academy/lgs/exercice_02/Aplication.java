/*
 * NAKHOD OLEG test file
 * 
 * */

package academy.lgs.exercice_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @since java 1.8
 * @author Oleg Nakhod
 * @version 1.1
 */

public class Aplication {

	public static List<Months> months = Arrays.asList(Months.values());
	public static List<Seasons> seasons = Arrays.asList(Seasons.values());
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerInCase = new Scanner(System.in);

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		menu();
		FinderMonths(months, seasons, scanner);
//		System.out.println(months);

	}

	/**
	 * @param Months[] months, Seasons[] seasons, Scanner scanner
	 * @exception WrongInputConsoleParametersException
	 * @author Oleg Nakhod
	 * @return null
	 * @see console programm
	 */

	private static void FinderMonths(List<Months> months, List<Seasons> seasons, Scanner scanner)
			throws WrongInputConsoleParametersException {
		boolean switchCycle = true;
		while (switchCycle) {
			int menuLink = scanner.nextInt();
			if (menuLink >= 0 && menuLink <= 9) {
				switch (menuLink) {
				case 0: {
					System.out.println("Ввведіть місяць");
					String month = scannerInCase.next().toUpperCase();

					boolean flag = isMonthPresent(months, month);

					if (flag) {
						System.out.println("Місяця із такою назвою існує");
					} else if (!flag) {
						System.out.println("Місяця із такою назвою не існує");
					}
					break;
				}
				case 1: {
					System.out.println("Введіть пору року");
					String seasonSc = scannerInCase.next().toUpperCase();

					boolean flag = isSeasonPresent(seasons, seasonSc);

					if (flag) {
						for (int i = 0; i < months.size(); i++) {
							if (months.get(i).getSeason().toString().equals(seasonSc)) {
								System.out.println(months.get(i));
							}
						}
					}

					if (!flag) {
						System.out.println("Пори року із такою назвою не існує");
					}
					break;

				}
				case 2: {

					System.out.println("Введіть кількість днів");
					int daysSc = scannerInCase.nextInt();

					boolean flag = false;

					flag = isDaysPresent(months, daysSc);

					if (flag) {
						for (int i = 0; i < months.size(); i++) {
							if (months.get(i).getDays() == daysSc) {
								System.out.println(months.get(i));
							}
						}
					}

					if (!flag) {
						System.out.println("Місяця із такою кількістю днів не існує");
					}
					break;

				}
				case 3: {

					System.out.println("Введіть кількість днів");
					int daysSc = scannerInCase.nextInt();

					boolean flag = false;
					int count = 0;

					flag = isDaysPresent(months, daysSc);

					if (flag) {
						for (int i = 0; i < months.size(); i++) {
							if (months.get(i).getDays() == daysSc) {
								System.out.println(months.get(i));
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
				case 4: {

					System.out.println("Введіть кількість днів");
					int daysSc = scannerInCase.nextInt();

					boolean flag = isDaysPresent(months, daysSc);
					int count = 0;

					if (flag) {
						for (int i = 0; i > months.size(); i++) {
							if (months.get(i).getDays() == daysSc) {
								System.out.println(months.get(i));
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
				case 5: {

					System.out.println("Введіть пору року");
					String seasonSc = scannerInCase.next().toUpperCase();

					boolean flag = isSeasonPresent(seasons, seasonSc);

					if (flag) {

						Seasons seasonTwo = Seasons.valueOf(seasonSc);
						int ordinal = seasonTwo.ordinal();

						if (ordinal == (seasons.size() - 1)) {
							ordinal = 0;
							System.out.println(seasons.get(ordinal));
						} else {
							System.out.println(seasons.get(ordinal + 1));
						}
					}

					if (!flag) {
						System.out.println("Такої пори року не існує");
					}
					break;

				}
				case 6: {

					System.out.println("Введіть пору року");
					String seasonSc = scannerInCase.next().toUpperCase();

					boolean flag = isSeasonPresent(seasons, seasonSc);

					if (flag) {
						Seasons seasonTwo = Seasons.valueOf(seasonSc);
						int ordinal = seasonTwo.ordinal();

						if (ordinal == (seasons.size())) {
							ordinal = ordinal - 1;
							System.out.println(seasons.get(ordinal));
						} else if (ordinal == 0) {
							System.out.println(seasons.get(seasons.size() - 1));
						} else {
							System.out.println(seasons.size() - 1);
						}
					}

					if (!flag) {
						System.out.println("Такої пори року не існує");
					}
					break;

				}
				case 7: {
					for (int i = 0; i < months.size(); i++) {
						if (months.get(i).getDays() % 2 == 0) {
							System.out.println(months.get(i));
						}
					}
					break;
				}
				case 8: {
					for (int i = 0; i < months.size(); i++) {
						if (months.get(i).getDays() % 2 != 0) {
							System.out.println(months.get(i));
						}
					}
					break;
				}
				case 9: {

					System.out.println("Ввведіть місяць");
					String month = scannerInCase.next().toUpperCase();

					boolean flag = isMonthPresent(months, month);

					if (flag) {
						Months monthTwo = Months.valueOf(month);

						if (monthTwo.getDays() % 2 == 0) {
							System.out.println("Місяць має парну кількість днів");
						} else {
							System.out.println("Місяць має не парну кількість днів");
						}
					}
					if (!flag) {
						System.out.println("Такого місяця не існує");
					}
					break;
				}
				case 10: {
					switchCycle = false;
				}
				}

			} else {
				String massage = "Введіть число в межах 0 та 9 включно";
				throw new WrongInputConsoleParametersException(massage);
			}
		}

	}

	/* This method it is starting dialogue this application */

	private static void menu() {

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
		System.out.println("Натисніть 10, щоб вийти із програми");
	}

	private static boolean isMonthPresent(List<Months> months, String month) {
		boolean flag = false;

		for (int i = 0; i < months.size(); i++) {
			if (months.get(i).toString().equals(month)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(List<Seasons> seasons, String season) {
		boolean flag = false;

		for (int i = 0; i < seasons.size(); i++) {
			if (seasons.get(i).toString().equals(season)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isDaysPresent(List<Months> months, int daysSc) {
		boolean flag = false;
		for (int i = 0; i < months.size(); i++) {
			if (months.get(i).getDays() == daysSc) {
				flag = true;
				;
			}
		}
		return flag;
	}

}
