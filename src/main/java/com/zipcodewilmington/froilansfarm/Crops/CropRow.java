package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class CropRow extends Crop{
    public ArrayList<Crop> plantSpots = new ArrayList<Crop>();
    public boolean isFertilized;

    public void fertilize() {
        isFertilized = true;
    }

    public void addCrop(Crop crop) {
    for (int i = 0; i < 5; i++) {
        plantSpots.add(crop);
    }
}

    public Edible yield() {
        return null;
    }
}
