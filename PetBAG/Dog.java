/*
Kyle Reddoch
Dog.java
IT-145
Southern New Hampshire University
Professor: Ahlam Alhweiti
 */

package PetBAG; // Package name

public class Dog extends Pet {

    //declare instance Variables

    public int dogSpaceNumber; // public integer
    public double dogWeight; // public integer
    public boolean grooming; // public boolean true = yes or false = no

    // initialized the base characteristics of the Pet class, so that the Dog class can inherit its features.
    public Dog(String petName, int petAge, int dogSpaces, int daysStay, int dogSpaceNumber, double dogWeight, boolean grooming) {

        super("dog", petName, petAge, dogSpaces, -1, daysStay, -1); // super class constructor

        this.petType = "dog";
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.daysStay = daysStay;
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = false;
    }

    // constructor is called with no arguments, 3 default fields will populate.
    public Dog() {
        this.dogSpaceNumber = 0;
        this.dogWeight = 0;
        this.grooming = false;
    }

    // constructor called with 2 arguments, 1 default field.
    public Dog(int dogSpaceNumber, double dogWeight) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;

        this.grooming = false;
    }

// assessor method for dogSpaceNumber, returns dogSpaceNumber.
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

// mutator method for dogSpaceNumber, with parameter new value of dogSpaceNumber.
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;

        // Validates user input. If space numbers less than 0 or greater than 30 are called,
        // an error message will be displayed. Additionally, the space number selected is displayed.
        // Zero is a default placeholder.

        if (this.dogSpaceNumber < 0) {
            System.out.println("ERROR: Enter a valid space number.\nMust be between 1-30.");
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);
        } else if (this.dogSpaceNumber > 31) {
            System.out.println("ERROR: Enter a valid space number.\nMust be between 1-30.");
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);

            // default is set to zero, if empty constructor DOG() is called.

        } else if (this.dogSpaceNumber == 0) {
            System.out.println("Default Space Number.\nSet space number between 1-30");
        } else if (this.dogSpaceNumber > 0 && this.dogSpaceNumber < 31) {
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);
        }
    }

// assessor method for dogWeight, returns dogWeight.
    public double getDogWeight() {
        return dogWeight;
    }

// mutator method for dogweight, with parameter new value of dogWeight.
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;

        // validates weight input. Outputs string with daily boarding fee and grooming fee to user.
        // displays error message for weights less than 0.

        if (this.dogWeight < 0) {
            System.out.println("ERROR: Enter valid weight .");
        } else if (this.dogWeight > 0.0 && this.dogWeight < 20.0) {

            // unsure if this is appropriate for the pet check-in process, the specification document is
            // unclear. But it makes sense to only have to have this done here to me. With the boolean
            // being set in "isGrooming" if daysStay > 2.

            amountDue += (24.00 * daysStay);
            if (isGrooming()) {
                amountDue += 19.95;
            }
            System.out.println("Boarding fee: $24.00 a day. \nGrooming fee: $19.95");
        } else if (this.dogWeight > 19 && this.dogWeight < 31) {
            amountDue += (29.00 * daysStay);
            if (isGrooming()) {
                amountDue += 24.95;

            }
            System.out.println("Boarding fee: $29.00 a day. \nGrooming fee: $24.95");
        } else if (this.dogWeight > 30) {
            amountDue += (34.00 * daysStay);
            if (isGrooming()) {
                amountDue += 29.95;
            }
            System.out.println("Boarding fee: $34.00 a day. \nGrooming fee: $29.95");
        }
    }

// assessor method for isGrooming, returns grooming (if true or false).
    public boolean isGrooming() {
        return this.grooming;
    }

// mutator method for grooming, with parameter new value of grooming.
    public void setGrooming(String selectGrooming, int daysStay) {

        // If the daysStay is greater than 1 and the petType is equivalent to dog
        // (ignores String case) then move on to next if statement. Else if
        // the petType isn't DOG or the daysStay is less than 2, OUTPUT
        // grooming not available to user.

        if ((daysStay > 1) && (petType.equalsIgnoreCase("dog"))) {

            // If user typed in "yes" for String selectGrooming (ignores case), then this.grooming
            // is set to true. Confirmation is then OUTPUT to the user. Else if this.grooming
            // is set to false. Message is the OUTPUT to user that grooming was declined.

            System.out.println("Grooming Available.\n Enter \"yes\" to select grooming.");
            if (selectGrooming.equalsIgnoreCase("yes")) {
                this.grooming = true;
                System.out.println("Grooming has been Selected");
            } else {
                System.out.println("Grooming has been declined.");
            }
        } else if (daysStay < 2) {
            System.out.println("Grooming not available.");
        }
    }
}
