package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    void appHasAGreeting() {
        assertTrue(true, "app should have a greeting");
    }

    @Test
    public void testOrganicDogCleanDogCage() {
        OrganicDog organicDog = new OrganicDog("Buddy", "Dog", "Organic", 50);
        organicDog.cleanDogCage();
        assertEquals(100, organicDog.getDogCage());
    }

    public void testSetAndGetHappiness() {
        VirtualPets pet = new VirtualPets("Nmido", "Dog", "Organic");

        pet.setHappiness(70);

        assertEquals(70, pet.getHappiness());
    }

    public void testOilRoboticDog() {
        Robotic roboticDog = new Robotic("JoboDog", "Dog", "Robotic");
        int oilLevel = roboticDog.getOilLevel();

        roboticDog.OilRoboticPets();
        assertEquals(oilLevel + 5, roboticDog.getOilLevel());
    }
}
