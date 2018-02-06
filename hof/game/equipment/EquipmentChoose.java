package hof.game.equipment;

public class EquipmentChoose {

	// card type
	private boolean equipementShield;
	private boolean equipementWeapon;
	private boolean equipementArmor;
	private boolean equipementAccessorie;
	
	// effect
	private int attack;
	private int defence;
	
	
	public EquipmentChoose(EnumEquipment type, int attack, int defence) {
		super();
		
		switch (type) {
		case Shield:
			
			this.equipementShield = true;
			this.equipementWeapon = false;
			this.equipementArmor = false;
			this.equipementAccessorie = false;
			
			this.attack = attack;
			this.defence = defence;
			
			break;

		case Weapon:
			
			this.equipementShield = false;
			this.equipementWeapon = true;
			this.equipementArmor = false;
			this.equipementAccessorie = false;
			
			this.attack = attack;
			this.defence = defence;
			
			break;
		case Armor:
	
			this.equipementShield = false;
			this.equipementWeapon = false;
			this.equipementArmor = true;
			this.equipementAccessorie = false;
			
			this.attack = attack;
			this.defence = defence;
			
			break;
	
		case Accessorie:
	
			this.equipementShield = false;
			this.equipementWeapon = false;
			this.equipementArmor = false;
			this.equipementAccessorie = true;
			
			this.attack = attack;
			this.defence = defence;
			
			break;
	
		default:
			
			this.equipementShield = false;
			this.equipementWeapon = false;
			this.equipementArmor = false;
			this.equipementAccessorie = false;
			
			this.attack = 0;
			this.defence = 0;
			
			break;
		}
		
	}

	
}
