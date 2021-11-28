package Person;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private final ArrayList<Person> listOfPeople = new ArrayList<Person>();

    public FarmHouse() {
    }

    public void addPerson(Person person){
        listOfPeople.add(person);
    }

    public void kickPersonOut(Person person) {
        listOfPeople.remove(person);
    }

    public List<Person> getListOfPeople() {
        return listOfPeople;
    }
}
