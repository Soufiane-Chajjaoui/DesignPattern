package IngredientsPizza;

import RestaurantPizza.Pizza;

public class Fromage extends PizzaDecorator{
	
	public Fromage(Pizza pizza) {
		super(pizza);
 	}

	@Override
	public String Prepare() {
		
		return pizza.Prepare() + " fromage";
	}

	@Override
	public double CalPrix() {
 		return pizza.CalPrix() + 5;
	}

}
