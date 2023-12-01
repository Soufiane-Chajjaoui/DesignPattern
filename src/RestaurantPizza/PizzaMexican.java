package RestaurantPizza;

public class PizzaMexican extends Pizza{

	@Override
	public String Prepare() {
		
		return "Pizza Mexican";
	}

	@Override
	public double CalPrix() {
 		return 50.0;
	}
	
}
