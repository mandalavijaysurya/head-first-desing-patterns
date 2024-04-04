package org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;

public class Decaf implements Beverage {

    private final String description;

    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
