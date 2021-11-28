package Person;

import Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Crops.CarrotRoot;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Crops.carrot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void testConstructor() {
        //given
        Froilan testFroilan = new Froilan();
        testFroilan.setName("Froilan");
        String expected = "Froilan";

        //when
        String actual = testFroilan.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetName() {
        //given
        Froilan testFroilan = new Froilan();
        testFroilan.setName("Froilan");
        String expected = "Froilan";
        //when
        String actual = testFroilan.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Hi my name is Froilan";
        Froilan testFroilan = new Froilan();
        //when
        String actual = testFroilan.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPlant() {
        //given
        Froilan testFroilan = new Froilan();
        CropRow cropRowTest = new CropRow();
        cropRowTest.addCrop(new CarrotRoot());
        cropRowTest.addCrop(new CarrotRoot());
        cropRowTest.addCrop(new CarrotRoot());
        int expected = 20;
        //when
        testFroilan.plant(cropRowTest, new TomatoPlant());
        int actual = cropRowTest.plantSpots.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Froilan testFroilan = new Froilan();
        Tractor testTractor = new Tractor();
        testFroilan.mount(testTractor);
        testTractor.setMounted(true);
        //when
        boolean actual = testTractor.getIsMounted();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testDismount() {
        //given
        Froilan testFroilan = new Froilan();
        Tractor testTractor = new Tractor();
        testFroilan.mount(testTractor);
        testTractor.setMounted(false);
        //when
        boolean actual = testTractor.getIsMounted();
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testEat() {
        //given
        Froilan testFroilan = new Froilan();
        testFroilan.eat(new carrot());
        testFroilan.eat(new carrot());
        int expected = 2;
        //when
        int actual = testFroilan.getMealsEaten().size();
        //then
        Assert.assertEquals(expected,actual);
    }

    //test flying

    @Test
    public void testInheritance() {
        Froilan testFroilan = new Froilan();
        Assert.assertTrue(testFroilan instanceof Person);
    }

    @Test
    public void testImplementation() {
        Froilan testFroilan = new Froilan();
        Assert.assertTrue(testFroilan instanceof Botanist);
    }
}