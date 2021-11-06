package academy.lgs.exercice_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Aplication {

	public static void main(String[] args) {

		Random random = new Random();
		Integer[] array = new Integer[random.nextInt(15)];
		Arrays.fill(array, 0);

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(array));
		
		System.out.println("After sorting:");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
	}

}
