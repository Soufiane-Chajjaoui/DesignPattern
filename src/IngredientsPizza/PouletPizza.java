package IngredientsPizza;

import RestaurantPizza.Pizza;

public class PouletPizza extends DecoratorPizza{

	public PouletPizza(Pizza p) {
		super(p);
 	}
	
	@Override
	public String Prepare() {
 		return pizza.Prepare() + " Poulet";
	}

	@Override
	public double CalPrix() {
		// TODO Auto-generated method stub
		return pizza.CalPrix() + 15;
	}
	
	

}
