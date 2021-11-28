package Person;

import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Froilanda extends Person implements Pilot, Rider {


    public String makeNoise() {
        return "Hello";
    }

    public Froilanda() {
        super("Froilanda");
    }

    public void fly(Farm farm) {
        //if check if she ISRIDING and if its an instance of a cropduster
    }

    public void eat(Edible food) {
        mealsEaten.add(food);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }
}
