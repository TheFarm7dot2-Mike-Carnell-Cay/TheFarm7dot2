package Person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testSetAndGetName() {
        //given
        String expectedName = "";
        Person testPerson = new Farmer(expectedName);
        testPerson.setName("Froilanda");
        //when
        String actual = testPerson.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void testMealsEaten() {
        //given
        Person testPerson = new Farmer("");
        testPerson.eat(new EarCorn);
        testPerson.eat(new Tomato);
        testPerson.eat(new Carrot);
        int expected = 3;
        //when
        int actual = testPerson.getMealsEaten().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        Person testPerson = new Farmer("Froilan");
        String expected = "Howdy!";
        //when
        String actual = testPerson.makeNoise();
        //given
        Assert.assertEquals(expected, actual);
    }
}