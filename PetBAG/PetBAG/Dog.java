package PetBAG; // Package name

public class Dog extends Pet{ //Dog class derives from Pet
    private int dogSpaceNumber; // initializes space number for dog
    private int dogWeight; // initializes weight for dog
    private boolean grooming; // initializes if there will be grooming

    public Dog() { // Default constructor
        dogSpaceNumber = 0; // Default dogSpaceNumber:0 indicates not set
        dogWeight = 0; // Default dogWeight:0 indicates dog weight was not set
        grooming = false; // Default dogGrooming: false indicates dogGrooming was not set
    }

    //Setters

    public void setDogSpaceNumber (int spaceNumber) { // sets space number for dog
        this.dogSpaceNumber = spaceNumber;
    }
    public void setDogWeight (int dogWeight) { // sets weight dog
        this.dogWeight = dogWeight;
    }

    public void setGrooming (boolean dogGrooming) { // sets grooming
        this.grooming = dogGrooming;
    }

    //Getters

    public int getDogSpaceNumber () { // gets space number for dog
        return dogSpaceNumber;
    }

    public int getDogWeight() { // gets dog;s weight
        return dogWeight;
    }

    public boolean getGrooming() { // gets grooming choice
        return grooming;
    }

    public void printDog() {
        System.out.println("Space Number: " + dogSpaceNumber); // prints space number
        System.out.println("Dog's Weight: " + dogWeight); // prints dog's weight
        System.out.println("Grooming: " + grooming); // prints grooming choice
    }
}
