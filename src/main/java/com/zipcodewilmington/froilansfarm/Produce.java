package com.zipcodewilmington.froilansfarm;

public interface Produce {
    Boolean isFertilized = null;
    Boolean hasBeenHarvested = null;

    public Edible yield();
}
