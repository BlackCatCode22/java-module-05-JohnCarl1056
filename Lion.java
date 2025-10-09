package com.johncarl.zoo;

import java.time.LocalDate;

public class Lion extends Animal {

    // Static field to track number of Lions created
    private static int numOfLions = 0;

    // Default constructor
    public Lion() {
        super();
        numOfLions++;
    }

    // Full constructor using LocalDate for date fields
    public Lion(String aniSex, LocalDate aniBirthDate, int aniWeight, String aniName,
                String aniID, String aniColor, String aniOrigin, LocalDate aniArrivalDate) {
        super(aniSex, aniBirthDate, aniWeight, aniName, aniID, aniColor, aniOrigin, aniArrivalDate);
        numOfLions++;
    }

    // Static getter for number of Lions
    public static int getNumOfLions() {
        return numOfLions;
    }
}

