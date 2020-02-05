package com.company;

public class Dog extends Animal {
    private String breed;

    private Shelter shelter;

    Dog dog = new Dog(3, "Shepherd", new Shelter("st.Pin"));

    public Dog(int age, String breed, Shelter shelter) {
        super(age);
        this.breed = breed;
        this.shelter=shelter;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public String getBreed() {
        return breed;
    }

    public void playwith(String toy){
        System.out.println("This dog play with" + toy);
    }
    public void playwith(String toy, int time){
        System.out.println("This dog play with" + toy + "at this " + time );

    }

}
