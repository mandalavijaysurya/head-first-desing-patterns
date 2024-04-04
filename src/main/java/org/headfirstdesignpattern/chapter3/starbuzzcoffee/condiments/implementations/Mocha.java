package org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.CondimentsDecorator;

public class Mocha extends CondimentsDecorator {

    private final Beverage beverage;
    private final String description;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.description = "Mocha";
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + description;
    }
}
