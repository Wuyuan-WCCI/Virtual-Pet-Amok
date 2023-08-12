package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void testOrganicDogCleanDogCage() {
        OrganicDog organicDog = new OrganicDog("Buddy", "Dog", "Organic", 50);
        organicDog.cleanDogCage();
        assertEquals(105, organicDog.getDogCage());
    }

    @Test
    public void testSetAndGetHappiness() {
        Organic pet = new Organic("Nmido", "Dog", "Organic");

        pet.setHappiness(70);

        assertEquals(70, pet.getHappiness());
    }

    @Test
    public void testOilRoboticDog() {
        Robotic roboticDog = new Robotic("JoboDog", "Dog", "Robotic");
        int oilLevel = roboticDog.getOilLevel();

        roboticDog.oilRoboticPets();
        assertEquals(oilLevel + 5, roboticDog.getOilLevel());
    }
}
