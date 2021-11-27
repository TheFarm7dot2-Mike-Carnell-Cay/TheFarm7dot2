package Person;

public abstract class Person implements NoiseMaker, Eater{
    private String name;

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
}
