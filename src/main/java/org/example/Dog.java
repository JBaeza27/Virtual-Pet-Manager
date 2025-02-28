package org.example;

public class Dog extends Pet {
    private String breed;
    private String weight;

    public Dog(){
        super();
        this.breed = "None";
        this.weight = "Unknown";
    }
    public Dog(String name){
        super(name);
        this.breed = "None";
        this.weight = "Unknown";
    }

    public Dog(String breed, String weight) {
        super();
        this.breed = breed;
        this.weight = weight;
    }
}
