

import java.util.*;

/**
 * CLASSE A PRODUIRE PAR LES ETUDIANTS
 *
 * La classe Telecommande permet de manipuler une liste d'Appareil.
 *
 * on peut rajouter des get avec un entier en parametre pour permettre les tests
 * mais pas de set.
 *
 */
public class Telecommande {

	/**
	 * la liste des appareils a controler on utilise l'interface pour masquer
	 * l'implementation a ce niveau
	 */
	private List<Appareil> appareils;

	/**
	 * construit une telecommande sans appareil
	 */
	public Telecommande() {
		this.appareils = new ArrayList<Appareil>();
	}

	/**
	 * on ajoute un appareil a la liste des appareils controlees
	 *
	 * @param nouvelAppareil
	 *            nouvel appareil a controler
	 */
	public void ajouterAppareil(Appareil nouvelAppareil) {
		this.appareils.add(nouvelAppareil);
	}

	/**
	 * permet d'activer un appareil a partir de la telecommande
	 *
	 * @param indiceAppareil
	 *            indice de l'appareil a activer dans la telecommande
	 */
	public void activerAppareil(int indiceAppareil) {

		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).allumer();
	}

	/**
	 * permet de desactiver un appareil en utilisant la telecommande
	 *
	 * @param indiceAppareil
	 *            indice de l'appareil a eteindre
	 */
	public void desactiverAppareil(int indiceAppareil) {
		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).eteindre();
	}

	/**
	 * permet d'activer l'ensemble des appareils
	 */
	public void activerTout() {
		for (int i = 0; i < this.appareils.size(); i++)
			// reutiliser du code existant
			this.activerAppareil(i);
	}

	/**
	 * descriptif de la telecommande retourne une ligne par appareil suivi du
	 * status de l'appareil.
	 */
	public String toString() {
		String descriptif = "";
		for (int i = 0; i < this.appareils.size(); i++) {
			descriptif += i + "-" + this.appareils.get(i) + "\n";
		}
		return (descriptif);
	}

	/**
	 * get qui retourne un appareil utile pour les tests
	 *
	 * @param indiceAppareil
	 *            indice de l'appareil a tester
	 * @return l'appareil a l'indice indiceAppareil
	 */
	public Appareil getAppareil(int indiceAppareil) {
		if (indiceAppareil < this.appareils.size())
			return (this.appareils.get(indiceAppareil));
		else
			return(null);
	}

	/**
	 * get qui retourne la liste d'appareils
	 * @return la liste d'appareils
	 */
	public List<Appareil> getAppareils(){
		return this.appareils;
	}

}
