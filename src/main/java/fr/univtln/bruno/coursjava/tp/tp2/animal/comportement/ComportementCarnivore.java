package fr.univtln.bruno.coursjava.tp.tp2.animal.comportement;

import fr.univtln.bruno.coursjava.tp.tp2.animal.Animal;

public class ComportementCarnivore {

	/**
	 * Manger.
	 */
	public void manger(Animal animal) {
		System.out.println("Je mange " + animal.getClass().getCanonicalName());
	}
}
