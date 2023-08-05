package pets_amok;

public class Robotic extends VirtualPets {
    private int oilLevel;

    public Robotic(String name, String animal, String type) {
        super(name, animal, type);
        setHunger(0);
        setThirst(0);
        setBoredom(0);
        this.oilLevel = 100;

    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public void OilRoboticPets() {

        setOilLevel(105);

    }

    @Override
    public void tick() {
        setOilLevel(getOilLevel() - 5);
        setDay(getDay() + 1);
        setHunger(0);
        setThirst(0);
        setBoredom(0);

    }

    @Override
    public String toString() {

        return getName() + "\t| " + getAnimal() + "\t| " + getType() + "\t| " + " " + "\t| " + ""
                + "\t| " + "" + "\t   |  " + oilLevel + "%" + "\t |";
    }

}
