package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animals.Animals;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Crops.earCorn;
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
        //default not fertilized
        Chicken test = new Chicken();
        Egg egg = test.yield();
        Assert.assertFalse(egg instanceof Egg);
    }
    @Test
    public void makeANoiseTest(){
        Chicken test = new Chicken();
        String noise = test.makeNoise();
        Assert.assertEquals("Bwack!", noise);
    }
    @Test
    public void chickenEatTest(){
        Chicken test = new Chicken();
        earCorn food = new earCorn();
        test.eat(food);
        int expected = 1;
        int actual = test.getFoodEaten();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void inheritanceTEst(){
        Chicken test = new Chicken();
        Assert.assertTrue(test instanceof Animals);
        Assert.assertTrue(test instanceof Produce);
    }
    @Test
    public void inheritanceTest(){
        Egg test = new Egg();
        Assert.assertTrue(test instanceof Produce);
    }
}
