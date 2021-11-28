package Person;

import com.zipcodewilmington.froilansfarm.Crops.Edible;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public ArrayList<Edible> mealsEaten = new ArrayList<Edible>();

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise() {
        return "Howdy!";
    }

    public void eat(Edible food) {
        mealsEaten.add(food);
    }

    public ArrayList<Edible> getMealsEaten() {
        return mealsEaten;
    }
}
