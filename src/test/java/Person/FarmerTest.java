package Person;


import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.*;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testName(){
        //given
        String expected = "Froilan";
        Farmer testFarmer = new Farmer(expected);
        //when
        String actual = testFarmer.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        Farmer testFarmer = new Farmer("Froilan");
        String expected = "Hi There!";
        //when
        String actual = testFarmer.makeNoise();
        //given
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPlantSomething() {
        //given
        Farmer testFarmer = new Farmer("Froilan");
        CropRow cropRowTest = new CropRow();
        cropRowTest.addCrop(new TomatoPlant());
        cropRowTest.addCrop(new TomatoPlant());
        cropRowTest.addCrop(new TomatoPlant());
        int expected = 20;
        //when
        testFarmer.plant(cropRowTest, new CarrotRoot());
        int actual = cropRowTest.plantSpots.size();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMount() {
        //given
        Farmer testFarmer = new Farmer("Froilan");
        Horse testHorse = new Horse();
        testFarmer.mount(testHorse);
        //when
        boolean actual = testHorse.isMounted(testFarmer);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testDismount() {
        //given
        Farmer testFarmer = new Farmer("Froilan");
        Horse testHorse = new Horse();
        testFarmer.mount(testHorse);
        //when
        boolean actual = testHorse.isMounted(testFarmer);
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testEat() {
        //given
        Farmer testFarmer = new Farmer("Froilan");
        testFarmer.eat(new earCorn());
        testFarmer.eat(new tomato());
        int expected = 2;
        //when
        int actual = testFarmer.getMealsEaten().size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance() {
        Farmer testFarmer = new Farmer("Froilan");
        Assert.assertTrue(testFarmer instanceof Person);
    }

    @Test
    public void testImplements() {
        Farmer testFarmer = new Farmer("Froilan");
        Assert.assertTrue(testFarmer instanceof Botanist);
    }
}