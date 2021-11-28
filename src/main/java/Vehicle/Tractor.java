package Vehicle;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Tractor implements FarmVehicle, Vehicle, Rideable {
    boolean isDismounted;
    boolean mounted = false;

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

    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    public boolean getIsMounted() {
        return mounted;
    }
}


