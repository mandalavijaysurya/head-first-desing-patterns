package org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;

public class HouseBlend implements Beverage {
    private final String description;

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
