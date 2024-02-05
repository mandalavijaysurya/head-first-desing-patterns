package org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Wielding Sword");
    }
}
