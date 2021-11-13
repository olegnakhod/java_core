package academy.lgs.exercice_02;

import java.util.Comparator;

public class CommodityWidhtComparator implements Comparator<Commodity>{
	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getWidht() > o2.getWidht()) {
			return 1;
		} else if (o1.getWidht() < o2.getWidht()) {
			return -1;
		}
		return 0;
	}
}
