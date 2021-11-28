package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken implements Animals,Produce  {

    int foodEaten = 0;

    public void eat(Edible food){
        foodEaten++;
    }
    public int getFoodEaten(){
        return foodEaten;
    }

    public Egg yield(){
        Egg egg = new Egg();
        if(egg.isFertilized){
            return egg;
        }
        return null;
    }

    public String makeNoise(){
        return "Bwack!";
    }
}
