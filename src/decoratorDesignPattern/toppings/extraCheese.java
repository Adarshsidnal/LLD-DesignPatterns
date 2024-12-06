package decoratorDesignPattern.toppings;

import decoratorDesignPattern.BasePizzas.BasePizza;

public class extraCheese extends ToppingDecorator {

	public extraCheese(BasePizza pizza) {
		super(pizza);
	}

	@Override
	public int cost() {
		return basePizza.cost()+200;
	}
	
	public void display() {
		System.out.println(basePizza.toString());
	}

}
