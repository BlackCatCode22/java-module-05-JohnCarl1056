
package com.john.zoo;
    public class Animal {
        // Create a static int that keep track of the number of animals created.
        static int numOfAnimals = 0;


        // Create a constructor for our new Animal objects
        public Animal() {

            numOfAnimals++;
        }

        public Animal(String name, int age, int weight){
            this.aniName = name;
            this.aniage = age;
            this.aniweight = weight;

            }

            // Create a constructor that will accept all fields as arguments.
        public Animal(String sex, int age, int weight, String animalName,
                    String animalID, String animalBirthDate, String animalColor,
                    String animalOrigin, String animalArrivalDate){
                // Add an animal to keep track of the number of animals in our zoo.
                numOfAnimals++;
                this.anisex = sex;
                this.aniage = age;
                this.aniweight = weight;
                this.aniName = animalName;
                this.aniID = animalID;
                this.aniBirthDate = animalBirthDate;
                this.aniColor = animalColor;
                this.aniOrigin = animalOrigin;
                this.aniArrivalDate = animalArrivalDate;
            }

            // Create all attributes (fields) needed for the ZooKeeperChallenge program.


            // sex will be 'male' or 'female'
            private String anisex;
            // age will be in years
            private int aniage;
            // weight will be in pounds
            private int aniweight;
            // name will be a String;
            private String aniName;
            // animalID will be first two latin letters of the species name and an integer number. Number part of the ID must be
            // at least two characters. For example: Hy01, Hy02, Be01, Be02, etc.
            private String aniID;
            // animalBirthDate is going to be a string here (in this class)
            private String aniBirthDate;
            // animalColor is a String
            private String aniColor;
            // origin will be a string like: "from Friguia Park, Tunisia"
            private String aniOrigin;
            // arrival date will be the system date when the animal object was created
            private String aniArrivalDate;

            // Create getters and setters

            public String getAnimalOrigin () {
                return aniOrigin;
            }
            public void setAnimalOrigin (String aniOrigin){
                this.aniOrigin = aniOrigin;
            }

            public String getAnimalColor () {
                return aniColor;
            }
            public void setAnimalColor (String aniColor){
                this.aniColor = aniColor;
            }

            public String getAnimalBirthDate () {
                return aniBirthDate;
            }
            public void setAnimalBirthDate (String aniBirthDate){
                this.aniBirthDate = aniBirthDate;
            }

            public String getAnimalID () {
                return aniID;
            }
            public void setAnimalID (String aniID){
                this.aniID = aniID;
            }

            public String getAnimalName () {
                return aniName;
            }
            public void setAnimalName (String aniName){
                this.aniName = aniName;
            }

            public int getAge () {
                return aniage;
            }
            public void setAge ( int aniage){
                this.aniage = aniage;
            }

            public String getSex () {
                return anisex;
            }
            public void setSex (String anisex){
                this.anisex = anisex;
            }

            public int getWeight () {
                return aniweight;
            }
            public void setWeight ( int aniweight){
                this.aniweight = aniweight;
            }

            public String getAnimalArrivalDate () {
                return aniArrivalDate;
            }
            public void setAnimalArrivalDate (String aniArrivalDate){
                this.aniArrivalDate = aniArrivalDate;
            }


        }



