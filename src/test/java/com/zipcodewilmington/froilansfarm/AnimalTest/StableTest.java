package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animals.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void getHorseInStable1Test(){
        Stable test = new Stable();
        test.assignHorses();
        int expected = 4;
        int actual = test.getHorsesInStable1();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getHorseInStable2Test(){
        Stable test = new Stable();
        test.assignHorses();
        int expected = 4;
        int actual = test.getHorsesInStable2();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getHorseInStable3Test(){
        Stable test = new Stable();
        test.assignHorses();
        int expected = 2;
        int actual = test.getHorsesInStable3();
        Assert.assertEquals(expected,actual);
    }
}
