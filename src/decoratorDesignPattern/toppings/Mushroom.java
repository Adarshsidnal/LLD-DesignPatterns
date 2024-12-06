package decoratorDesignPattern.toppings;

import decoratorDesignPattern.BasePizzas.BasePizza;

public class Mushroom extends ToppingDecorator {

	public Mushroom(BasePizza pizza) {
		super(pizza);
		
	}
	@Override
	public int cost() {
		return basePizza.cost()+125;
	}
	
	public void display() {
		System.out.println(basePizza.toString());
	}

}
