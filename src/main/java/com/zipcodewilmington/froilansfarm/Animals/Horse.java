package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Horse implements Animals, Rideable {
    Rider rider;
    boolean mounted = false;
    int amountEaten = 0;


    public void eat(Edible food) {
        amountEaten++;
    }
    public int getAmountEaten(){
        return amountEaten;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    public boolean isMounted() {
        return false;
    }

    public boolean getIsMounted() {
        return mounted;
    }
}
