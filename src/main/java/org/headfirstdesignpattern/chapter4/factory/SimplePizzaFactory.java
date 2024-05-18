package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.enums.CrustType;
import org.headfirstdesignpattern.chapter4.factory.enums.PizzaType;
import org.headfirstdesignpattern.chapter4.factory.enums.SauceType;
import org.headfirstdesignpattern.chapter4.factory.enums.ToppingType;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type){
        return switch (type){
            case CHEESE -> new Pizza("Cheese Pizza", List.of(ToppingType.CHEESE, ToppingType.CLAM, ToppingType.MUSHROOM), CrustType.THIN_CRUST, SauceType.MARINARA);
            case CHICKEN -> new Pizza("Chicken Pizza", List.of(ToppingType.CHICKEN, ToppingType.CLAM, ToppingType.MUSHROOM), CrustType.THIN_CRUST, SauceType.MARINARA);
            case VEG -> new Pizza("Veg Pizza", List.of(ToppingType.BLACK_OLIVES, ToppingType.CLAM, ToppingType.MUSHROOM), CrustType.THIN_CRUST, SauceType.MARINARA);
        };
    }
}
