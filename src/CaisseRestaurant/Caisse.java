package CaisseRestaurant;

import IngredientsPizza.*;
import RestaurantPizza.*;

public class Caisse {
	
	public static void main(String[] args) {
		

		System.out.println("________Pizza 1________");
		
		Pizza pizza1 ;
		pizza1 = new PizzaMargarita();
		
		System.out.println(pizza1.CalPrix());
		System.out.println(pizza1.Prepare());
		
		pizza1 = new Fromage(pizza1) ;
		System.out.println(pizza1.CalPrix());
		System.out.println(pizza1.Prepare());

		pizza1 = new Champinon(pizza1);
		System.out.println(pizza1.CalPrix());
		System.out.println(pizza1.Prepare());
		

		System.out.println("________Pizza 2________");

		Pizza pizza2 ;
		pizza2 = new PizzaMexican();
		
		System.out.println(pizza2.CalPrix());
		System.out.println(pizza2.Prepare());

		pizza2 = new Pepperoni(pizza2);
		System.out.println(pizza2.CalPrix());
		System.out.println(pizza2.Prepare());
		
		pizza2 = new Fromage(pizza2) ;
		System.out.println(pizza2.CalPrix());
		System.out.println(pizza2.Prepare());


	}
}
