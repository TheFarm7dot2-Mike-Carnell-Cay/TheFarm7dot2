package com.zipcodewilmington.froilansfarm.Animals;

public class Stable {
    public Horse[] stable;

    public void addHorses(int horses){
        stable = new Horse[horses];
        for (int i = 0; i < stable.length; i++) {
            stable[i] = new Horse();
        }
    }
    public Horse getHorse(int horse){
        return stable[horse];
    }
}
