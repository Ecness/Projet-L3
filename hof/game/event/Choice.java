package hof.game.event;

import java.util.ArrayList;
import hof.game.card.Carte;

public class Choice extends Carte{ 
	
	String intro = "";
	ArrayList<String> Texts = new ArrayList<String>();
	int[] results = new int[Texts.size()];
	
	//Getters & Setters
	
	public ArrayList<String> getTexts() {
		return Texts;
	}

	public void setTexts(ArrayList<String> texts) {
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
	
}
