package org.headfirstdesignpattern.chapter4.factory.products.cheesepizzas;

import org.headfirstdesignpattern.chapter4.factory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

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
