package hof.game.entity;

import hof.game.card.Equipment;

public class Player {

	private String name;

	// Equipement du heros

	private Equipment weapon;
	private Equipment shield;
	private Equipment armor;
	private Equipment accessory;

	// Stats du heros

	private int gold;
	private int food;
	private int hp;
	private int reputation;
	private int attack;
	private int defence;

	public Player(String name) {
		super();
		this.name = name;

		this.shield = new Equipment(null, 0, null, 0, 0);
		this.weapon = new Equipment(null, 0, null, 0, 0);
		this.armor = new Equipment(null, 0, null, 0, 0);
		this.accessory = new Equipment(null, 0, null, 0, 0);

		this.gold = 0;
		this.food = 0;
		this.hp = 100;
		this.reputation = 0;	
		this.attack = 0;
		this.defence = 0;

	}

	//Fonction de reset des stats(utiliser apres la fonction defence en combat, ou l'obtention d'un nouvel equipement)
	void reset()
	{
		this.attack = this.weapon.getEquipmentCard().getAttack() + this.shield.getEquipmentCard().getAttack() + this.armor.getEquipmentCard().getAttack() + this.accessory.getEquipmentCard().getAttack();
		this.defence = this.weapon.getEquipmentCard().getDefence() + this.shield.getEquipmentCard().getDefence() + this.armor.getEquipmentCard().getDefence() + this.accessory.getEquipmentCard().getDefence();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Equipment getWeapon() {
		return weapon;
	}

	public void setWeapon(Equipment weapon) {
		this.weapon = weapon;
	}

	public Equipment getShield() {
		return shield;
	}

	public void setShield(Equipment shield) {
		this.shield = shield;
	}

	public Equipment getAccessory() {
		return accessory;
	}

	public void setAccessory(Equipment accessory) {
		this.accessory = accessory;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public Equipment getArmor() {
		return armor;
	}

	public void setArmor(Equipment armor) {
		this.armor = armor;
	}

}
