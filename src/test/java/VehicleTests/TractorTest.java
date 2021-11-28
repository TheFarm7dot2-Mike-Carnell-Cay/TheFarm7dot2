package VehicleTests;

import Vehicle.CropDuster;
import Vehicle.FarmVehicle;
import Vehicle.Tractor;
import Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.Rideable;
import org.junit.Assert;
import org.junit.Test;


public class TractorTest {


    @Test
    public void makeNoise() {
        Tractor tractor = new Tractor();
        String actual = "ttrrztrr";
        Assert.assertEquals(actual, tractor.makeNoise());
    }

    @Test
    public void instanceOfTest1() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);

    }

    @Test
    public void instanceOfTest2() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);

    }

    @Test
    public void instanceOfTest3() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);

    }

}