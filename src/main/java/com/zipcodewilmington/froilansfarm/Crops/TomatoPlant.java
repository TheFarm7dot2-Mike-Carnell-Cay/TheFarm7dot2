package com.zipcodewilmington.froilansfarm.Crops;

public class TomatoPlant extends Crop{
    public tomato yield() {
        if(!hasBeenHarvested && isFertilized){
            tomato tomato = new tomato();
            return tomato;
        }
        return null;
    }
}
