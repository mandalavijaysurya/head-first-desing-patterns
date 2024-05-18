package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.enums.CrustType;
import org.headfirstdesignpattern.chapter4.factory.enums.SauceType;
import org.headfirstdesignpattern.chapter4.factory.enums.ToppingType;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class Pizza {
    private final String name;
    private final List<ToppingType> toppings;
    private final CrustType crust;
    private final SauceType sauce;

    public Pizza(String name, List<ToppingType> toppings, CrustType crust, SauceType sauce) {
        this.name = name;
        this.toppings = toppings;
        this.crust = crust;
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public List<ToppingType> getToppings() {
        return toppings;
    }

    public CrustType getCrust() {
        return crust;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public void bake(){
        System.out.println("Baking pizza at 250°F....");
    }

    public void pack(){
        System.out.println("Packing has been done and pizza is ready to delivery!...");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", crust=" + crust +
                ", sauce=" + sauce +
                '}';
    }
}
