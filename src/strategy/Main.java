package strategy;

import strategy.character.GameCharacter;
import strategy.weapon.Axe;
import strategy.weapon.Knife;
import strategy.weapon.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
