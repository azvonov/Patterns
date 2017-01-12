package strategy;

import strategy.Character;
import strategy.Knight;
import strategy.weapon.BowAndArrowBehavior;
import strategy.weapon.SwordBehavior;

public class Main {

    public static void main(String[] args) {

        Character character = new Knight();
        character.setWeapon(new SwordBehavior());
        character.fight();
        character.setWeapon(new BowAndArrowBehavior());
        character.fight();
    }
}
