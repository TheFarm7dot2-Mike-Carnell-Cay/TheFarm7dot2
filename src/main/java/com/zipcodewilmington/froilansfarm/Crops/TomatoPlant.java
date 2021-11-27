package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible;

public class TomatoPlant extends Crop{
    public Edible yield() {
        if(hasBeenHarvested){
            tomato tomato = new tomato();
            return tomato;
        }
        return null;
    }
}
