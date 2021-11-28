package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animals.Animals;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void isAnAnimalTest(){
        Chicken test = new Chicken();
        Assert.assertTrue(test instanceof Animals);
    }
    @Test
    public void isAProduceTest(){
        Chicken test = new Chicken();
        Assert.assertTrue(test instanceof Produce);
    }
    @Test
    public void yieldAnEggTest(){

    }
    @Test
    public void makeANoiseTest(){

    }
}
