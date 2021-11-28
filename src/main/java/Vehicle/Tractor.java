package Vehicle;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Tractor implements FarmVehicle, Vehicle, Rideable {
    boolean isDismounted;

    public String makeNoise() {
        return "ttrrztrr";
    }

    public void operate() {
        // operate on field;
    }

    public boolean isMounted(Rider rider) {
        return !isDismounted;
    }

    public String getName() {
        return null;
    }
}


