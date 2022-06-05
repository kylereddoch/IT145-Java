/*
 * Author: Kyle Reddoch
 * Professor: Ahlam Alhweiti
 * Southern New Hampshire University
 * Version: 1.0
 * 
 */

package Grazioso;

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

     /**
     * Constructors
     * @param name 
     * @param breed
     * @param gender
     * @param age
     * @param weight
     * @param acquisitionDate
     * @param acquisitionCountry
     * @param trainingStatus
     * @param reserved
     * @param inServiceCountry
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
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method for breed
    public String getBreed() {
        return breed;
    }

    // Mutator Method for breed
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    @Override
    public String toString() {
        return getName() + ",       " + getTrainingStatus() + ",       " + getAcquisitionLocation() + ",       " + getReserved() + "\n";
    }

}
