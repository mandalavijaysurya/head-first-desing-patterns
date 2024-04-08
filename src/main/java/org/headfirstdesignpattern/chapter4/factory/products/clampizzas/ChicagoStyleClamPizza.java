package org.headfirstdesignpattern.chapter4.factory.products.clampizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam Pizza";
        dough = "Thick Crust Dough";
        toppings.add("Roasted Red Peppers");
    }
}
