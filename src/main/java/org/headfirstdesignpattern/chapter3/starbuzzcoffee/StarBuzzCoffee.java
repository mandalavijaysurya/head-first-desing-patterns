package org.headfirstdesignpattern.chapter3.starbuzzcoffee;

import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.Beverage;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.beverages.implementations.DarkRoast;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.implementations.Mocha;
import org.headfirstdesignpattern.chapter3.starbuzzcoffee.condiments.implementations.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println("Details of your order: ");
        System.out.println("Description: " + beverage.getDescription());
        System.out.println("Cost: " + beverage.cost());
    }
}
