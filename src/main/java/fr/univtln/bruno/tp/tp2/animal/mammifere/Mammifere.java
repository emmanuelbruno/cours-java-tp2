package fr.univtln.bruno.tp.tp2.animal.mammifere;

import fr.univtln.bruno.tp.tp2.animal.Animal;

/**
 * The Class Mammifere.
 */
public abstract class Mammifere extends Animal {
	
	/**
	 * Instantiates a new mammifere.
	 *
	 * @param sexe the sexe
	 * @param dureeGestation the duree gestation
	 */
	public Mammifere(String nom, Sexe sexe, int dureeGestation) {
		super(nom,sexe);
		this.dureeGestation = dureeGestation;
	}

	/** The duree gestation. */
	private int dureeGestation;

	/**
	 * Gets the duree gestation.
	 *
	 * @return the dureeGestation
	 */
	public int getDureeGestation() {
		return dureeGestation;
	}

	/**
	 * Sets the duree gestation.
	 *
	 * @param dureeGestation the dureeGestation to set
	 */
	public void setDureeGestation(int dureeGestation) {
		this.dureeGestation = dureeGestation;
	}

	@Override
	public String getPresentation() {
		return super.getPresentation() + "Je suis un mammifere.";
	}

}
