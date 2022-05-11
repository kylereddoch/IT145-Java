/*
Kyle Reddoch
Cat.java
IT-145
Southern New Hampshire University
Professor: Ahlam Alhweiti
 */

package PetBAG; // Package name

public class Cat extends Pet{ //Cat class derives from Pet
    private int catSpaceNumber; // initializes space number for cat

    public Cat() { // Default constructor
        catSpaceNumber = 0; // Default catSpaceNumber:0 indicates not set
    }

    //Setters

    public void setCatSpaceNumber (int spaceNumber) { // sets space number for cat
        this.catSpaceNumber = spaceNumber;
    }

    //Getters

    public int getCatSpaceNumber () { // gets space number for cat
        return catSpaceNumber;
    }

    public void printDCat() {
        System.out.println("Space Number: " + catSpaceNumber); // prints space number
    }
}
