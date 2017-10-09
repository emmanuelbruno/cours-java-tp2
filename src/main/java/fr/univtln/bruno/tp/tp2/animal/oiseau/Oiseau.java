package fr.univtln.bruno.tp.tp2.animal.oiseau;

import fr.univtln.bruno.tp.tp2.animal.Animal;

public abstract class Oiseau extends Animal {

    /**
     * The taille du bec.
     */
    private int tailleDuBec;

    /**
     * Instantiates a new oiseau.
     *
     * @param sexe the sexe
     */
    public Oiseau(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    /**
     * @return the tailleDuBec
     */
    public int getTailleDuBec() {
        return tailleDuBec;
    }

    /**
     * @param tailleDuBec the tailleDuBec to set
     */
    public void setTailleDuBec(int tailleDuBec) {
        this.tailleDuBec = tailleDuBec;
    }

    public String getPresentation() {
        return super.getPresentation() + "Je suis un oiseau.";
    }

}
