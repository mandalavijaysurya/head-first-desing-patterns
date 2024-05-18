package org.headfirstdesignpattern.chapter4.abstractfactory.products;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;

public class CheesePizza extends Pizza {
    IngredientsFactory ingredientsFactory;
    public CheesePizza(IngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}
