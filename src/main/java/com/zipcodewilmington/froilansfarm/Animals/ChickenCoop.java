package com.zipcodewilmington.froilansfarm.Animals;

public class ChickenCoop {
    public Chicken[] Coop;

    public Chicken[] createCoop(int Chickens){
        Coop = new Chicken[Chickens];
        return Coop;
    }

    public void addChickens(int Chickens){
        for (int i = 0; i < Coop.length; i++) {
            Coop[i] = new Chicken();
        }
    }
    public Chicken getChicken(int Chicken){
        return Coop[Chicken];
    }
}
