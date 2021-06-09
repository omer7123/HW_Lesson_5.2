package com.company;

public class Hero {
    private int damageHero;
    private int healthHero;
    private int attackTypeHero;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero (){

    }

    public Hero(int damageHero, int healthHero, int attackTypeHero, String name) {
        this.damageHero = damageHero;
        this.healthHero = healthHero;
        this.attackTypeHero = attackTypeHero;
        this.name = name;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        if (damageHero < 0) {
            System.out.println("Урон героя не может быть отрицательным ");
        } else {
            this.damageHero = damageHero;
        }

    }

    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
       /* if (healthHero < 0) {
            System.out.println("Здоровье героя не может равняться нулю");
        } else {*/
        this.healthHero = healthHero;
        //}

    }

    public int getAttackTypeHero() {
        return attackTypeHero;
    }

    public void setAttackTypeHero(int attackTypeHero) {
        if (attackTypeHero < 0) {
            System.out.println("Суперспособность героя не может быть меньше нуля");
        } else {
            this.attackTypeHero = attackTypeHero;
        }

    }
}
