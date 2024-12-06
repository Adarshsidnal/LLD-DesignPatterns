package decoratorDesignPattern.toppings;

import decoratorDesignPattern.BasePizzas.BasePizza;

public abstract class ToppingDecorator extends BasePizza{
	protected BasePizza basePizza;
	public ToppingDecorator(BasePizza pizza) {
		super(pizza.getName());
		this.basePizza=pizza;
	}
	
	@Override
	public String toString() {
	    return basePizza.toString() + ", Topping: " + this.getClass().getSimpleName();
	}

}
