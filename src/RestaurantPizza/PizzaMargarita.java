package RestaurantPizza;

public class PizzaMargarita extends Pizza{

	@Override
	public String Prepare() {
		
		return "Pizza Margarita";
	}

	@Override
	public double CalPrix() {
 		return 40.0;
	}

}
