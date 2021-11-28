package Vehicle;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.ArrayList;

public class Tractor extends Crop implements FarmVehicle, Vehicle, Rideable {
    private ArrayList<Edible> harvestList = new ArrayList<Edible>();
    boolean mounted = false;

    public String makeNoise() {
        return "ttrrztrr";
    }

    public void harvest(Crop crop) {
        harvestList.add(crop);
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

    public Edible yield() {
        return null;
    }

    public ArrayList<Edible> getCropHarvested() {
        return harvestList;
    }
}


