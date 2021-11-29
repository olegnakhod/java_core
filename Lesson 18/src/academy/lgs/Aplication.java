package academy.lgs;

import java.util.List;
import java.util.Map;

public class Aplication {
	public static void main(String[] args) {
		//exercice 1
		List list = ListWithGenerics.createListWithGenerics().getList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		list.add("2");
		System.out.println(list);
		
		System.out.println("");
		
		//exercice 2
		MyEntry myEntry = new MyEntry();
		
		myEntry.addElementForMap("Andrey", 21);
		myEntry.addElementForMap("Ivan", 43);
		myEntry.addElementForMap("Mykola", 32);
		myEntry.addElementForMap("Olja", 28);
		myEntry.addElementForMap("Julja", 25);
		
		myEntry.outputAllMap();
		
		myEntry.removeElementForKey("Andrey");
		
		System.out.println();
		myEntry.outputAllMap();
		
		myEntry.removeElementForValue(43);
		
		System.out.println();
		myEntry.outputAllMap();
		
		System.out.println();
		myEntry.outputListValueForMap();
		
		System.out.println();
		myEntry.outputSetKeyForMap();
		
	}
}
