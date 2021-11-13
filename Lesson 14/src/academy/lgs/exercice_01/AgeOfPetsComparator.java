package academy.lgs.exercice_01;

import java.util.Comparator;

public class AgeOfPetsComparator implements Comparator<Pets>{

	@Override
	public int compare(Pets o1, Pets o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}

}
