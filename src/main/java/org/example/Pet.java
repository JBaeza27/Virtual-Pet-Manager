package org.example;

public  abstract class Pet {
    private String name;
    private int age;
    private int happiness;
    private int hunger;
    private String type;

    public Pet() {
        this("None" , 0, 5 , 5, "Unknown");
    }

    public Pet(String name) {
        this(name, 0, 5 , 5, "Unknown");
    }


    public Pet(String name, int age, int happiness, int hunger, String type) {
        this.name = name;
        this.age = age;
        this.happiness = happiness;
        this.hunger = hunger;
        this.type = type;
    }


    public void play(){
        if (happiness == 10){
            System.out.println(name + " is tired!");
        }else if(happiness < 10){
            happiness++;
            System.out.println(name + " is happy you played with them!");
            System.out.println((name +"'s happiness is at " + happiness +"/10 now"));
        }
    }

    public void eat(){
        if (hunger == 10){
            System.out.println(name + " is full!");
        }else if(hunger < 10){
            hunger++;
            System.out.println(name + " is happy you fed them!");
            System.out.println(name  + "'s hunger is at " + hunger + "/10 now");
        }
    }







     public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void displayPet(){
        System.out.println("Name: " + name + "\nType: " + type + "\nAge: " + age);
    }
    public void displayPetStats(){
        System.out.println("\nHappiness: " + happiness + "\nHunger: "
                + hunger);
    }


}
