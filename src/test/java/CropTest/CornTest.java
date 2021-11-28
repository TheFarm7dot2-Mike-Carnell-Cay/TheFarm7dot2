package CropTest;

import com.zipcodewilmington.froilansfarm.Crops.Cornstalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Crops.earCorn;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CornTest {

    @Test
    public void inheritanceTest(){
        Cornstalk test = new Cornstalk();
        Assert.assertTrue(test instanceof Crop);
    }
    @Test
    public void yieldEarCornNotHarvestableTest(){
        Cornstalk test = new Cornstalk();
        earCorn food = test.yield();
        Assert.assertFalse(food instanceof Produce);
    }
    @Test
    public void yieldEarCornTest(){
        Cornstalk test = new Cornstalk();
        //spot to fertilize plant
        earCorn food = test.yield();
        Assert.assertTrue(food instanceof Produce);
    }
}
