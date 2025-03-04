package org.example;

public class Cat extends Pet {
    private String breed;
    private double weight;

    public Cat(){
        super();
        this.breed = "None";
        this.weight = 0.0;
    }
    public Cat(String name){
        super(name);
        this.breed = "None";
        this.weight = 0.0;
    }

    public Cat(String breed, Double weight) {
        super();
        this.breed = breed;
        this.weight = weight;
    }

    //Polymorphism example from animal
    @Override
    public void makeSound(){
        System.out.println("Meooowwwwww");
    }
}
