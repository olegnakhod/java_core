package academy.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ZooClub {

	private Map<Person, ArrayList<Animal>> map = new HashMap<Person, ArrayList<Animal>>();

	public ZooClub() {
		map.put(new Person("Oleg", 28), new ArrayList<Animal>());
		map.put(new Person("Natalia", 33), new ArrayList<Animal>());

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase("oleg")) {
				List<Animal> value = next.getValue();
				value.add(new Animal("Dog", "Lola"));
				value.add(new Animal("Cat", "Asaja"));
			} else if (next.getKey().getName().equalsIgnoreCase("natalia")) {
				List<Animal> value = next.getValue();
				value.add(new Animal("Dog", "Betti"));
				value.add(new Animal("Fish", "Luna"));
			}
		}

	}

	public Map<Person, ArrayList<Animal>> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "ZooClub" + map;
	}

}
