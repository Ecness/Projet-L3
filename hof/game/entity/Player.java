package hof.game.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import hof.game.card.Equipment;

public class Player {
	
	private String name;
	
	// player card
	private Equipment weapon;
	private Equipment shield;
	private List<Equipment> accessory;
	
	// player stats
	
	private int gold;
	private int food;
	private int hp;
	private int reputation;
	private int attack;
	private int defence;
	
	public Player(String name) {
		super();
		this.name = name;
		
		this.shield = new Equipment(null, 0, 0);
		this.weapon = new Equipment(null, 0, 0);
		this.accessory = new ArrayList<Equipment>() ;
		
		
		this.food = 20;
		this.reputation = 100;
		this.gold = 0;
		this.attack = 0;
		this.defence = 0;
		
	}

	
}
