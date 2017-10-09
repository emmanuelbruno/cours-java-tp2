package fr.univtln.bruno.coursjava.tp.tp2.animal.comportement;

import fr.univtln.bruno.coursjava.tp.tp2.plante.Plante;

public class ComportementHerbivore {
	/**
	 * Manger.
	 */
	public void manger(Plante plante) {
		System.out.println("Je mange " + plante + " " + plante.getNom());
	}

}
