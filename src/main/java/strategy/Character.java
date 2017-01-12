package strategy;

import strategy.weapon.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
        weaponBehavior.useWeapon();
    }
}
