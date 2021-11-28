package Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer() {
        super();
    }

    public Farmer(String name){
        super(name);
    }


    public void plant(CropRow cropRow, Crop crop) {
        //plant stuff
        cropRow.addCrop(crop);
    }

    @Override
    public String makeNoise() {
        return "Hi There!";
    }

    public void eat(Edible food){
        mealsEaten.add(food);
    }

    public void feedAnimals(Eater animalToBeFed, Edible food) {
        //add feed
        animalToBeFed.eat(food);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }


}
