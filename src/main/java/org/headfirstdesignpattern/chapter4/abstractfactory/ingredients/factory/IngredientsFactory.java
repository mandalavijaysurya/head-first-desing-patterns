package org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.veggie.Veggie;

public interface IngredientsFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createveggies();

    Pepperoni createPepperoni();

    Clams createClam();
}

