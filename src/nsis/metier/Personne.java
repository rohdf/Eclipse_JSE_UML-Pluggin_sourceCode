/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package nsis.metier;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Personne.
 * 
 * @author Rohdri Frimat
 */
public class Personne {
	/**
	 * Description of the property nom.
	 */
	private String nom = "";

	/**
	 * Description of the property prenom.
	 */
	private String prenom = "";

	/**
	 * Description of the property age.
	 */
	private Integer age = Integer.valueOf(0);

	// Start of user code (user defined attributes for Personne)

	// End of user code

	/**
	 * The constructor.
	 */
	public Personne() {
		// Start of user code constructor for Personne)
		super();
		// End of user code
	}
	
	

	// Start of user code (user defined methods for Personne)

	public Personne(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}



	// End of user code
	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
		this.nom = newNom;
	}

	/**
	 * Returns prenom.
	 * @return prenom 
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * Sets a value to attribute prenom. 
	 * @param newPrenom 
	 */
	public void setPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}

	/**
	 * Returns age.
	 * @return age 
	 */
	public Integer getAge() {
		return this.age;
	}

	/**
	 * Sets a value to attribute age. 
	 * @param newAge 
	 */
	public void setAge(Integer newAge) {
		this.age = newAge;
	}

}
