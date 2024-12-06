package decoratorDesignPattern.BasePizzas;

public abstract class BasePizza {

    protected String name; // Corrected variable name and access modifier

    public BasePizza(String name) {
        this.name = name;
    }

    public abstract int cost(); // Abstract method for subclasses to implement

    public String getName() { // Getter for the pizza name
        return name;
    }

    @Override
    public String toString() { // Provides a meaningful string representation
        return "Pizza: " + name + ", Cost: " + cost();
    }
}
