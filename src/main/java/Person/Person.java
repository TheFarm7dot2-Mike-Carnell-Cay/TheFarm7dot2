package Person;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private final ArrayList<Edible> mealsEaten = new ArrayList<Edible>();

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

    }

    public ArrayList<Edible> getMealsEaten() {
        return mealsEaten;
    }
}
