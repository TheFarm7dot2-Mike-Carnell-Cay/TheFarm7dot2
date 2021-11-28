package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop implements Produce {
    Boolean isFertilized = false;
    public void Fertilize(){
        isFertilized = true;
    }
}
