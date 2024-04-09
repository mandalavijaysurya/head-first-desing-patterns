package org.headfirstdesignpattern.chapter4.factory.products;

import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.Sauce;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
