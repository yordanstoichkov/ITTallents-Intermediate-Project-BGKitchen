package Project.start;

import java.util.Set;
import java.util.TreeSet;

public class Cart implements ICart {
	private float sum;
	private Set<Meal> melasToOrder = new TreeSet<Meal>(new PriceComparator());



	@Override
	public void addMeal(Meal meal) throws CartException{
		if(meal!=null){
			try {
				Meal orderMeal = (Meal) meal.clone();
				melasToOrder.add(orderMeal);
				sum+=orderMeal.getPrice();
			} catch (CloneNotSupportedException e) {
				throw new CartException("Something went wrong during addiong your meal");
			}
		}else{
			throw new CartException("This is not a legal meal to be added");
		}
	}


	@Override
	public void removeMeal(Meal meal) throws CartException{
		if(meal!=null&&melasToOrder.contains(meal)){
			melasToOrder.remove(meal);
			sum-=meal.getPrice();
		}else{
			throw new CartException("There is not such a meal to be removed");
		}
	}


	@Override
	public void removeAll(){
		melasToOrder.removeAll(melasToOrder);
	}


	@Override
	public float getSum() {
		return sum;
		
	}

	public Set<Meal> getMelasToOrder() {
		return melasToOrder;
	}

	
//	
//	public void addIngridiant(Ingidiant ingridiant){
//		
//	}

}
