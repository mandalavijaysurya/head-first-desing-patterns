package org.headfirstdesignpattern.chapter4.factory.products.clampizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name = "New york style Clam pizza";
        dough = "Thin Crispy Dough";
        toppings.add("Clams");
    }
}
