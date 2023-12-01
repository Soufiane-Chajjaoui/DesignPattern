package IngredientsPizza;

import RestaurantPizza.Pizza;

public abstract class DecoratorPizza extends Pizza{
	protected Pizza pizza ;
	public DecoratorPizza(Pizza p) {
		this.pizza = p;
	}

	@Override
	public abstract String Prepare() ;

	@Override
	public abstract double CalPrix() ;
	
}
