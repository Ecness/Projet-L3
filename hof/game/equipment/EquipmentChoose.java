package hof.game.equipment;

public class EquipmentChoose {

	//Valeur d'attaque de l'equipement
	private int attack;
	//Valeur de defence de l'equipement
	private int defence;
	//Type de l'equipement
	private EnumEquipment type;
	
	public EquipmentChoose(EnumEquipment type, int attack, int defence) {
		super();
		this.attack = attack;
		this.defence = defence;
		this.type = type;
		
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

	public EnumEquipment getType() {
		return type;
	}

	public void setType(EnumEquipment type) {
		this.type = type;
	}
	
}
