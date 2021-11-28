package com.zipcodewilmington.froilansfarm.Crops;

public class Field extends CropRow{
    CropRow[] field;
    public void createField(int numberOfRows){
        field = new CropRow[numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            field[i] = new CropRow();
        }
    }
}
