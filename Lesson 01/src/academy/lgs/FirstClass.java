package academy.lgs;

public class FirstClass {
	public static void main(String[] args) {

		byte by = 1;
		short sh = 2;
		int i = 1;
		long l = 10L;
		double d = 0.1;
		float f = 0.01f;
		char ch = 'a';
		boolean b = true;
		maxValues();
		minValues();
		maxAndMinValuesInMassive(10);
	}

	static void maxValues() {
		System.out.println("max value Byte = " + Byte.MAX_VALUE);
		System.out.println("max value Short = " + Short.MAX_VALUE);
		System.out.println("max value Integer = " + Integer.MAX_VALUE);
		System.out.println("max value Integer = " + Long.MAX_VALUE);
		System.out.println("max value Long = " + Double.MAX_VALUE);
		System.out.println("max value Float = " + Float.MAX_VALUE);

	}

	static void minValues() {
		System.out.println("min value Byte = " + Byte.MIN_VALUE);
		System.out.println("min value Short = " + Short.MIN_VALUE);
		System.out.println("min value Integer = " + Integer.MIN_VALUE);
		System.out.println("min value Integer = " + Long.MIN_VALUE);
		System.out.println("min value Long = " + Double.MIN_VALUE);
		System.out.println("min value Float = " + Float.MIN_VALUE);
		System.out.println("");
	}

	public static void maxAndMinValuesInMassive(int sizeMassive) {
		int[] args = { 1, 22343, 436, 346, 7456, 679632465, 23, 586, 23, 7696, 12, 4587, 12, 465845 };

		int min = args[0];
		for (int i = 1; i < args.length; i++) {
			if (min > args[i]) {
				min = args[i];
			}
		}
		System.out.println("Мінімальне значення масиву = " + min);

		int max = args[0];
		for (int i = 1; i < args.length; i++) {
			if (max < args[i]) {
				max = args[i];
			}
		}
		System.out.println("Максимальнне значення масиву = " + max);
	}

}
