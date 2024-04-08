package org.headfirstdesignpattern.chapter4.factory.products.veggiepizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "New-york Style Sauce and Cheese Pizza";
        dough = "Thin Crush Dough";
        sauce = "Marinara Sauce";
        toppings.add("Oregano and basil");
    }

}
