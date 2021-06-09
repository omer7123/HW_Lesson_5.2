package com.company;

public class Main {

    public static Boss boss = new Boss(50, 500, 20);
    public static Magic_Door door = new Magic_Door();

    public static void main(String[] args) {
        FightInfo();
       /* while (!Finished()) {
            heroesHit();
            bossHit();
            FightInfo();
        }*/
        System.out.println(door.people()[0].getHealthHero() - boss.getBossDamage());


    }


    public static void heroesHit() {
        for (int i = 0; i < door.people().length; i++) {
            if (door.people()[i].getDamageHero() > 0) {

                if (boss.getBossHealth() - door.people()[i].getDamageHero() < 0) {
                    boss.setBossHealth(0);
                } else {
                    boss.setBossHealth(boss.getBossHealth() - door.people()[i].getDamageHero() - door.people()[i].getAttackTypeHero());

                }
            }

        }
    }

    public static void bossHit() {
        if (boss.getBossHealth() > 0) {

            for (int i = 0; i < door.people().length; i++) {
                if (door.people()[i].getHealthHero() - boss.getBossDamage() < 0) {
                    door.people()[i].setHealthHero(0);
                } else {
                    door.people()[i].setHealthHero(door.people()[i].getHealthHero() - boss.getBossDamage());
                    door.people()[i].setHealthHero(door.people()[i].getHealthHero() + door.people()[i].getAttackTypeHero());
                    System.out.println(door.people()[i].getName() + " отразил урон: " +
                            door.people()[i].getAttackTypeHero() + " и перенаправил на босса");
                }
            }
        }
    }

    public static boolean Finished() {
        for (int i = 0; i < door.people().length; i++) {
            if (boss.getBossHealth() <= 0) {
                System.out.println("Heroes Win");

                return true;
            } else if (door.people()[i].getHealthHero() <= 0) {
                System.out.println("Boss Win");
                return true;
            }
        }
        return false;
    }

    public static void FightInfo() {
        /*      System.out.println("_".repeat(20));
        System.out.println("Здоровье героя: " + door.people()[0].getHealthHero());
        System.out.println("Здоровье босса: " + boss.getBossHealth());
        System.out.println("_".repeat(20));
*/
        System.out.println("_".repeat(20));

        for (int i = 0; i < door.people().length; i++) {

            System.out.println(door.people()[i].getName() + " Здоровье " + door.people()[i].getHealthHero());
        }
        System.out.println(boss.getBossHealth());
        System.out.println("_".repeat(20));

    }
}