package hof.game.event;

import hof.game.card.Carte;
import hof.game.card.Equipment;

public class CardChoose extends Carte{
	//Texte d'introduction de la carte
	String intro = "";
	//Texte Du choix de carte
	String[] texts = new String[2];
	//Carte a choisir
	Equipment[] Choix = new Equipment[2];
	//Texte de fin de la carte
	String outro = "";

	//Constructeur
	public CardChoose(String nom, int id,EnumEvent type, String intro, String[] texts, Equipment[] choix, String outro) {
		super(nom, id, type);
		this.intro = intro;
		this.texts = texts;
		Choix = choix;
		this.outro = outro;
	}

	//Getters & Setters

	public String getIntro() {
		return intro;
	}
	
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	public String[] getTexts() {
		return texts;
	}
	
	public void setTexts(String[] texts) {
		this.texts = texts;
	}
	
	public Equipment[] getChoix() {
		return Choix;
	}
	public void setChoix(Equipment[] choix) {
		Choix = choix;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

}
