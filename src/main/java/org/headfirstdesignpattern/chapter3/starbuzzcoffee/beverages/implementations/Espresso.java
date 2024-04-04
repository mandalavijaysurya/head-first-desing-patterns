package org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;

public class Espresso implements Beverage {

    private final String description;

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
