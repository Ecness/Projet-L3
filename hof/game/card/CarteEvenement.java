package hof.game.card;

import java.util.ArrayList;

import hof.game.event.Battle;
import hof.game.event.CardChoose;
import hof.game.event.Choice;
import hof.game.event.Dice;


public class CarteEvenement {
	//Deck des cartes de Choix d'actions
	ArrayList<Choice> deckC = new ArrayList<Choice>();
	//Deck des cartes de Lancer de dés
	ArrayList<Dice> deckD = new ArrayList<Dice>();
	//Deck des cartes de Combat
	ArrayList<Battle> deckB = new ArrayList<Battle>();
	//Deck des Cartes de Choix de Cartes Equipement
	ArrayList<CardChoose> deckCC = new ArrayList<CardChoose>();
	
	//constructeur
	public void CarteEvenement()
	{
		//Charger fichier avec les decks fait???
	}
	
	
	
	//Getters & Setters
	public ArrayList<Choice> getDeckC() {
		return deckC;
	}
	
	public void setDeckC(ArrayList<Choice> deckC) {
		this.deckC = deckC;
	}
	
	public ArrayList<Dice> getDeckD() {
		return deckD;
	}
	
	public void setDeckD(ArrayList<Dice> deckD) {
		this.deckD = deckD;
	}
	
	public ArrayList<Battle> getDeckB() {
		return deckB;
	}
	
	public void setDeckB(ArrayList<Battle> deckB) {
		this.deckB = deckB;
	}
	
	public ArrayList<CardChoose> getDeckCC() {
		return deckCC;
	}
	
	public void setDeckCC(ArrayList<CardChoose> deckCC) {
		this.deckCC = deckCC;
	}
	
}
