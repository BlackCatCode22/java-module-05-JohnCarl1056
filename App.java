package com.john.zoo;

public class App {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my Zoo Program!");

        // How many animals do we have?
        System.out.println("\n numOfAnimals is " + Animal.numOfAnimals);



        //Create a new animal!
        Animal myNewAnimal = new Animal();

        System.out.println( "\n myNewAnimal object's aniID is;" + myNewAnimal.getAnimalID());

        //get our new animal
        myNewAnimal.setAnimalID("acd123");
        System.out.println("\n The setAnilID() method was !\n");

        System.out.println( "\n myNewAnimal object's aniID is;" + myNewAnimal.getAnimalID());


        // How many animals do we have?
        System.out.println("\n numOfAnimals is " + Animal.numOfAnimals);

        // Creat another animal
        Animal myNewAnimal2 = new Animal();


        // How many animals do we have?
        System.out.println("\n numOfAnimals is " + Animal.numOfAnimals);

        Animal myAnimal = new Animal("Leo", 2, 80);



    }
}
