package academy.lgs.exercice_03;

public class Aplication {

	public static void main(String[] args) {
		MyArrayList<String> array= new MyArrayList<String>();
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		array.add("E");
		array.add("F");
		array.add("G");
		array.add("H");
		array.add("I");

		System.out.println(array);
		
		array.remove(2);
		
		System.out.println(array);
		
	}

}
