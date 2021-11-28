package Person;

import Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.carrot;
import com.zipcodewilmington.froilansfarm.Crops.tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilandaTest {

    @Test
    public void testConstructor() {
        //given
        Froilanda testFroilanda = new Froilanda();
        String expected = "Froilanda";
        //when
        String actual = testFroilanda.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetName() {
        //given
        Froilanda testFroilanda = new Froilanda();
        testFroilanda.setName("Froilanda");
        String expected = "Froilanda";
        //when
        String actual = testFroilanda.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Hello";
        Froilanda testFroilanda = new Froilanda();
        //when
        String actual = testFroilanda.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Froilanda testFroilanda = new Froilanda();
        CropDuster testCropDuster = new CropDuster();
        testFroilanda.mount(testCropDuster);
        testCropDuster.setMounted(true);

        //when
        boolean actual = testCropDuster.getIsMounted();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testDismount() {
        //given
        Froilanda testFroilanda = new Froilanda();
        CropDuster testCropDuster = new CropDuster();
        testFroilanda.mount(testCropDuster);
        testCropDuster.setMounted(false);
        //when
        boolean actual = testCropDuster.getIsMounted();
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testEat() {
        //given
        Froilanda testFroilanda = new Froilanda();
        testFroilanda.eat(new carrot());
        testFroilanda.eat(new tomato());
        int expected = 2;
        //when
        int actual = testFroilanda.getMealsEaten().size();
        //then
        Assert.assertEquals(expected,actual);
    }

    //test flying

    @Test
    public void testInheritance() {
        Froilanda testFroilanda = new Froilanda();
        Assert.assertTrue(testFroilanda instanceof Person);
    }

    @Test
    public void testImplementation() {
        Froilanda testFroilanda = new Froilanda();
        Assert.assertTrue(testFroilanda instanceof Pilot);
    }
}