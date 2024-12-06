package decoratorDesignPattern.BasePizzas;

public class Margarita extends BasePizza {

	public Margarita(String Name) {
		super(Name);
	}
	
	@Override 
	public int cost() {
		return 200;
	}

}
