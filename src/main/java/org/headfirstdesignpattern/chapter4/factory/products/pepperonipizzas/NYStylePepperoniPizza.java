package org.headfirstdesignpattern.chapter4.factory.products.pepperonipizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "New-york Style Pepperoni Pizza";
        dough = "Thin Crush Dough";
        sauce = "Tomato Sauce";
        toppings.add("Pepperoni with Sprinkle of Grated Parmesan cheese");
    }
}
