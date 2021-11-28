package Person;

import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void testAddPerson() {
        //given
        Person testPerson = new Farmer();
        testPerson.setName("Froilan");
        //when
        FarmHouse testFarmHouse = new FarmHouse();
        testFarmHouse.addPerson(testPerson);
        //then
        Assert.assertTrue(testFarmHouse.getListOfPeople().contains(testPerson));
    }

    @Test
    public void testKickPersonOut() {
        //given
        Person testPerson = new Farmer();
        testPerson.setName("Froilan");
        FarmHouse testFarmHouse = new FarmHouse();
        testFarmHouse.addPerson(testPerson);
        //when
        testFarmHouse.kickPersonOut(testPerson);
        //then
        Assert.assertFalse(testFarmHouse.getListOfPeople().contains(testPerson));
    }
}