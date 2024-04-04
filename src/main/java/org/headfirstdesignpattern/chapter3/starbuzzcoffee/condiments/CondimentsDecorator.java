package org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;

public abstract class CondimentsDecorator implements Beverage {
    private Beverage beverage;

    public abstract String getDescription();
}
