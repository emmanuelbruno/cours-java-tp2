package fr.univtln.bruno.tp.tp2.animal.mammifere;

import fr.univtln.bruno.tp.tp2.animal.Animal;
import fr.univtln.bruno.tp.tp2.animal.comportement.ComportementCarnivore;
import fr.univtln.bruno.tp.tp2.animal.comportement.ComportementHerbivore;
import fr.univtln.bruno.tp.tp2.animal.comportement.IOmnivore;
import fr.univtln.bruno.tp.tp2.plante.Plante;

public class Homme extends Mammifere implements IOmnivore {

	/**
	 * Instantiates a new homme.
	 * 
	 * @param sexe
	 *            the sexe
	 * @param dureeGestation
	 *            the duree gestation
	 */
	public Homme(String nom, Sexe sexe, int dureeGestation) {
		super(nom, sexe, dureeGestation);
	}


	public String getPresentation() {
		return super.getPresentation() + "Je suis un homme.";
	}

	@Override
	public String getMoyenExpression() {
		return "Je parle";
	}

	private ComportementCarnivore comportementCarnivore = new ComportementCarnivore();

	/**
	 * 
	 * @see ComportementCarnivore#manger(Animal)
	 */
	public void manger(Animal animal) {
		comportementCarnivore.manger(animal);
	}

	/** The comportement herbivore. */
	private ComportementHerbivore comportementHerbivore = new ComportementHerbivore();

	/**
	 * @param plante
	 * @see ComportementHerbivore#manger(Plante)
	 */
	public void manger(Plante plante) {
		comportementHerbivore.manger(plante);
	}

}
