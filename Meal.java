package Project.start;

public class Meal implements Cloneable{
	private float price;

	public Meal(float price) {
		this.price=price;
	}

	public float getPrice() {
		return  price;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
