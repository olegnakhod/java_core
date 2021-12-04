package academy.lgs.exercice_01;

import java.lang.reflect.Field;

public class Aplication {
	public static void main(String[] args) {
		getAnnoationValue(Pats.class);
	}

	public static void getAnnoationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(Fielder.class) instanceof Fielder) {
				System.out.print(field.getName() + " ===>  ");
				System.out.println(" annotaion value = " + field.getAnnotation(Fielder.class).value());
			}
		}
	}
}
