package org.example;

import java.util.Scanner;

public class VirtualPetManager {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet myPet = null;
        boolean running = true;

        System.out.println("Welcome to Virtual Pet Manager!");

        System.out.println("What type of pet do you have? (1. Dog): ");
        Integer typeChoice = scanner.nextInt();
        scanner.nextLine(); // Removes \n

        System.out.println("What is your pet's name?");
        String name = scanner.nextLine();

        if(typeChoice == 1){
            myPet = new Dog(name);
        }

        while(running){

            System.out.println("\nMenu:\n");
            System.out.println("1. Play with your pet");
            System.out.println("2. Feed your pet");
            System.out.println("3. Display Stats");
            System.out.println("4. Exit");

            System.out.println("Choose your option:");
            String option = scanner.nextLine();


            switch (option){
                case "1":
                    myPet.play();
                    break;
                case "2":
                    myPet.feed();
                    break;
                case "3":
                    myPet.displayPetStats();
                    break;
                case "4":
                    System.out.println("See you soon!");
                    running = false;
                    break;
                default:
                    System.out.println("Pick a valid number please");
            }
        }
//      GameDataManager.saveFile(myPet);
//      GameDataManager.readRead(myPet);
    }
}
