package Person;

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
        //when
        boolean actual = testCropDuster.checkIfRiding();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testDismount() {
        //given
        Froilanda testFroilanda = new Froilanda();
        Horse testHorse = new Horse();
        testFroilanda.mount(testHorse);
        //when
        boolean actual = testHorse.checkIfRiding();
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testEat() {
        //given
        Froilanda testFroilanda = new Froilanda();
        testFroilanda.eat(new Carrot());
        testFroilanda.eat(new Tomato());
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