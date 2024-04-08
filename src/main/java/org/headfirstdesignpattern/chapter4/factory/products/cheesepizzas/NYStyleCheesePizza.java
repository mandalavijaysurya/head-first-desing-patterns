package org.headfirstdesignpattern.chapter4.factory.products.cheesepizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "New-york Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
