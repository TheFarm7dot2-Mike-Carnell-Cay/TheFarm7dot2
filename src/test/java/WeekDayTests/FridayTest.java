package WeekDayTests;

import Person.Farmer;
import Person.Froilan;
import Person.Froilanda;
import Vehicle.CropDuster;
import Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.carrot;
import com.zipcodewilmington.froilansfarm.Crops.earCorn;
import com.zipcodewilmington.froilansfarm.Crops.tomato;
import org.junit.Assert;
import org.junit.Test;

public class FridayTest {
    @Test
    public void testMorningBreakfastFroilan() {
        //given
        Froilan testFroilan = new Froilan();
        testFroilan.eat(new earCorn());
        testFroilan.eat(new tomato());
        testFroilan.eat(new tomato());
        testFroilan.eat(new Egg());
        testFroilan.eat(new Egg());
        testFroilan.eat(new Egg());
        testFroilan.eat(new Egg());
        testFroilan.eat(new Egg());
        int expected = 8;
        //when
        int actual = testFroilan.getMealsEaten().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMorningBreakfastFroilanda() {
        //given
        Froilanda testFroilanda = new Froilanda();
        testFroilanda.eat(new earCorn());
        testFroilanda.eat(new earCorn());
        testFroilanda.eat(new tomato());
        testFroilanda.eat(new Egg());
        testFroilanda.eat(new Egg());
        int expected = 5;
        //when
        int actual = testFroilanda.getMealsEaten().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRideHorse() {
        //given
        Froilan testFroilan = new Froilan();
        Stable testStable = new Stable();
        testStable.addHorses(10);
        for (int i = 0; i < 10; i++) {
            Horse testHorse = testStable.getHorse(i);
            testFroilan.mount(testHorse);
            testHorse.setMounted(true);
            //when
            boolean actual = testHorse.getIsMounted();
            //then
            Assert.assertTrue(actual);
        }
    }

    @Test
    public  void testFeedingHorses() {
        //given
        Farmer testFarmer = new Froilan();
        earCorn testCorn = new earCorn();
        Stable testStable = new Stable();
        testStable.addHorses(10);
        int expected = 3;
        for (int i = 0; i < 10; i++) {
            Horse testHorse = testStable.getHorse(i);
            //when
            testFarmer.feedAnimals(testHorse, testCorn);
            testFarmer.feedAnimals(testHorse, testCorn);
            testFarmer.feedAnimals(testHorse, testCorn);
            int actual = testHorse.getAmountEaten();
            //then
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testFridayCheckEquipment() {
        //given
        CropDuster testCropDuster = new CropDuster();
        Tractor testTractor = new Tractor();
        String expectedCropDuster = "hummmmmmmmm";
        String expectedTractor = "ttrrztrr";
        //when
        String actualCropDuster = testCropDuster.makeNoise();
        String actualTractor = testTractor.makeNoise();
        //then
        Assert.assertEquals(expectedCropDuster, actualCropDuster);
        Assert.assertEquals(expectedTractor, actualTractor);
    }
}
