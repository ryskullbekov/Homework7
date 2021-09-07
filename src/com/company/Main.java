package com.company;

public class Main {

    public static void main(String[] args) {
	// Домашняя работа №7
        Warrior warrior = new Warrior(300,100,"Critical damage");
        System.out.println("Health " + warrior.getHealthHero() + " damage " + warrior.getDamageHero() + " typeAttack " + warrior.getTypeAttackHero());
        Magic magic = new Magic(200,75,"Hex");
        System.out.println("Health " + magic.getHealthHero() + " damage " + magic.getDamageHero() + " typeAttack " + magic.getTypeAttackHero());
        Medic medic = new Medic(200,20,"Hill");
        System.out.println("Health " + medic.getHealthHero() + " damage " + medic.getDamageHero() + " typeAttack " + medic.getTypeAttackHero());

        System.out.println(warrior.applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE"));
        System.out.println(magic.applySuperAbility("Magic применил суперспособность HEX"));
        System.out.println(medic.applySuperAbility("Medic применил суперспособность HILL"));

    }
}
