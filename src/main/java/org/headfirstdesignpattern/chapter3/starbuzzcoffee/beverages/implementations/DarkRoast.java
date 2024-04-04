package org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;

public class DarkRoast implements Beverage {
    private final String description;

    public DarkRoast(){
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
