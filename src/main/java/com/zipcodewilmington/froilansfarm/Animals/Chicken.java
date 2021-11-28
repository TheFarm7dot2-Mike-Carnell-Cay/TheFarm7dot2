package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken implements Animals,Produce  {

    public void eat(Edible food){
    }

    public Edible yield(){
        Egg egg = new Egg();
        if(egg.isFertilized){
            return egg;
        }
        return null;
    }

    public void makeNoise(){

    }
}
