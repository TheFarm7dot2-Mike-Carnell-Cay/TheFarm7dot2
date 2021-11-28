package com.zipcodewilmington.froilansfarm.Crops;

public class TomatoPlant extends Crop{
    public Edible yield() {
        if(hasBeenHarvested){
            tomato tomato = new tomato();
            return tomato;
        }
        return null;
    }
}
