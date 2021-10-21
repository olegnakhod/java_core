package academy.lgs.exercice_02;

public class Aplication {

	public static void main(String[] args) {

		Animal animal = new Animal("Вовк",35,5 );
		
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
							+ "км/год, Вік тварини = " + animal.getAge() + " років ");
		
		System.out.println( "--------------------------------------------------------------------------");
		
		animal.setName("Слон");
		animal.setSpeed(20);
		animal.setAge(15);
		
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
		+ "км/год, Вік тварини = " + animal.getAge() + " років ");

	}

}
