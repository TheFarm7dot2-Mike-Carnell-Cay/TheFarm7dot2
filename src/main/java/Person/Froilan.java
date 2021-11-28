package Person;

public class Froilan extends Farmer implements Botanist {
    String name;

    public Froilan(String name) {
        super(name);
    }

    public Froilan() {
        this.name = "Froilan";
    }

    public void plant(CropRow cropRow, Crop crop){
        cropRow.plantCrop(crop);
    }

    public String makeNoise(){
        return "Hi my name is Froilan";
    }

//    public void plantRowsOfCrops(Field field) {
//        //do we need to plant rows?
//    }
}
