package com.zipcodewilmington.froilansfarm;

import Person.FarmHouse;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private FarmHouse farmHouse = new FarmHouse();
    private List<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private List<Stable> horseStables = new ArrayList<Stable>();
    private Field field = new Field();

    public Farm() {
    }

    public void addChickenCoops(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }

    public void addHorseStables(Stable stable) {
        horseStables.add(stable);
    }


}
