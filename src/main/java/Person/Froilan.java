package Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public class Froilan extends Farmer {
    String name;

    public Froilan(String name) {
        super(name);
    }

    public Froilan() {
        this.name = "Froilan";
    }

    public void plant(CropRow cropRow, Crop crop){
        cropRow.addCrop(crop);
    }

    public String makeNoise(){
        return "Hi my name is Froilan";
    }

}
