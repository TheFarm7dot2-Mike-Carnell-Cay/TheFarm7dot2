package com.zipcodewilmington.froilansfarm.Crops;

public class CarrotRoot extends Crop{
    public carrot yield() {
        if(hasBeenHarvested){
            carrot carrot = new carrot();
            return carrot;
        }
        return null;
    }
}
