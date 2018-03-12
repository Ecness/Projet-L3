package hof.game.event;

import hof.game.card.Carte;

public class Dice extends Carte{
	
	String intro = "";
	int limit = 0;
	String[] texts = new String[2];
	int[] results = new int[2];
	
	//Getters & Setters

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

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

	public int[] getResults() {
		return results;
	}

	public void setResults(int[] results) {
		this.results = results;
	}
	
	

}
