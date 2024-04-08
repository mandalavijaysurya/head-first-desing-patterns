package org.headfirstdesignpattern.chapter4.factory.products.cheesepizzas;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

import javax.xml.namespace.QName;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
       name = "Chicago Style Deep Dish Cheese Pizza";
       dough = "Extra Thick Crust Dough";
       sauce = "Plum Tomato Sauce";
       toppings.add("Shredded Mozzarella Cheese");

    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
