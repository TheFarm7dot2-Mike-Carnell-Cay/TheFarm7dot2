package com.zipcodewilmington.froilansfarm.Crops;

public class Cornstalk extends Crop{
    public earCorn yield() {
        if(!hasBeenHarvested && isFertilized){
            earCorn corn = new earCorn();
            return corn;
        }
        return null;
    }
}
