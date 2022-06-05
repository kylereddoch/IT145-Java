/**
 * Author: Kyle Reddoch
 * Professor: Ahlam Alhweiti
 * Southern New Hampshire University
 * Version: 1.0
 * 
 */

package Grazioso;

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }

	// Accessor Method for name
	public String getName() {
		return name;
	}

	// Mutator Method for name
	public void setName(String name) {
		this.name = name;
	}

	// Accessor Method for animalType
	public String getAnimalType() {
		return animalType;
	}

	// Mutator Method for animalType
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	// Accessor Method for gender
	public String getGender() {
		return gender;
	}


	// Mutator type for gender
	public void setGender(String gender) {
		this.gender = gender;
	}


	// Accessor Method for age
	public String getAge() {
		return age;
	}

	// Mutator Method for age
	public void setAge(String age) {
		this.age = age;
	}

	// Accessor Method for weight
	public String getWeight() {
		return weight;
	}

	// Mutator Method for weight
	public void setWeight(String weight) {
		this.weight = weight;
	}

	// Accessor Method for acquisitionDate
	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	// Mutator Method for acquisitionDate
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	// Accessor Method for acquisitionCountry
	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	// Mutator Method for acquisitionCountry
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	// Accessor Method for reserved
	public boolean getReserved() {
		return reserved;
	}

	// Mutator Method for reserved
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	// Accessor Method for inServiceCountry
	public String getInServiceLocation() {
		return inServiceCountry;
	}

	// Mutator Method for inServiceCountry
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	// Accessor Method for trainingStatus
	public String getTrainingStatus() {
		return trainingStatus;
	}

	// Mutator Method for trainingStatus
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
