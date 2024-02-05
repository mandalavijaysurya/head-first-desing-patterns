package org.headfirstdesignpattern.chapter1.designpuzzle;

import org.headfirstdesignpattern.chapter1.designpuzzle.characters.Character;
import org.headfirstdesignpattern.chapter1.designpuzzle.characters.King;
import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.AxeBehaviour;

public class AdventureGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new AxeBehaviour());
        System.out.println("=========Changed Weapon=========");
        king.fight();
    }
}
