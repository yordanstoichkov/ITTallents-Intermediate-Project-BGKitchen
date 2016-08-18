package Project.start;

public class Demo {
	public static void main(String[] args) {
		Site sys = new Site("bg kitchen");
		
		try {
	
			sys.registerUser("goshot", "pecataetup", "asma@amsc.com");
			Meal pileSOriz = new Meal(7.50f);
			
			User me = sys.logInUser("goshot", "pecataetup");
			Cart myCart = (Cart) me.getCart();
			myCart.addMeal(pileSOriz);
			myCart.removeMeal(pileSOriz);
			System.out.println(myCart.getSum());
			
			System.out.println(myCart.getMelasToOrder());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
