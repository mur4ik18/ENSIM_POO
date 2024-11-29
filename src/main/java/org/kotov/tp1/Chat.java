package org.kotov.tp1;
public class Chat extends Animal {

	public Chat(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal, typeAnimal);
	}

	@Override
	public String getNomAnimal() {
		return "Le Chat " + super.getNomAnimal();
	}
}
