package org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours;

public class AxeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Wielding axe");
    }
}
