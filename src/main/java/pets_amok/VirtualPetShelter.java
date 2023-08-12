package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class VirtualPetShelter {
    private List<OrganicCat> organicCats = new ArrayList<>();
    private List<OrganicDog> organicDogs = new ArrayList<>();
    private List<VirtualPets> pets = new ArrayList<>();
    private List<RoboticCat> roboticCats = new ArrayList<>();
    private List<RoboticDog> roboticDogs = new ArrayList<>();

    private Scanner scanner;
    private int litterBox = 50;

    public void addPet(VirtualPets pet) {
        pets.add(pet);
    }

    public void removePet(VirtualPets pet) {
        pets.remove(pet);
    }

    public VirtualPets getPetByName(String name) {
        for (VirtualPets pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public Collection<VirtualPets> getAllPets() {
        return pets;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayPetsList() {
        for (VirtualPets pet : pets) {
            System.out.println(pet.getName());
        }
    }

    public void cleanLitterBox() {
        setLitterBox(0);
    }

    public void showDogCageCleanlinessLevel() {
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                System.out.println("\n" + organicDog.getName() + "'s Dog Cage cleanliness Level: "
                        + organicDog.getDogCage() + "%.");
            }

        }
    }

    public void showLitterBoxStatus() {
        int numberOfCats = countOrganicCats();

        System.out.println("\nWe have " + numberOfCats + " cats in the Shelter");

        System.out.println("Litter Box status: " + getLitterBox() + "% Full.");

    }

    public void adoptPet(Scanner scanner) {
        System.out.println("Which pet would you like to adopt?\n");
        displayPetsList();

        String name = scanner.nextLine();
        VirtualPets adoptPetName = getPetByName(name);
        if (adoptPetName != null) {
            System.out.println("\nPet's description: " + adoptPetName.getDescription() + "\n");
            removePet(adoptPetName);
            System.out.println("Congratulations! " + adoptPetName.getName() + " has been adopted~!");
        } else {
            System.out.println("We don't find pet named " + name + " in our Shelter.");
        }
    }

    public void intakePet(Scanner scanner) {
        System.out.println("Is the pet an Organic or Robotic");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Robotic")) {
            System.out.println("What animal is the pet? Dog or Cat:");
            String animal = scanner.nextLine();
            if (animal.equalsIgnoreCase("cat")) {
                System.out.println("Please enter pet's name:");
                String name = scanner.nextLine();
                RoboticCat petName = new RoboticCat(name, animal, type);
                petName.setAnimal("Cat");
                addPet(petName);
                roboticCats.add(petName);
                petName.setType("Robotic");

                System.out.println("Great job! " + petName.getName() + " has been admitted to the shelter!");
                petName.setDay(0);
            } else if (animal.equalsIgnoreCase("dog")) {
                System.out.println("Please enter pet's name:");
                String name = scanner.nextLine();
                RoboticDog petName = new RoboticDog(name, animal, type);
                addPet(petName);
                petName.setAnimal("Dog");
                petName.setType("Robotic");
                roboticDogs.add(petName);
                System.out.println("Great job! " + petName.getName() + " has been admitted to the shelter!");
                petName.setDay(0);
            } else {
                System.out.println("Sorry, we only admit dog or cat at this time!");
            }

        } else if (type.equalsIgnoreCase("Organic")) {
            System.out.println("What animal is that pet Dog or Cat:");
            String animal = scanner.nextLine();
            if (animal.equalsIgnoreCase("cat")) {
                System.out.println("Please enter pet's name:");
                String name = scanner.nextLine();
                OrganicCat petName = new OrganicCat(name, animal, type);
                addPet(petName);
                petName.setAnimal("Cat");
                petName.setType("Organic");
                organicCats.add(petName);

                System.out.println("Great job! " + petName.getName() + " has been admitted to the shelter!");
                petName.setDay(0);

            } else if (animal.equalsIgnoreCase("dog")) {
                System.out.println("Please enter pet's name:");
                String name = scanner.nextLine();
                OrganicDog petName = new OrganicDog(name, animal, type, 50);
                addPet(petName);
                petName.setAnimal("Dog");
                petName.setType("Organic");
                organicDogs.add(petName);

                System.out.println("Great job! " + petName.getName() + " has been admitted to the shelter!");
                petName.setDay(0);
            } else {
                System.out.println("Sorry, we only admit dog or cat at this time!");
            }

        } else {
            System.out.println("Please enter Organic or Robotic!");

        }

    }

    public void feedAllPets() {
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.feed();
            } else if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.feed();
            }

        }

    }

    public void waterAllPets() {
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.water();
            } else if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.water();
            }

        }

    }

    public void oilRoboticPets() {
        for (VirtualPets pet : pets) {
            if (pet instanceof RoboticCat) {
                RoboticCat roboticCat = (RoboticCat) pet;
                roboticCat.oilRoboticPets();
            } else if (pet instanceof RoboticDog) {
                RoboticDog roboticDog = (RoboticDog) pet;
                roboticDog.oilRoboticPets();
            }

        }

        System.out.println("All robotic pets have been oiled.");

    }

    public void cleanAllDogCages() {
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.cleanDogCage();
            }
        }
        System.out.println("All the dog cages have been cleaned.");
    }

    public void walkingAllDogs() {
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.walkingDog();
            } else if (pet instanceof RoboticDog) {
                RoboticDog roboticDog = (RoboticDog) pet;
                roboticDog.walkingDog();
            }
        }
    }

    public void playWithPet() {
        System.out.println("Which pet you want to play with?");
        displayPetsList();

        String petName = scanner.nextLine();
        VirtualPets pet = getPetByName(petName);
        if (pet != null) {
            pet.play();
            System.out.println("\nGood job! You have played with " + petName + "!\n");
        } else {
            System.out.println("\nWe don't have pet named " + petName + " in the shelter.");
        }

    }

    private int countOrganicCats() {
        int count = 0;
        for (VirtualPets pet : pets) {
            if (pet instanceof OrganicCat) {
                count++;
            }
        }
        return count;
    }

    public void tick() {
        int numberOfCats = countOrganicCats();
        setLitterBox(getLitterBox() + numberOfCats * 3);

        if (getLitterBox() > 100) {
            setLitterBox(100);
        }

        for (VirtualPets pet : pets) {
            pet.tick();
        }

    }

    public int getLitterBox() {
        return litterBox;
    }

    public void setLitterBox(int littleBox) {
        this.litterBox = littleBox;
    }

}
