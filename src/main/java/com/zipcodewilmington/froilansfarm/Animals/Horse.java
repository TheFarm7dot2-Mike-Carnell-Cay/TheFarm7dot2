package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Horse implements Animals, Rideable {

    public void eat(Edible food) {

    }

    public boolean isMounted(Rider rider) {

        return !isDismounted;
    }

}
