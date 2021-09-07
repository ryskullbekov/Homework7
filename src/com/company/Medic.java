package com.company;

public class Medic extends Hero {
    public Medic(int healthHero, int damageHero, String typeAttackHero) {
        super(healthHero, damageHero, typeAttackHero);
    }


    @Override
    public String applySuperAbility(String superAbilityType) {


        return superAbilityType;
    }
}

