package Grazioso;

/**
 * <p>This class, which extends the RescueAnimal class, is used to create the Monkey object. The Monkey object is used to store information about a monkey that is processed in through Grazioso Salvare.</p>
 * <p>This was created for my Java programming class at Southern New Hampshire University (IT145).</p>
 * <p>Professor: Ahlam Alhweiti</p>
 * 
 * @author Kyle Reddoch
 * @version %I%, %G%
 */
public class Monkey extends RescueAnimal {
	
    // Instance variables
	private String tailLength; // Length of Monkeys tail
	private String height; // Height of Monkeys
	private String bodyLength; // Length of Monkeys Body
	private String species; // Species of Monkeys

	
	/**
	 * <p>This is the constructor for the Monkey class. It is used to create the Monkey object.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param name Name of the monkey
	 * @param tailLength Length of the monkey's tail
	 * @param height Height of the monkey
	 * @param bodyLength Length of the monkey's body
	 * @param species Species of the monkey
	 * @param gender Gender of the monkey
	 * @param age Age of the monkey
	 * @param weight Weight of the monkey
	 * @param acquisitionDate Acquisition date of the monkey
	 * @param acquisitionCountry Acquisition country of the monkey
	 * @param trainingStatus Training status of the monkey
	 * @param reserved Reserved status of the monkey
	 * @param inServiceCountry In service country of the monkey
	 */ 
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
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

    /**
	 * <p>This is the accessor method for the tail length of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return tail length of the monkey
	 */
	public String getTailLength() { // Accessor method for tailLength
		return tailLength;
	}

    /**
	 * <p>This is the mutator method for the tail length of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param tailLength Length of the monkey's tail
	 */
	public void setTailLength(String tailLength) { // Mutator method for tailLength
		this.tailLength = tailLength;
	}

    /**
	 * <p>This is the accessor method for the height of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return height of the monkey
	 */
	public String getHeight() { // Accessor method for height
		return height;
	}

    /**
	 * <p>This is the mutator method for the height of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param height Height of the monkey
	 */
	public void setHeight(String height) { // Mutator method for height
		this.height = height;
	}

    /**
	 * <p>This is the accessor method for the body length of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return body length of the monkey
	 */
	public String getBodyLength() { // Accessor method for bodyLength
		return bodyLength;
	}

    /**
	 * <p>This is the mutator method for the body length of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param bodyLength Length of the monkey's body
	 */
	public void setBodyLength(String bodyLength) { // Mutator method for bodyLength
		this.bodyLength = bodyLength;
	}

    /**
	 * <p>This is the accessor method for the species of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return species of the monkey
	 */
	public String getSpecies() { // Accessor method for species
		return species;
	}

    /**
	 * <p>This is the mutator method for the species of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @param species Species of the monkey
	 */
	public void setSpecies(String species) { // Mutator method for species
		this.species = species;
	}
	
	/**
	 * <p>This is the toString method for the Monkey class. It is used to return the information of the monkey.</p>
	 * 
	 * @author Kyle Reddoch
	 * @version %I%, %G%
	 * 
	 * @return String containing the information about the monkey
	 */
	@Override
    public String toString() { // Overrides the toString method
        return getName() + ",       " + getTrainingStatus() + ",       " + getAcquisitionCountry() + ",       " + getReserved() + "\n";
	}
}