package hof.game.event;

import hof.game.card.Carte;

public class Battle extends Carte {
	//Texte d'introduction de la carte
	String intro = "";
	//Nom de l'ennemi
	String nomEnnemi = "";
	//Point de vie de l'ennemi
	int hp = 0;
	//Attaque de l'ennemi
	int atk = 0;
	//Defence de l'ennemi
	int def = 0;
	//Texte des resultats Victoire/Defaite
	String[] texts = new String[2];
	//Resultats Victoire/Defaite
	int[] results = new int[2];
	//Type resultats Victoire/Defaite
	EnumResult[] typeresult = new EnumResult[2];
	//Texte de fin de la carte
	String outro = "";
	
	
	//constructeur
	public Battle(String nom, int id,EnumEvent type, String intro, String nom2, int hp, int atk, int def, String[] texts,
			int[] results, EnumResult[] typeresult,String outro) {
		super(nom, id,type);
		this.intro = intro;
		this.nomEnnemi = nom2;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.texts = texts;
		this.results = results;
		this.typeresult = typeresult;
		this.outro = outro;
	}
	
	//Getters & Setters
	
	public String getIntro() {
		return intro;
	}
	
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	public String getNomEnnemi() {
		return nomEnnemi;
	}
	
	public void setNomEnnemi(String nom2) {
		this.nomEnnemi = nom2;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public String[] getTexts() {
		return texts;
	}
	
	public void setTexts(String[] texts) {
		this.texts = texts;
	}
	
	public int[] getResults() {
		return results;
	}
	
	public void setResults(int[] results) {
		this.results = results;
	}
	
	public EnumResult[] getTyperesult() {
		return typeresult;
	}
	
	public void setTyperesult(EnumResult[] typeresult) {
		this.typeresult = typeresult;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}	
	
}
