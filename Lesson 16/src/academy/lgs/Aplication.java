package academy.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Aplication {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class dog = Dog.class;

		String nameOfClass = dog.getName();
		System.out.println("Name of class = " + nameOfClass);

		String simpleName = dog.getSimpleName();
		System.out.println("Simple name  =  " + simpleName);

		int modifier = dog.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("Class modifier = " + modifierText + " int = " + modifier);

		Package classPackage = dog.getPackage();
		System.out.println("Package of current class = " + classPackage);

		Class superClass = dog.getSuperclass();
		System.out.println("Super class = " + superClass);

		Class[] interfaces = dog.getInterfaces();
		System.out.println("Interfaces =  " + Arrays.toString(interfaces));

		Constructor<Dog>[] dogsConstructors = dog.getConstructors();
		for (Constructor<Dog> constructor : dogsConstructors) {
			System.out.println(constructor);
		}

		Constructor<Dog> dogsConstructor = dogsConstructors[1];

		Parameter[] parameters = dogsConstructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter);
		}
			
		Constructor<Dog> singleConstructor = dog.getConstructor(String.class,int.class,int.class);
		Dog newIstanse = singleConstructor.newInstance("Lola", 4,1);
		System.out.println("reflection Dog = " + newIstanse);
		
		Field[] fields = dog.getFields();
		for (Field field2 : fields) {
			System.out.println(field2);
		}
			
		System.out.println();
		fields = dog.getDeclaredFields();
		for (Field field2 : fields) {
			System.out.println(field2);
		}
		
		Field privateLastNameField = fields[2];
		privateLastNameField.setAccessible(true);
		privateLastNameField.set(newIstanse , 100);
		System.out.println("Person new age" + newIstanse );
		
		Method[] methodsDog = dog.getDeclaredMethods();
		for (int i = 0; i < methodsDog.length; i++) {
			Method method = methodsDog[i];
			int number = i;
			System.out.println(number + "--->" + method);
		}

	
	    Method callMethodOne = dog.getMethod("myMethod", String.class,int.class);
		Object refMethod1 = callMethodOne.invoke(callMethodOne, "Lola", 10);
		System.out.println(refMethod1);
		
		Method callMethodTwo = dog.getMethod("myMethod", String.class);
		Object refMethod2 = callMethodTwo.invoke(callMethodTwo, "Lola");
		System.out.println(refMethod2);
		
	}

}
