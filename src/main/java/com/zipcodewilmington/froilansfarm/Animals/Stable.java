package com.zipcodewilmington.froilansfarm.Animals;

public class Stable {
    public Horse[] stable1 = new Horse[4];
    public Horse[] stable2 = new Horse[4];
    public Horse[] stable3 = new Horse[2];

    public void assignHorses(){
        for (int i = 0; i < 4; i++) {
            stable1[i] = new Horse();
        }
        for (int i = 0; i < 4; i++) {
            stable2[i] = new Horse();
        }
        for (int i = 0; i < 2; i++) {
            stable3[i] = new Horse();
        }
    }
}
