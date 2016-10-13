/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package nsis.app;

import nsis.metier.Commercial;
import nsis.metier.Entreprise;
import nsis.metier.Salarie;

/**
 * Description of EntrepriseApp.
 * 
 * @author Rohdri Frimat
 */
public class EntrepriseApp {


	/**
	 * Description of the method main.
	 * @param args 
	 */
	public static void main(String[] args) {
		//Création de salariés
		Salarie s1 = new Salarie("THIBAUT", "Frank", 26, "à 2 rue d'Issy", 2300);
		Salarie s2 = new Salarie("HANG", "Nicholas", 26, "rue des mort du RER C", 2300);
		Salarie s3 = new Salarie("HANG", "François", 29, "rue des mort du RER C", 2300);
		Salarie s4 = new Salarie("GOLVAN", "Loïc", 56, "rue des illustration numérique", 2300);
		Salarie s5 = new Salarie("???", "Pascal", 56, "rue très loin de là", 2300);
		Salarie s6 = new Salarie("FRIMAT", "Rohdri", 31, "rue du code java", 2300);
		
		Commercial c1 = new Commercial("MARS", "Nathalie", 35, "Pas ici", 3200, 200);
		Commercial c2 = new Commercial("MARS", "Nathalie", 55, "Là bas", 5200, 500);
		
		//Ajout des salariés à l'Entreprise
		Entreprise nsis = new Entreprise();
		nsis.addSalarie(s1);
		nsis.addSalarie(s2);
		nsis.addSalarie(s3);
		nsis.addSalarie(s4);
		nsis.addSalarie(s5);
		nsis.addSalarie(s6);
		nsis.addSalarie(c1);
		nsis.addSalarie(c2);

		//Affichage des employés de l'Entreprise
		System.out.println("\n\n###############################################################");
		System.out.println("Affichage de tous les salariés");
		nsis.afficherTousLesSalaries();
		
		//Trouver les 2 Nathalie Mars
		System.out.println("\n\n###############################################################");
		System.out.println("\nRésultat sur la recherche du salarié nommé Nathalie MARS");
		Salarie aSupprimer = null;
		for(Salarie s:nsis.findSalaries("MARS", "Nathalie")){
			aSupprimer = s;
			Entreprise.afficherUnSalarie(s);
		}
		
		//Suppression d'une Nathalie Mars
		System.out.println("\n\n###############################################################");
		System.out.println("Personne à supprimer:");
		Entreprise.afficherUnSalarie(aSupprimer);
		nsis.removeSalarie(aSupprimer);
		
		//Affichage des nouvelles personnes
		System.out.println("\n\n###############################################################");
		System.out.println("Affichage des salariés après suppression");
		nsis.afficherTousLesSalaries();
		
		
		
		
	}


}
