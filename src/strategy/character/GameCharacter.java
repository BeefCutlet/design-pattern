package strategy.character;

import strategy.weapon.Weapon;

public class GameCharacter {

    //접근점
    private Weapon weapon;

    //무기 교환 가능
    public void setWeapon(final Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
