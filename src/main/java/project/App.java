package project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Greetings here");
        System.out.println("Print instructions here");
        System.out.println("User input here");

        Scanner inputScanner = new Scanner(System.in);

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet bosco = new VirtualPet("Bosco");
        VirtualPet bruce = new VirtualPet("Bruce");
        shelter.addPet(bosco);
        shelter.addPet(bruce);

        for(VirtualPet petToDisplay : shelter.retrievePets()){
            System.out.println(petToDisplay.status());
        }
        System.out.println("Enter 1 to feed all pets");
        System.out.println("Enter 2 to remove a pet");
        String userInput = inputScanner.nextLine();

        while(!userInput.equalsIgnoreCase("quit")){
            if(userInput.equalsIgnoreCase("1")){
                shelter.feedAllPets();
                shelter.tickAllPets();
            }
            if(userInput.equalsIgnoreCase("2")){
                System.out.println("Which pet would you like to remove?");

                String petNameToRemove = inputScanner.nextLine();

                shelter.removePet(petNameToRemove);
                shelter.tickAllPets();
            }
            for(VirtualPet petToDisplay : shelter.retrievePets()){
                System.out.println(petToDisplay.status());
            }
            System.out.println("Enter 1 to feed all pets");
            System.out.println("Enter 2 to remove a pet");
            userInput = inputScanner.nextLine();
        }
    }
}
