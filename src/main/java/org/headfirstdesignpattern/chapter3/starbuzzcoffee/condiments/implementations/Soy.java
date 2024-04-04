package org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.implementations;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.CondimentsDecorator;

public class Soy extends CondimentsDecorator {
    private final Beverage beverage;
    private final String description;

    public Soy(Beverage beverage){
        this.beverage = beverage;
        this.description = "Soy";
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + description;
    }
}
