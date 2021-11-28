package com.zipcodewilmington.froilansfarm.Crops;

public class CarrotRoot extends Crop{
    public carrot yield() {
        if(!hasBeenHarvested && isFertilized){
            carrot carrot = new carrot();
            return carrot;
        }
        return null;
    }
}
