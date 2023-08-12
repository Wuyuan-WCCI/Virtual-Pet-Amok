package pets_amok;

public class VirtualPets extends VirtualPetShelter {
    private String name;
    private int day;
    private String description;
    private String animal;
    private String type;
    

    

    public VirtualPets(String name, String animal, String type) {
        this.name = name;
        this.day = 1;
        this.description = (String) description;
        this.animal = animal;
        this.type = type;
        
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


    public void play() {

    }


}