package org.headfirstdesignpattern.chapter1.designpuzzle.characters;

import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.WeaponBehaviour;

public abstract class Character {
    protected WeaponBehaviour weapon;
    public abstract void fight();

    public void setWeapon(WeaponBehaviour wb){
        weapon = wb;
    }
}
