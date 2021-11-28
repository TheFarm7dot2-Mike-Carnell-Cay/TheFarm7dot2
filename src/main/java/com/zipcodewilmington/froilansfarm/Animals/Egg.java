package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Egg extends Edible implements Produce {
    Boolean isFertilized = false;

    public Edible yield() {
        return null;
    }
}
