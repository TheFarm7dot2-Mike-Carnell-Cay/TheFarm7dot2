package Person;

import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Froilanda extends Person implements Pilot, Rider {
    public boolean isFlying = false;

    public String makeNoise() {
        return "Hello";
    }

    public Froilanda() {
        super("Froilanda");
    }

    public void fly(Field field) {
        isFlying = true;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void eat(Edible food) {
        mealsEaten.add(food);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

}
