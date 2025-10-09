package com.johncarl.zoo;

import java.time.LocalDate;

public class Animal {

    // Static field to track number of animals
    private static int numOfAnimals = 0;

    // Member variables aka attribytes, fields
    private String aniSex;
    private LocalDate aniBirthDate;
    private int aniWeight;
    private String aniName;
    private String aniID;
    private String aniColor;
    private String aniOrigin;
    private LocalDate aniArrivalDate;

    // Default constructor
    public Animal() {
        numOfAnimals++;
        this.aniArrivalDate = LocalDate.now(); // Set to system date
    }

    // Full constructor
    public Animal(String aniSex, LocalDate aniBirthDate, int aniWeight, String aniName,
                  String aniID, String aniColor, String aniOrigin, LocalDate aniArrivalDate) {
        numOfAnimals++;
        this.aniSex = aniSex;
        this.aniBirthDate = aniBirthDate;
        this.aniWeight = aniWeight;
        this.aniName = aniName;
        this.aniID = aniID;
        this.aniColor = aniColor;
        this.aniOrigin = aniOrigin;
        this.aniArrivalDate = aniArrivalDate;
    }

    // Getters and Setters

    public String getAniSex() {
        return aniSex;
    }

    public void setAniSex(String aniSex) {
        this.aniSex = aniSex;
    }

    public LocalDate getAniBirthDate() {
        return aniBirthDate;
    }

    public void setAniBirthDate(LocalDate aniBirthDate) {
        this.aniBirthDate = aniBirthDate;
    }

    public int getAniWeight() {
        return aniWeight;
    }

    public void setAniWeight(int aniWeight) {
        this.aniWeight = aniWeight;
    }

    public String getAniName() {
        return aniName;
    }

    public void setAniName(String aniName) {
        this.aniName = aniName;
    }

    public String getAniID() {
        return aniID;
    }

    public void setAniID(String aniID) {
        this.aniID = aniID;
    }

    public String getAniColor() {
        return aniColor;
    }

    public void setAniColor(String aniColor) {
        this.aniColor = aniColor;
    }

    public String getAniOrigin() {
        return aniOrigin;
    }

    public void setAniOrigin(String aniOrigin) {
        this.aniOrigin = aniOrigin;
    }

    public LocalDate getAniArrivalDate() {
        return aniArrivalDate;
    }

    public void setAniArrivalDate(LocalDate aniArrivalDate) {
        this.aniArrivalDate = aniArrivalDate;
    }

    // Static getter for number of animals
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}
