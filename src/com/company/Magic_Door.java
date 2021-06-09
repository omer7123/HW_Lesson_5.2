package com.company;

public class Magic_Door {

    //public void Players() {
    public  Hero[] people() {
        Hero Geralt = new Hero(5, 100, 10, "Warrior");
        Hero Geralt1 = new Hero(5, 100, 10, "Mental");
        Hero Geralt2 = new Hero(5, 100, 10, "Mechnik");
        Hero Geralt3 = new Hero(5, 100, 10, "Magical");
        Hero[] array = {Geralt, Geralt1, Geralt2, Geralt3};
        return array;

    }

    //}
}
