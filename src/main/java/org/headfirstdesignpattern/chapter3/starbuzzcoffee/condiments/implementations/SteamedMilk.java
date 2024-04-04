package org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.CondimentsDecorator;

public class SteamedMilk extends CondimentsDecorator {

    private final Beverage beverage;
    private final String description;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
        this.description = "Steamed Milk";
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + description;
    }
}
