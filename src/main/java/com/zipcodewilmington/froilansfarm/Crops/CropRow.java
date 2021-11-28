package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible;

import java.util.ArrayList;

public class CropRow extends Crop{
    ArrayList<Crop> plantSpots = new ArrayList<Crop>();

public void addCrop(Crop crop) {
    for (int i = 0; i < 5; i++) {
        plantSpots.add(crop);
    }
}

    public Edible yield() {
        return null;
    }
}
