package com.company;

public class Magic extends Hero {

    public Magic(int healthHero, int damageHero, String typeAttackHero) {
        super(healthHero, damageHero, typeAttackHero);


    }

    @Override
    public String applySuperAbility(String superAbilityType) {


        return superAbilityType;
    }
}
