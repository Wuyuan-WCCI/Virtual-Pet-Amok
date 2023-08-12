package pets_amok;

public class RoboticDog  extends Robotic{

    public RoboticDog(String name, String animal, String type) {
        super(name, animal, type);
    }

    public void walkingDog() {
        setOilLevel(getOilLevel() - 5);
    }
    
}