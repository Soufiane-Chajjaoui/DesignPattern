package IngredientsPizza;

import RestaurantPizza.Pizza;

public class Champinon extends PizzaDecorator{

	public Champinon(Pizza p) {
		super(p);
 	}
	
	@Override
	public String Prepare() {
 		return pizza.Prepare() + " Champinon";
	}

	@Override
	public double CalPrix() {
		// TODO Auto-generated method stub
		return pizza.CalPrix() + 15;
	}
	
	

}
