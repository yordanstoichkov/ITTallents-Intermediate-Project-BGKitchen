package Project.start;

import java.util.Comparator;

public class PriceComparator implements Comparator<Meal>{

	@Override
	public int compare(Meal o1, Meal o2) {
		return (int)(o1.getPrice()-o2.getPrice());
	}
}
