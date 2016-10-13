/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package nsis.metier;

import java.util.HashSet;
import java.util.UUID;

import nsis.metier.Salarie;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Entreprise.
 * 
 * @author Rohdri Frimat
 */
public class Entreprise {
	/**
	 * Description of the property adresse.
	 */
	public String adresse = "";

	/**
	 * Description of the property salaries.
	 */
	public HashSet<Salarie> salaries = new HashSet<Salarie>();

	// Start of user code (user defined attributes for Entreprise)

	// End of user code

	/**
	 * The constructor.
	 */
	public Entreprise() {
		// Start of user code constructor for Entreprise)
		super();
		// End of user code
	}

	/**
	 * Description of the method addSalarie.
	 * @param salarie 
	 * @return 
	 */
	public Boolean addSalarie(Salarie salarie) {
		// Start of user code for method addSalarie
		Boolean addSalarie = Boolean.FALSE;
		
		if(!(this.getSalaries().contains(salarie) || salarie.getIdentifiant()!=null)){
			this.giveIdToSalarie(salarie);
			this.getSalaries().add(salarie);
			addSalarie = Boolean.TRUE;
		}else{
			System.out.println("Le salarié existe déjà dans l'entreprise ou son ID n'est pas null");
			System.out.println("La gestion des ID des salariés est prise en charge automatiquement par le système !!!");
		}
			
		return addSalarie;
		// End of user code
	}

	/**
	 * Description of the method addSalarie.
	 * @param salarie 
	 * @return 
	 */
	public Boolean giveIdToSalarie(Salarie salarie) {
		// Start of user code for method addSalarie
		Boolean IdSalarieOk = Boolean.FALSE;
		salarie.setIdentifiant(UUID.randomUUID());;
		return IdSalarieOk;
		// End of user code
	}
	
	/**
	 * Description of the method findSalarie.
	 * @param nomSalarie 
	 * @param prenomSalarie 
	 * @return 
	 */
	public HashSet<Salarie> findSalaries(String nomSalarie, String prenomSalarie) {
		HashSet<Salarie> result = new HashSet<Salarie>();
		
		for(Salarie s: this.getSalaries()){
			if(s.getNom().equals(nomSalarie) && s.getPrenom().equals(prenomSalarie)){
				result.add(s);
			}
		}
		return result;

	}
	
	public void afficherTousLesSalaries(){
		for(Salarie s: this.getSalaries()){
			this.afficherUnSalarie(s);
		}
	}
	
	public static void afficherUnSalarie(Salarie s){
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("ID:"+s.getIdentifiant().toString());
		System.out.println("Nom:"+s.getNom()+" Prénom:"+s.getPrenom());
		System.out.println("Age:"+s.getAge());
		System.out.println("Adresse:"+s.getAdresse());
		System.out.print("Poste:"+s.getClass().getSimpleName()+" salaire:"+s.getSalaire());
		if(s.getClass().getSimpleName().equals("Commercial")) 
			System.out.print(" prime:"+((Commercial)s).getPrime());
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------");
	}

	/**
	 * Description of the method removeSalarie.
	 * @param salarie 
	 * @return 
	 */
	public Boolean removeSalarie(Salarie salarie) {
		return this.getSalaries().remove(salarie);
	}

	// Start of user code (user defined methods for Entreprise)

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
	 * Returns salaries.
	 * @return salaries 
	 */
	public HashSet<Salarie> getSalaries() {
		return this.salaries;
	}

	/**
	 * Sets a value to attribute salaries. 
	 * @param newSalaries 
	 */
	public void setSalaries(HashSet<Salarie> newSalaries) {
		this.salaries = newSalaries;
	}

}
