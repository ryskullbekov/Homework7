package com.company;

public class Main {


    public static void main(String[] args) {
        // Домашняя работа №7
        Warrior warrior = new Warrior(300, 100, "Critical damage");
        System.out.println("Health " + warrior.getHealthHero() + " damage " + warrior.getDamageHero() + " typeAttack " + warrior.getTypeAttackHero());
        Magic magic = new Magic(200, 75, "Hex");
        System.out.println("Health " + magic.getHealthHero() + " damage " + magic.getDamageHero() + " typeAttack " + magic.getTypeAttackHero());
        Medic medic = new Medic(200, 20, "Hill");
        System.out.println("Health " + medic.getHealthHero() + " damage " + medic.getDamageHero() + " typeAttack " + medic.getTypeAttackHero());

//        System.out.println(warrior.applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE"));
//        System.out.println(magic.applySuperAbility("Magic применил суперспособность HEX"));
//        System.out.println(medic.applySuperAbility("Medic применил суперспособность HILL"));

        Hero[] heroes = {warrior, magic, medic};
        for (int i = 2; i < heroes.length; i++) {
            heroesAll(heroes[i]);


        }
    }

    public static void heroesAll(Hero heroes) {
        System.out.println(heroes.applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE"));
        System.out.println(heroes.applySuperAbility("Magic применил суперспособность HEX"));
        System.out.println(heroes.applySuperAbility("Medic применил суперспособность HILL"));

    }
    }


