package CaisseRestaurant;

import IngredientsPizza.FromagePizza;
import IngredientsPizza.PouletPizza;
import RestaurantPizza.Pizza;
import RestaurantPizza.PizzaMargarita;

public class Caisse {
	
	public static void main(String[] args) {
		Pizza pizza ;
		pizza = new PizzaMargarita();
		
		System.out.println( pizza.CalPrix());
		System.out.println(pizza.Prepare());
		
		pizza = new FromagePizza(pizza) ;
		System.out.println(pizza.CalPrix());
		System.out.println(pizza.Prepare());

		pizza = new PouletPizza(pizza);
		
		System.out.println(pizza.CalPrix());
		System.out.println(pizza.Prepare());

		pizza = new PouletPizza(pizza);
		pizza = new PouletPizza(pizza);

		System.out.println(pizza.CalPrix());
		System.out.println(pizza.Prepare());


	}
}
