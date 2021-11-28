package Vehicle;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public class CropDuster extends Aircraft implements FarmVehicle {


    public String getNameOfPlane() {
        return "dusty";
    }

    public String makeNoise() {
        return "hummmmmmmmm";
    }

    public boolean isMounted(Rider rider) {
        return false;
    }

    public String getName() {
        return null;
    }

    public void fertilizeCrops(CropRow cropRow) {
    // need a little help with this one.
        cropRow.fertilize();
    }
}
