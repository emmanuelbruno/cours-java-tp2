/**
 * 
 */
package fr.univtln.bruno.coursjava.tp.tp2.plante;

/**
 * @author bruno
 *
 */
public class Plante {
	private String nom;

	public Plante(String nom) {
		super();
		this.setNom(nom);
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

}