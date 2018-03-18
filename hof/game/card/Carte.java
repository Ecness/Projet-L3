package hof.game.card;

import hof.game.event.EnumEvent;

public class Carte {
	//Nom de la carte
	String nom = "";
	//Id de la Carte
	int id = 0;
	//Type D'evenement de la carte
	EnumEvent type;
	
	//Constructeur
	public Carte(String nom, int id,EnumEvent type) {
		super();
		this.nom = nom;
		this.id = id;
		this.type = type;
	}
	
	//Getters & Setters
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public EnumEvent getType() {
		return type;
	}

	public void setType(EnumEvent type) {
		this.type = type;
	}
	
}
