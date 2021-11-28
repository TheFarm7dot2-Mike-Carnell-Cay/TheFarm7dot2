package com.zipcodewilmington.froilansfarm.Crops;

public class Cornstalk extends Crop{
    public earCorn yield() {
        if(hasBeenHarvested){
            earCorn corn = new earCorn();
            return corn;
        }
        return null;
    }
}
