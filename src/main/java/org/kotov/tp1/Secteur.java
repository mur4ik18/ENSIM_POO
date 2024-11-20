package org.kotov.tp1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur = new ArrayList<>();

    public Secteur(TypeAnimal typeAnimauxDansSecteur) {
        this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
    }

    public void ajouterAnimal(Animal animal) {
        animauxDansSecteur.add(animal);
    }

    public int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    public TypeAnimal getType() {
        return typeAnimauxDansSecteur;
    }
}
