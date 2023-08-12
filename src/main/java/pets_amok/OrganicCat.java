package pets_amok;

public class OrganicCat extends Organic {
    VirtualPetShelter shelter = new VirtualPetShelter();
    public OrganicCat(String name, String animal, String type) {
        super(name, animal, type);

    }
    @Override
    public String toString() {

        return getName() + "\t| " + getAnimal() + "\t| " + getType() + "\t| " + getHunger() + "\t| " + getThirst() + "\t| " + getHappiness()
                + "\t   |  " + " \t         |";
    }

}
