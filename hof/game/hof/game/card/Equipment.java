package hof.game.card;

import hof.game.equipment.EnumEquipment;
import hof.game.equipment.EquipmentChoose;

public class Equipment extends Card {

	private EquipmentChoose equipmentCard;

	public Equipment(EnumEquipment type, int attack, int defence) {
		super();
		this.equipmentCard = new EquipmentChoose(type, attack, defence);
	}
	
	
	
}
