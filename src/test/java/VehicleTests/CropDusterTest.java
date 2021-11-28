package VehicleTests;

import Person.Froilanda;
import Vehicle.CropDuster;
import Vehicle.FarmVehicle;
import Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String actual = "hummmmmmmmm";
        Assert.assertEquals(actual, cropDuster.makeNoise());
    }


    @Test
    public void getNameOfPlaneTest() {
        CropDuster cropDuster = new CropDuster();
        String expectedName = "dusty";

        String actualName = cropDuster.getNameOfPlane();
        Assert.assertEquals(expectedName, actualName);
    }

//    public class CropDuster extends Aircraft implements FarmVehicle, NoiseMaker, Vehicle {
    @Test
    public void instanceOfTest1() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof NoiseMaker);

    }

    @Test
    public void instanceOfTest2() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);

    }

    @Test
    public void instanceOfTest3() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);

    }

    @Test
    public void fertilizeCropsTest() {
        //given
        CropDuster testCropDuster = new CropDuster();
        CropRow cropRowTest = new CropRow();
        //when
        boolean actual = testCropDuster.fertilizeCrops(cropRowTest);
        //then
        Assert.assertEquals(expected, actual);
    }


}
