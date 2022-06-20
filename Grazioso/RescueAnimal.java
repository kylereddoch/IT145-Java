package Grazioso;

import java.lang.String;

/**
 * <p>The RescueAnimal class is used to create the RescueAnimal object. The RescueAnimal object is used to store information about the rescue animal that is processed in through Grazioso Salvare.</p>
 * <p>This was created for my Java programming class at Southern New Hampshire University (IT145).</p>
 * <p>Professor: Ahlam Alhweiti</p>
 * 
 * @author Kyle Reddoch
 * @version %I%, %G%
 */ 
public class RescueAnimal {

    // Instance variables
    private String name; // Name of the rescue animal
    private String animalType; // Animal type of the rescue animal
    private String gender; // Gender of the rescue animal
    private String age; // Age of the rescue animal
    private String weight; // Weight of the rescue animal
    private String acquisitionDate; // Acquisition date of the rescue animal
    private String acquisitionCountry; // Acquisition country of the rescue animal
	private String trainingStatus; 	// Training status of the rescue animal
    private boolean reserved; // Reserved status of the rescue animal
	private String inServiceCountry; // In service country of the rescue animal


    /**
	 * <p>This is the constructor for the RescueAnimal class. It is used to create the RescueAnimal object.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 */
    public RescueAnimal() {
    }

	/**
	 * <p>This is the accessor method for the name of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return name of the rescue animal
	 */
	public String getName() { // Accessor method for name
		return name;
	}

	/**
	 * <p>This is the mutator method for the name of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param name name of the rescue animal
	 */
	public void setName(String name) { // Mutator method for name
		this.name = name;
	}

	/**
	 * <p>This is the accessor method for the animal type of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return animal type of the rescue animal
	 */
	public String getAnimalType() { // Accessor method for animalType
		return animalType;
	}

	/**
	 * <p>This is the mutator method for the animal type of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param animalType animal type of the rescue animal
	 */
	public void setAnimalType(String animalType) { // Mutator method for animalType
		this.animalType = animalType;
	}

	/**
	 * <p>This is the accessor method for the gender of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return gender of the rescue animal
	 */ 
	public String getGender() { // Accessor method for gender
		return gender;
	}


	/**
	 * <p>This is the mutator method for the gender of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param gender gender of the rescue animal
	 */
	public void setGender(String gender) { // Mutator method for gender
		this.gender = gender;
	}


	/**
	 * <p>This is the accessor method for the age of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return age of the rescue animal
	 */
	public String getAge() { // Accessor method for age
		return age;
	}

	/**
	 * <p>This is the mutator method for the age of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param gender age of the rescue animal
	 */
	public void setAge(String age) { // Mutator method for age
		this.age = age;
	}

	/**
	 * <p>This is the accessor method for the weight of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return weight of the rescue animal
	 */
	public String getWeight() { // Accessor method for weight
		return weight;
	}

	/**
	 * <p>This is the mutator method for the weight of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param weight weight of the rescue animal
	 */
	public void setWeight(String weight) { // Mutator method for weight
		this.weight = weight;
	}

	/**
	 * <p>This is the accessor method for the acquisition date of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return acquisition date of the rescue animal
	 */
	public String getAcquisitionDate() { // Accessor method for acquisitionDate
		return acquisitionDate;
	}

	/**
	 * <p>This is the mutator method for the acquisition date of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param acquisitionDate acquisition date of the rescue animal
	 */
	public void setAcquisitionDate(String acquisitionDate) { // Mutator method for acquisitionDate
		this.acquisitionDate = acquisitionDate;
	}

	/**
	 * <p>This is the accessor method for the acquisition country of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return acquisition country of the rescue animal
	 */
	public String getAcquisitionCountry() { // Accessor method for acquisitionCountry
		return acquisitionCountry;
	}

	/**
	 * <p>This is the mutator method for the acquisition country of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param acquisitionCountry acquisition country of the rescue animal
	 */
	public void setAcquisitionCountry(String acquisitionCountry) { // Mutator method for acquisitionCountry
		this.acquisitionCountry = acquisitionCountry;
	}

	/**
	 * <p>This is the accessor method for the reservation status of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return <code>true</code> if reserved, <code>false</code> if not reserved
	 */
	public boolean getReserved() { // Accessor method for reserved
		return reserved;
	}

	/**
	 * <p>This is the mutator method for the reservation status of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param reserved reservation status of the rescue animal
	 */
	public void setReserved(boolean reserved) { // Mutator method for reserved
		this.reserved = reserved;
	}

	/**
	 * <p>This is the accessor method for the "in service" country of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return "in service" country of the rescue animal
	 */
	public String getInServiceCountry() { // Accessor method for inServiceCountry
		return inServiceCountry;
	}

	/**
	 * <p>This is the mutator method for the "in service" country of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param inServiceCountry "in service" country of the rescue animal
	 */
	public void setInServiceCountry(String inServiceCountry) { // Mutator method for inServiceCountry
		this.inServiceCountry = inServiceCountry;
	}

	/**
	 * <p>This is the accessor method for the training status date of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return training status of the rescue animal
	 */
	public String getTrainingStatus() { // Accessor method for trainingStatus
		return trainingStatus;
	}

	/**
	 * <p>This is the mutator method for the training status date of the rescue animal.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param trainingStatus training status of the rescue animal
	 */
	public void setTrainingStatus(String trainingStatus) { // Mutator method for trainingStatus
		this.trainingStatus = trainingStatus;
	}
}
