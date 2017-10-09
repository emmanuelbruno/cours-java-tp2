/**
 *
 */
package fr.univtln.bruno.tp.tp2.animal;

/**
 * The Class Animal.
 *
 * @author bruno
 */
public abstract class Animal {

    /**
     * The Constant NB_MAX_ANIMAUX.
     */
    public final static int NB_MAX_ANIMAUX = 100;

    /**
     * The animaux.
     */
    private static Animal[] animaux = new Animal[NB_MAX_ANIMAUX];

    /**
     * The last animal.
     */
    private static int lastAnimal = 0;
    /**
     * Its name
     */
    private String nom;

    ;
    /**
     * The sexe.
     */
    private Sexe sexe;

    /**
     * Instantiates a new animal.
     *
     * @param sexe the sexe
     */
    public Animal(String nom, Sexe sexe) throws Exception {
        super();
        this.nom = nom;
        this.sexe = sexe;
        animaux[lastAnimal++] = this;
    }

    /**
     * Afficher tout les animaux qui ont été créés en utilisant une méthode
     * abstraite qui sera définie dans les sous-clases.
     */
    public static void afficherTout() {
        System.out.println("-- Affichage de tous les animaux --");
        int animalIndex = 0;
        while (animalIndex < Animal.lastAnimal)
            System.out.println(animaux[animalIndex] + ": " + animaux[animalIndex].getPresentation() + animaux[animalIndex++].getMoyenExpression());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the sexe.
     *
     * @return the sexe
     */
    public Sexe getSexe() {
        return sexe;
    }

    /**
     * Sets the sexe.
     *
     * @param sexe the sexe to set
     */
    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getPresentation() {
        return "Je suis un animal.";
    }

    /**
     * Gets the moyen expression.
     *
     * @return the moyen expression
     */
    public abstract String getMoyenExpression();

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                '}';
    }

    /**
     * The Enum Sexe.
     */
    public enum Sexe {
        MALE, FEMELLE
    }
}
