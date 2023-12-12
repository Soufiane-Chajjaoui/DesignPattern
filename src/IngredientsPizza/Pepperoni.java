package IngredientsPizza;

import RestaurantPizza.Pizza;

public class Pepperoni extends PizzaDecorator{
	
	public Pepperoni(Pizza p) {
		super(p);
 	}
	
	@Override
	public String Prepare() {
 		return pizza.Prepare() + " Pepperoni";
	}

	@Override
	public double CalPrix() {
		return pizza.CalPrix() + 2.5;
	}
}
