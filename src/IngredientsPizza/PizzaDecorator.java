package IngredientsPizza;

import RestaurantPizza.Pizza;

public abstract class PizzaDecorator extends Pizza{
	protected Pizza pizza ;
	public PizzaDecorator(Pizza p) {
		this.pizza = p;
	}

	@Override
	public abstract String Prepare() ;

	@Override
	public abstract double CalPrix() ;
	
}
