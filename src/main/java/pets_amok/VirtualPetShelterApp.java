package pets_amok;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
        boolean exit = false;
        shelter.setScanner(scanner);
        shelter.addPet(new OrganicCat("John", "Cat", "Organic"));
        shelter.addPet(new OrganicDog("Lohn", "Dog", "Organic", 50));
        shelter.addPet(new OrganicCat("Gohn", "Cat", "Organic"));
        shelter.addPet(new RoboticDog("AJohn", "Dog", "Robotic"));
        shelter.addPet(new RoboticCat("CJohn", "Cat", "Robotic"));
        shelter.addPet(new OrganicDog("Tohn", "Dog", "Organic", 50));
        while (!exit) {
            displayStatus(shelter);
            shelter.showLitterBoxStatus();
            try {

                System.out.println("\nWhat would you like to do?\n");
                System.out.println("1. Feed all Organic pets");
                System.out.println("2. Water all Organic pets");
                System.out.println("3. Play with a pet");
                System.out.println("4. Adopt a pet");
                System.out.println("5. Admit a pet. ");
                System.out.println("6. Oil all the Robotic pets");
                System.out.println("7. Clean all the dog cages. ");
                System.out.println("8. Clean the litter box.");
                System.out.println("9. Walking with all Dogs.");
                System.out.println("10. Quit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        shelter.feedAllPets();
                        System.out.println("Great job! You  feed all the pets\n");
                        break;
                    case 2:
                        shelter.waterAllPets();
                        System.out.println("Great job! You water all the pets\n");
                        break;
                    case 3:
                        shelter.playWithPet();
    
                        break;
                    case 4:
                        shelter.adoptPet(scanner);
                        break;
                    case 5:
                        shelter.intakePet(scanner);
                        break;
                    case 6:
                        shelter.oilRoboticPets();
                        break;
                    case 7:
                        shelter.cleanAllDogCages();
                        break;
                    case 8:
                        shelter.cleanLitterBox();
                        break;
                    case 9:
                        shelter.walkingAllDogs();
                        break;
                    case 10:
                        System.out
                                .println(
                                        "Thank you for taking care of all the pets at the Virtual Pet Shelter! Goodbye! ");
                        exit = true;
                        break;

                    default:
                        System.out.println("\nInvalid choice. Please choose again!\n");
                        continue;

                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an Integer!");
                break;
            }

            shelter.tick();
        }
        scanner.close();

    }

    public static void displayStatus(VirtualPetShelter shelter) {
        System.out.println("\nThis is the status of all pets in the shelter:\n");
        System.out
                .println("Name" + "\t|" + "Animal" + "\t|" + "Type" + "  \t" + "        |Hunger" + "\t|" + "Thirst"
                        + "\t|"
                        + "Happiness |\t" + "Oil Level|\t" + "Dog Cage Cleanliness Lvl");
        System.out.println(
                "--------|" + "-------|" + "---------------|" + "-------|" + "-------|" + "----------|"
                        + "-------------|-------------------------------");
        for (VirtualPets pet : shelter.getAllPets()) {
            System.out.println(pet);

        }

    }

}
