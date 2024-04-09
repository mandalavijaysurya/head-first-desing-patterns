package org.headfirstdesignpattern.chapter4.factory.ingredients.factory;

import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.Veggie;

public interface IngredientsFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createveggies();

    Pepperoni createPepperoni();

    Clams createClam();
}

