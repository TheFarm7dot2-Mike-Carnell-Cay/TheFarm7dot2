package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Edible;

public interface Produce extends Edible {
    Boolean isFertilized = false;
    Boolean hasBeenHarvested = false;

    public Edible yield();
}
