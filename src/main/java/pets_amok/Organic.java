package pets_amok;

public class Organic extends VirtualPets {
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private int happiness;

    public Organic(String name, String animal, String type) {
        super(name, animal, type);
        this.hunger = 50;
        this.thirst = 50;
        this.waste = 50;
        this.boredom = 50;
        this.sickness = 50;
        this.happiness = 50;
        
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getHunger() {

        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void feed() {
        setHunger(getHunger() - 30);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);
        setHappiness(getHappiness() + 5);

    }

    public void water() {
        setThirst(getThirst() - 30);
        setWaste(getWaste() + 5);
        setBoredom(getBoredom() + 5);
        setHappiness(getHappiness() + 5);
    }

    @Override
    public void play() {
        setBoredom(getBoredom() - 20);
        setHunger(getHunger() + 5);
        setThirst(getThirst() + 5);
        setHappiness(getHappiness() + 15);

    }

    public void goToBathroom() {
        setWaste(getWaste() - 40);
        setHunger(getHunger() + 10);
        setSickness(getSickness() - 5);
    }

    public void visitDoctor() {
        setSickness(getSickness() - 60);
        setHunger(getHunger() + 5);
        setBoredom(getBoredom() + 5);
    }

    @Override
    public void tick() {
        setDay(getDay() + 1);
        setHunger(getHunger() + 5);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);
        setWaste(getWaste() + 2);
        setSickness(getSickness() + 1);
        setHappiness(getHappiness() - 2);
    }

    
    
}
