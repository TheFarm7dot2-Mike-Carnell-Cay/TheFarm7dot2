package com.zipcodewilmington.froilansfarm.Crops;

public class Field extends CropRow{
    CropRow[] field;
    boolean isFertilized;

    public void createField(int numberOfRows){
        field = new CropRow[numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            field[i] = new CropRow();
        }
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
}
