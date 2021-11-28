package com.zipcodewilmington.froilansfarm.Animals;

public class Stable {
    public Horse[] stable;

    public Horse[] createStable(int horses){
        stable = new Horse[horses];
        return stable;
    }

    public void addHorses(int horses){
        for (int i = 0; i < stable.length; i++) {
            stable[i] = new Horse();
        }
    }
    public Horse getHorse(int horse){
        return stable[horse];
    }
}
