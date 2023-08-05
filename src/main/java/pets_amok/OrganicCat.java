package pets_amok;

import java.util.ArrayList;
import java.util.List;

public class OrganicCat extends VirtualPets {
    private int litterBox;
    VirtualPetShelter shelter = new VirtualPetShelter();
    private List<VirtualPets> pets = new ArrayList<>();

    public OrganicCat(String name, String animal, String type) {
        super(name, animal, type);
        // TODO Auto-generated constructor stub
    }

    // public int getLitterBox() {
    // return litterBox;
    // }

    // public void setLitterBox(int litterBox) {
    // this.litterBox = 50;
    // }

    // public void litterBoxLevel() {
    // int numberOfCats = countOrganicCats();
    // setLitterBox(getLitterBox() + numberOfCats * 5);

    // }

    // private int countOrganicCats() {
    // int count = 0;
    // for (VirtualPets pet : pets) {
    // if (pet instanceof OrganicCat) {
    // count++;
    // }
    // }
    // return count;
    // }

    // public void cleanLitterBox() {

    // setLitterBox(0);
    // }

    // @Override
    // public void tick() {
    // setDay(getDay() + 1);
    // setHunger(getHunger() + 5);
    // setBoredom(getBoredom() + 5);
    // setThirst(getThirst() + 5);
    // setWaste(getWaste() + 2);
    // setSickness(getSickness() + 1);
    // setHappiness(getHappiness() - 2);
    // litterBoxLevel();
    // }

}
