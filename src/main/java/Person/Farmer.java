package Person;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer() {
    }

    public Farmer(String name){
        super(name);
    }

    public void plant(CropRow cropRow, Crop crop) {
        //plant stuff
        cropRow.getCropRow().add(crop);
    }


    public String nameNoise() {
        return "Hi There!";
    }

    public void eat(Edible food){
        //add eating
    }

    public void feedAnimals(Eater animalToBeFed, Edible food) {
        //add feed
    }

    public void mount(Rideable rideable) {
        rideable.riding();
    }

    public void dismount(Rideable rideable) {
        rideable.endOfRiding;
    }

}
