package org.kotov.tp1;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux = new ArrayList<>();
    private final int nbVisiteurMaxParSecteur = 15;

    public void ajouterSecteur(TypeAnimal typeAnimal) {
        secteursAnimaux.add(new Secteur(typeAnimal));
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {
        if (getLimiteVisiteur() <= visiteurs) {
            throw new LimiteVisiteurException("Limite de visiteurs atteinte !");
        }
        visiteurs++;
    }

    public int getLimiteVisiteur() {
        return secteursAnimaux.size() * nbVisiteurMaxParSecteur;
    }

    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        for (Secteur secteur : secteursAnimaux) {
            if (secteur.getType() == animal.getTypeAnimal()) {
                secteur.ajouterAnimal(animal);
                return;
            }
        }
        throw new AnimalDansMauvaisSecteurException("Animal dans un mauvais secteur !");
    }

    public int nombreAnimaux() {
        int total = 0;
        for (Secteur secteur : secteursAnimaux) {
            total += secteur.getNombreAnimaux();
        }
        return total;
    }
}
