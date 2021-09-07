package com.company;

public abstract class Hero implements HavingSuperAbility {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }

    private int healthHero;
    private int damageHero;
    private String typeAttackHero;

    public Hero(int healthHero,int damageHero,String typeAttackHero){
        this.healthHero = healthHero;
        this.damageHero = damageHero;
        this.typeAttackHero = typeAttackHero;
    }



    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }

    public String getTypeAttackHero() {
        return typeAttackHero;
    }

    public void setTypeAttackHero(String typeAttackHero) {
        this.typeAttackHero = typeAttackHero;
    }



    }





