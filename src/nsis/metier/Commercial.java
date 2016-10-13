/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package nsis.metier;

import nsis.metier.Salarie;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Commercial.
 * 
 * @author Rohdri Frimat
 */
public class Commercial extends Salarie {
	/**
	 * Description of the property prime.
	 */
	public Integer prime = Integer.valueOf(0);

	// Start of user code (user defined attributes for Commercial)

	// End of user code

	/**
	 * The constructor.
	 */
	public Commercial() {
		// Start of user code constructor for Commercial)
		super();
		// End of user code
	}

	public Commercial(String nom, String prenom, Integer age, String adresse, Integer salaire, Integer prime) {
		super(nom, prenom, age, adresse, salaire);
		this.prime = prime;
	}
	
	// Start of user code (user defined methods for Commercial)

	// End of user code
	/**
	 * Returns prime.
	 * @return prime 
	 */
	public Integer getPrime() {
		return this.prime;
	}

	/**
	 * Sets a value to attribute prime. 
	 * @param newPrime 
	 */
	public void setPrime(Integer newPrime) {
		this.prime = newPrime;
	}

}
