package Person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void testConstructor() {
        //given
        Froilan testFroilan = new Froilan();
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
        int expected = 4;
        //when
        testFroilan.plant(cropRowTest, new TomatoPlant);
        int actual = cropRowTest.spots.length();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Froilan testFroilan = new Froilan();
        Tractor testTractor = new Tractor();
        testFroilan.mount(testTractor);
        //when
        boolean actual = testTractor.checkIfRiding();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testDismount() {
        //given
        Froilan testFroilan = new Froilan();
        Tractor testTractor = new Tractor();
        testFroilan.mount(testTractor);
        //when
        boolean actual = testTractor.checkIfRiding();
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testEat() {
        //given
        Froilan testFroilan = new Froilan();
        testFroilan.eat(new Carrot());
        testFroilan.eat(new Carrot());
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