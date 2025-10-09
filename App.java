package com.johncarl.zoo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal myanimal = new Animal();
        System.out.println("\n Animal arrival date is" + myanimal.getAniArrivalDate());

        LocalDate mydate = LocalDate.now();
        LocalDate birthdate = LocalDate.now();


        // is the full animal constructor
        //public animal String
        //

        Animal anotheranimal = new Animal("Female", birthdate, 88, "Jeff", 112333, "Black", "Inbogway", LocalDate.getarivall time);

        Lion myLion = new Lion();

        System.out.println("\n My lion arrived" + myLion+ anotheranimal.getAniArrivalDate());




    }
}