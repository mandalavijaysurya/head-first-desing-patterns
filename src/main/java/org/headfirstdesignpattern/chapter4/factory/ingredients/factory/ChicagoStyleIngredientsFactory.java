package org.headfirstdesignpattern.chapter4.factory.ingredients.factory;

import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.MozzarellaCheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.FrozenClams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.ThickCrustDough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.SlicedPepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.PlumTomatoSauce;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.BlackOlives;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.EggPlant;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.Spinach;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.Veggie;

public class ChicagoStyleIngredientsFactory implements IngredientsFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createveggies() {
        return new Veggie[]{new Spinach(), new BlackOlives(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
