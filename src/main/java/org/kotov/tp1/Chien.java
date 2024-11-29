package org.kotov.tp1;
public class Chien extends Animal {

	public Chien(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal, typeAnimal);
	}

	@Override
	public String getNomAnimal() {
		return "Le Chien " + super.getNomAnimal();
	}
}
