package decoratorDesignPattern;

import decoratorDesignPattern.BasePizzas.BasePizza;
import decoratorDesignPattern.BasePizzas.Margarita;
import decoratorDesignPattern.toppings.Mushroom;
import decoratorDesignPattern.toppings.extraCheese;

public class Driver {

	public static void main(String[] args) {
		    BasePizza pizza = new Margarita("Margarita");//200
	        pizza = new extraCheese(pizza); // Add Extra Cheese//200
	        pizza = new Mushroom(pizza);   // Add Mushroom

	        System.out.println(pizza); // Prints full description
	        System.out.println("Total Cost: " + pizza.cost());

	}

}
