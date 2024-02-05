package org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours;

public class BowAndArrowBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Using bow and arrow");
    }
}
