package org.example;
//Dog inherited the Pet class
public class Dog extends Pet {
    private String breed;
    private double weight;

    public Dog(){
        super();
        this.breed = "None";
        this.weight = 0.0;
    }
    public Dog(String name){
        super(name);
        this.breed = "None";
        this.weight = 0.0;
    }

    public Dog(String breed, Double weight) {
        super();
        this.breed = breed;
        this.weight = weight;
    }


    //Polymorphism example from animal
    @Override
    public void makeSound(){
        System.out.println("Woof Woof!");
    }
}
