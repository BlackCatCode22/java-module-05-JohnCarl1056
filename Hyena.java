package com.johncarl.zoo;

import java.time.LocalDate;

public class Hyena extends Animal {

    // Static field to track number of Hyenas created
    private static int numOfHyenas = 0;

    // Default constructor
    public Hyena() {
        super();
        numOfHyenas++;
    }

    // Full constructor using LocalDate for date fields
    public Hyena(String aniSex, LocalDate aniBirthDate, int aniWeight, String aniName,
                 String aniID, String aniColor, String aniOrigin, LocalDate aniArrivalDate) {
        super(aniSex, aniBirthDate, aniWeight, aniName, aniID, aniColor, aniOrigin, aniArrivalDate);
        numOfHyenas++;
    }

    // Static getter for number of Hyenas
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
}

