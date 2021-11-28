package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible;

public class Cornstalk extends Crop{
    public Edible yield() {
        if(hasBeenHarvested){
            earCorn corn = new earCorn();
            return corn;
        }
        return null;
    }
}
