package decoratorDesignPattern.BasePizzas;

public class Pizza extends BasePizza {

	public Pizza(String name) {
		super(name);
	}

	@Override
	public int cost() {
		return 300;
	}
	
	

}
