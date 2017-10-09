/**
 *
 */
package fr.univtln.bruno.tp.tp2;

import fr.univtln.bruno.tp.tp2.animal.Animal;
import fr.univtln.bruno.tp.tp2.animal.Animal.Sexe;
import fr.univtln.bruno.tp.tp2.animal.comportement.ICarnivore;
import fr.univtln.bruno.tp.tp2.animal.mammifere.Chien;
import fr.univtln.bruno.tp.tp2.animal.mammifere.Homme;
import fr.univtln.bruno.tp.tp2.animal.mammifere.Lapin;
import fr.univtln.bruno.tp.tp2.animal.mammifere.Mammifere;
import fr.univtln.bruno.tp.tp2.animal.oiseau.Aigle;
import fr.univtln.bruno.tp.tp2.animal.oiseau.Oiseau;

/**
 * The Class Test. Cette classe illustre l'utilisation de l'héritage et du
 * polymorphisme.
 *
 * @author bruno
 */
public class Test {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        // Création de trois classes concrètes
        Chien unChien = new Chien("Rex", Animal.Sexe.MALE, 4);
        Homme unHomme = new Homme("Jean", Animal.Sexe.MALE, 9);
        Aigle unAigle = new Aigle("Thorondor", Animal.Sexe.MALE, 100);
        Lapin unLapin = new Lapin("Jeannot", Animal.Sexe.FEMELLE, 1);

        // Création de tableaux génériques
        Animal[] animaux = {unChien, unHomme, unAigle, unLapin};
        animaux[0].setSexe(Sexe.MALE);

        Mammifere[] mammiferes = {unHomme, unChien};
        mammiferes[0].setDureeGestation(9);

        Oiseau[] oiseaux = {unAigle};
        oiseaux[0].setTailleDuBec(5);

        // Un exemple de downcast
        ((Aigle) oiseaux[0]).setEnvergure(95);

        // Utilisation du polymorphisme
        for (Mammifere unMam : mammiferes)
            System.out.println(unMam + " durée de gestation :" + unMam.getDureeGestation());

        Animal.afficherTout();

        // Utilisation du polymorphisme avec des Interfaces
        // Les classes utilisent la delegation par aggregation
        // pour factoriser du code (ComportementCarnivore et
        // ComportementHerbivore)
        ICarnivore[] carnivores = {unChien, unHomme, unAigle};
        for (ICarnivore carnivore : carnivores)
            carnivore.manger(unLapin);
    }

}
