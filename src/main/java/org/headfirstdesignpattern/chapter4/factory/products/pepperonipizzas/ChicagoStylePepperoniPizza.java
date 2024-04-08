package org.headfirstdesignpattern.chapter4.factory.products.pepperonipizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Thick and Bready Dough";
        sauce = "Thick Tomato Sauce";
        toppings.add("Pepperoni with Mozzarella(double layer)");
    }
}
