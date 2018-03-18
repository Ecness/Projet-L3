package hof.game.event;


import hof.game.card.Carte;

public class Choice extends Carte{
	//Texte d'introduction de la carte
	String intro = "";
	//Textes des choix
	String[] Texts = new String[3];
	//Resultats des choix
	int[] results = new int[3];
	//Type de resultats
	EnumResult[] typeresult = new EnumResult[3];
	//Texte de fin de la carte
	String outro = "";

	//Constructeur
	public Choice(String nom, int id,EnumEvent type, String intro, String[] texts, int[] results,
			EnumResult[] typeresult,String outro) {
		super(nom, id,type);
		this.intro = intro;
		Texts = texts;
		this.results = results;
		this.typeresult = typeresult;
		this.outro = outro;
	}

	//Getters & Setters

	public String[] getTexts() {
		return Texts;
	}

	public void setTexts(String[] texts) {
		Texts = texts;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
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
