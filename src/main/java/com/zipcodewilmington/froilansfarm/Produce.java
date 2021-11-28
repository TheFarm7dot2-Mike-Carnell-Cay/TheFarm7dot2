package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Edible;

public interface Produce extends Edible {
    Boolean isFertilized = null;
    Boolean hasBeenHarvested = null;

    public Edible yield();
}
