package fr.univtln.bruno.tp.tp2.animal.mammifere;

import fr.univtln.bruno.tp.tp2.animal.Animal;
import fr.univtln.bruno.tp.tp2.animal.comportement.ComportementCarnivore;
import fr.univtln.bruno.tp.tp2.animal.comportement.ICarnivore;

public class Chien extends Mammifere implements ICarnivore {

    private boolean collier;
    private ComportementCarnivore comportementCarnivore = new ComportementCarnivore();

    /**
     * Instantiates a new chien.
     *
     * @param sexe           the sexe
     * @param dureeGestation the duree gestation
     */
    public Chien(String nom, Sexe sexe, int dureeGestation) {
        super(nom, sexe, dureeGestation);
    }

    /**
     * @return the collier
     */
    public boolean isEquipeCollier() {
        return collier;
    }

    /**
     * @param collier the collier to set
     */
    public void setCollier(boolean collier) {
        this.collier = collier;
    }

    public String getPresentation() {
        return super.getPresentation() + "Je suis un chien.";
    }

    @Override
    public String getMoyenExpression() {
        return "J'aboie";
    }

    /**
     * @see ComportementCarnivore#manger(Animal)
     */
    public void manger(Animal animal) {
        comportementCarnivore.manger(animal);
    }

}
