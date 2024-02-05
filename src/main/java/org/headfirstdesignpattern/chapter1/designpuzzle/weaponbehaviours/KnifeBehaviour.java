package org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Using Knife");
    }
}
