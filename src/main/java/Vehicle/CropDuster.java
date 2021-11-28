package Vehicle;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public class CropDuster extends Aircraft implements FarmVehicle {
    boolean mounted = false;

    public String getNameOfPlane() {
        return "dusty";
    }

    public String makeNoise() {
        return "hummmmmmmmm";
    }

    public void fertilizeCrops(CropRow cropRow) {
        cropRow.fertilize();
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
