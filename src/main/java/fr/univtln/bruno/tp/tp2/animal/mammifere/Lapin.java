package fr.univtln.bruno.tp.tp2.animal.mammifere;

import fr.univtln.bruno.tp.tp2.animal.comportement.ComportementHerbivore;
import fr.univtln.bruno.tp.tp2.animal.comportement.IHerbivore;
import fr.univtln.bruno.tp.tp2.plante.Plante;

/**
 * The Class Lapin.
 */
public class Lapin extends Mammifere implements IHerbivore {

	/**
	 * Instantiates a new lapin.
	 * 
	 * @param sexe
	 *            the sexe
	 * @param dureeGestation
	 *            the duree gestation
	 */
	public Lapin(String nom, Sexe sexe, int dureeGestation) {
		super(nom,sexe, dureeGestation);
	}

	@Override
	public String getMoyenExpression() {
		return "Je clapis";
	}

	private ComportementHerbivore comportementHerbivore = new ComportementHerbivore();

	/**
	 * @param plante
	 * @see ComportementHerbivore#manger(Plante)
	 */
	public void manger(Plante plante) {
		comportementHerbivore.manger(plante);
	}

}
