package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.carrot;
import com.zipcodewilmington.froilansfarm.Crops.earCorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void horseEatTest(){
        Horse test = new Horse();
        test.eat(new earCorn());
        test.eat(new carrot());
        int actual = test.getAmountEaten();
        int expected = 2;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void horseMountedTest(){
        Horse test = new Horse();
        test.setMounted(true);
        boolean actual = test.getIsMounted();
        Assert.assertTrue(actual);
    }
    @Test
    public void horseNotMountedTest(){
        Horse test = new Horse();
        boolean actual = test.getIsMounted();
        Assert.assertFalse(actual);
    }
}
