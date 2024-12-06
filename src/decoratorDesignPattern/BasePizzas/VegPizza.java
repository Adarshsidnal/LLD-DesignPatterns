package decoratorDesignPattern.BasePizzas;

public class VegPizza extends BasePizza {

    public VegPizza(String name) {
        super(name); 
    }

    @Override
    public int cost() {
        return 100;
    }
}
