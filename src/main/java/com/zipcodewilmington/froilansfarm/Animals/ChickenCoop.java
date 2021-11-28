package com.zipcodewilmington.froilansfarm.Animals;

public class ChickenCoop {
    public Chicken[] coop1 = new Chicken[4];
    public Chicken[] coop2 = new Chicken[4];
    public Chicken[] coop3 = new Chicken[4];
    public Chicken[] coop4 = new Chicken[3];

    public void assignChickens(){
        for (int i = 0; i < 4; i++) {
            coop1[i] = new Chicken();
        }
        for (int i = 0; i < 4; i++) {
            coop2[i] = new Chicken();
        }
        for (int i = 0; i < 4; i++) {
            coop3[i] = new Chicken();
        }
        for (int i = 0; i < 3; i++) {
            coop4[i] = new Chicken();
        }
    }

}
