package org.headfirstdesignpattern.chapter1.designpuzzle.characters;

import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.KnifeBehaviour;

public class Queen extends Character{

    public Queen(){
        weapon = new KnifeBehaviour();
    }
    @Override
    public void fight() {
        System.out.println("Queen is fighting");
    }
}
