/*
 * Author: Kyle Reddoch
 * Professor: Ahlam Alhweiti
 * Southern New Hampshire University
 * Version: 1.0
 * 
 */

package Grazioso;

public class Monkey extends RescueAnimal {
	
    // Instance variables
	private String tailLength; // Length of Monkeys tail
	private String height; // Height of Monkeys
	private String bodyLength; // Length of Monkeys Body
	private String species; // Species of Monkeys

	
	// Constructor
	public Monkey(String name, String species, String tailLength, String height, String bodyLength, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

    // Accessor Method for tailLength
	public String getTailLength() {
		return tailLength;
	}

    // Mutator Method for tailLength
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

    // Accessor Method for height
	public String getHeight() {
		return height;
	}

    // Mutator Method for height
	public void setHeight(String height) {
		this.height = height;
	}

    // Accessor Method for bodyLength
	public String getBodyLength() {
		return bodyLength;
	}

    // Mutator Method for bodyLength
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

    // Accessor Method for species
	public String getSpecies() {
		return species;
	}

    // Mutator Method for species
	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
    public String toString() {
        return getName() + ",       " + getTrainingStatus() + ",       " + getAcquisitionLocation() + ",       " + getReserved() + "\n";
	}
}