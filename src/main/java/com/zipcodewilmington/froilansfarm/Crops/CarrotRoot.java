package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible;

public class CarrotRoot extends Crop{
    public Edible yield() {
        if(hasBeenHarvested){
            carrot carrot = new carrot();
            return carrot;
        }
        return null;
    }
}
