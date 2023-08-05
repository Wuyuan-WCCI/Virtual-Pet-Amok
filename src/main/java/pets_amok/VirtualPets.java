package pets_amok;

public class VirtualPets {
    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private int day;
    private String description;
    private String animal;
    private String type;
    private int happiness;

    public VirtualPets(String name, String animal, String type) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.waste = 50;
        this.boredom = 50;
        this.sickness = 50;
        this.day = 1;
        this.description = (String) description;
        this.animal = animal;
        this.type = type;
        this.happiness = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void feed() {
        setHunger(getHunger() - 10);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);
        setHappiness(getHappiness() + 5);

    }

    public void water() {
        setThirst(getThirst() - 10);
        setWaste(getWaste() + 5);
        setBoredom(getBoredom() + 5);
        setHappiness(getHappiness() + 5);
    }

    public void play() {
        setBoredom(getBoredom() - 15);
        setHunger(getHunger() + 5);
        setThirst(getThirst() + 5);
        setHappiness(getHappiness() + 5);

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

    public void tick() {
        setDay(getDay() + 1);
        setHunger(getHunger() + 5);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);
        setWaste(getWaste() + 2);
        setSickness(getSickness() + 1);
        setHappiness(getHappiness() - 2);
    }

    public String toString() {

        return name + "\t| " + animal + "\t| " + type + "\t| " + hunger + "\t| " + thirst + "\t| " + happiness
                + "\t   |  " + " \t         |";
    }
}
