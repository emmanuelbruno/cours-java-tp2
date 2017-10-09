package fr.univtln.bruno.tp.tp2.animal.oiseau;

import fr.univtln.bruno.tp.tp2.animal.Animal;
import fr.univtln.bruno.tp.tp2.animal.comportement.ComportementCarnivore;
import fr.univtln.bruno.tp.tp2.animal.comportement.ICarnivore;

/**
 * The Class Aigle.
 */
public class Aigle extends Oiseau implements ICarnivore {

	/** The envergure. */
	private int envergure;

	/**
	 * Instantiates a new aigle.
	 * 
	 * @param sexe
	 *            the sexe
	 * @param envergure
	 *            the envergure
	 */
	public Aigle(String nom, Sexe sexe, int envergure) {
		super(nom, sexe);
		this.envergure = envergure;
	}

	/**
	 * Gets the envergure.
	 * 
	 * @return the envergure
	 */
	public int getEnvergure() {
		return envergure;
	}

	/**
	 * Sets the envergure.
	 * 
	 * @param envergure
	 *            the envergure to set
	 */
	public void setEnvergure(int envergure) {
		this.envergure = envergure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String getPresentation() {
		return super.getPresentation() + "Je suis un aigle.";
	}

	@Override
	public String getMoyenExpression() {
		return "Je trompette";
	}

	private ComportementCarnivore comportementCarnivore = new ComportementCarnivore();

	/**
	 * 
	 * @see ComportementCarnivore#manger(Animal)
	 */
	public void manger(Animal animal) {
		comportementCarnivore.manger(animal);
	}

}
