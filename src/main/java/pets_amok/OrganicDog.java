package pets_amok;

public class OrganicDog extends VirtualPets {
    int dogCage;

    public OrganicDog(String name, String animal, String type, int dogCage) {
        super(name, animal, type);
        this.dogCage = dogCage;
    }

    public int getDogCage() {
        return dogCage;
    }

    public void setDogCage(int dogCage) {
        this.dogCage = dogCage;
    }

    public void cleanDogCage() {
        setDogCage(100);
    }

    public void walkingDog() {
        setHappiness(getHappiness() + 5);
        setDogCage(getDogCage() - 2);
    }

    @Override
    public void tick() {
        setDogCage(getDogCage() - 5);
        setHunger(getHunger() + 5);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);
        setWaste(getWaste() + 2);
        setSickness(getSickness() + 1);
        setHappiness(getHappiness() - 2);

    }

    @Override
    public String toString() {

        return getName() + "\t| " + getAnimal() + "\t| " + getType() + "\t| " + getHunger() + "\t| " + getThirst()
                + "\t| " + getHappiness() + "\t   |  " + " " + "          |\t " + dogCage + "%";
    }
}
