package CropTest;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void inheritanceTest(){
        TomatoPlant test = new TomatoPlant();
        Assert.assertTrue(test instanceof Crop);
    }
    @Test
    public void yieldTomatoNotHarvestableTest(){
        TomatoPlant test = new TomatoPlant();
        tomato food = test.yield();
        Assert.assertFalse(food instanceof Produce);
    }
    @Test
    public void yieldTomatoTest(){
        TomatoPlant test = new TomatoPlant();
        //spot to fertilize plant
        tomato food = test.yield();
        Assert.assertTrue(food instanceof Produce);
    }
}
