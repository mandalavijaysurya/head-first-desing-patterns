package org.headfirstdesignpattern.chapter4.factory.products.veggiepizzas;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;
public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thick and Bready crust";
        sauce = "Regular Tomato sauce";
        toppings.add("Basil with fired vegetables");
    }
}
