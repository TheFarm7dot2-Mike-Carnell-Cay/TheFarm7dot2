package Vehicle;

import com.zipcodewilmington.froilansfarm.*;

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

    public void fertilizeCops() {
    // need a little help with this one.
    }
}
