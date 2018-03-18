package hof.game.card;

import hof.game.equipment.EnumEquipment;
import hof.game.equipment.EquipmentChoose;

public class Equipment{
	//Stat de l'equipement
	private EquipmentChoose equipmentCard;
	//Nom de l'equipement
	private String nom;
	//Id de la carte
	private int id;
	
	//Constructeur
	public Equipment(String nom,int id,EnumEquipment type, int attack, int defence) {
		this.nom = nom;
		this.id = id;
		this.equipmentCard = new EquipmentChoose(type, attack, defence);
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
	
	public EquipmentChoose getEquipmentCard() {
		return equipmentCard;
	}
	
	public void setEquipmentCard(EquipmentChoose equipmentCard) {
		this.equipmentCard = equipmentCard;
	}

}
