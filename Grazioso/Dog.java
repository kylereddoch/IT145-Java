package Grazioso;

/**
 * <p>This class, which extends the RescueAnimal class, is used to create the Dog object. The Dog object is used to store information about a dog that is processed in through Grazioso Salvare.</p>
 * <p>This was created for my Java programming class at Southern New Hampshire University (IT145).</p>
 * <p>Professor: Ahlam Alhweiti</p>
 * 
 * @author Kyle Reddoch
 * @version %I%, %G%
 */
public class Dog extends RescueAnimal {

    // Instance variables for Dog
    private String breed; // Breed of Dog

    /**
     * <p>This is the constructor for the Dog class. It is used to create the Dog object.</p>
     * 
     * @author Kyle Reddoch
     * @version %I%, %G%
     * 
     * @param name Name of the dog
     * @param breed Breed of the dog
     * @param gender Gender of the dog 
     * @param age Age of the dog
     * @param weight Weight of the dog
     * @param acquisitionDate Acquisition date of the dog
     * @param acquisitionCountry Acquisition country of the dog
     * @param trainingStatus Training status of the dog
     * @param reserved Reserved status of the dog
     * @param inServiceCountry In service country of the dog
     */
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    /**
     * <p>This is the accessor method for the breed of the dog.</p>
     * 
     * @author Kyle Reddoch
     * @version %I%, %G%
     * 
     * @return breed of the dog
     */
    public String getBreed() { // Accessor method for breed
        return breed;
    }

    /**
     * <p>This is the mutator method for the breed of the dog.</p>
     * 
     * @author Kyle Reddoch
     * @version %I%, %G%
     * 
     * @param dogBreed Breed of the dog
     */
    public void setBreed(String dogBreed) { // Mutator method for breed
        breed = dogBreed;
    }

    /**
     * <p>This is the toString method for the Dog class. It is used to return the information about the dog.</p>
     * 
     * @author Kyle Reddoch
     * @version %I%, %G%
     * 
     * @return String containing the information about the dog
     */
    @Override // Overriding the toString method
    public String toString() {
        return getName() + ",       " + getTrainingStatus() + ",       " + getAcquisitionCountry() + ",       " + getReserved() + "\n";
    }

}
