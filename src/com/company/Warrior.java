package com.company;

public class Warrior extends Hero {

    public Warrior(int healthHero, int damageHero, String typeAttackHero) {
        super(healthHero, damageHero, typeAttackHero);
    }


    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }
}



