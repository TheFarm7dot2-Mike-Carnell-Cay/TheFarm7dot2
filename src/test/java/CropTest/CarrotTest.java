package CropTest;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void inheritanceTest(){
        CarrotRoot test = new CarrotRoot();
        Assert.assertTrue(test instanceof Crop);
    }
    @Test
    public void yieldCarrotNotHarvestableTest(){
        CarrotRoot test = new CarrotRoot();
        carrot food = test.yield();
        Assert.assertFalse(food instanceof Produce);
    }
    @Test
    public void yieldCarrotTest(){
        CarrotRoot test = new CarrotRoot();
        //spot to fertilize plant
        carrot food = test.yield();
        Assert.assertTrue(food instanceof Produce);
    }
}
