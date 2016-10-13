/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package nsis.metier;

import java.util.UUID;

import nsis.metier.Personne;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Salarie.
 * 
 * @author Rohdri Frimat
 */
public class Salarie extends Personne {
	/**
	 * Description of the property adresse.
	 */
	private String adresse = "";

	/**
	 * Description of the property salaire.
	 */
	private Integer salaire = Integer.valueOf(0);

	/**
	 * Description of the property identifiant.
	 */
	private UUID identifiant;

	// Start of user code (user defined attributes for Salarie)

	// End of user code

	/**
	 * The constructor.
	 */
	public Salarie() {
		// Start of user code constructor for Salarie)
		super();
		// End of user code
	}



	public Salarie(String nom, String prenom, Integer age, String adresse, Integer salaire) {
		super(nom, prenom, age);
		this.adresse = adresse;
		this.salaire = salaire;
		//Gestion de identifiant par l'Entreprise
		this.identifiant = null;
	}

	
	// Start of user code (user defined methods for Salarie)
	// End of user code
	/**
	 * Returns adresse.
	 * @return adresse 
	 */
	public String getAdresse() {
		return this.adresse;
	}

	/**
	 * Sets a value to attribute adresse. 
	 * @param newAdresse 
	 */
	public void setAdresse(String newAdresse) {
		this.adresse = newAdresse;
	}

	/**
	 * Returns salaire.
	 * @return salaire 
	 */
	public Integer getSalaire() {
		return this.salaire;
	}

	/**
	 * Sets a value to attribute salaire. 
	 * @param newSalaire 
	 */
	public void setSalaire(Integer newSalaire) {
		this.salaire = newSalaire;
	}

	/**
	 * Returns identifiant.
	 * @return identifiant 
	 */
	public UUID getIdentifiant() {
		return this.identifiant;
	}

	/**
	 * Sets a value to attribute identifiant. 
	 * @param newIdentifiant 
	 */
	public void setIdentifiant(UUID newIdentifiant) {
		this.identifiant = newIdentifiant;
	}

}
