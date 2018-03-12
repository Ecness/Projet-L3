package hof.game.event;

import java.util.ArrayList;

public class CarteEvenement {
	ArrayList<Choice> deckC = new ArrayList<Choice>();
	ArrayList<Dice> deckD = new ArrayList<Dice>();
	
	void play() 
	{
		if((int)Math.random()==0)
		{
			Choice c = deckC.get((int)(Math.random()*deckC.size()));
			
			//afficher intro
			String intro = c.getIntro();
			
			//Choix
			c.getTexts();
			
			//resultat
			c.getResults();
		}
		else
		{
			Dice c = deckD.get((int)(Math.random()*deckD.size()));
			
			//afficher intro
			String intro = c.getIntro();
			
			//Lancer de dés
			int d = ((int)(Math.random()*9)+1) + ((int)(Math.random()*9)+1) + ((int)(Math.random()*9)+1);
			
			//Victoire?
			if(d<=c.getLimit())
			{
				String t = c.getTexts()[0];
				int r = c.getResults()[0];
			}
			else
			{
				String t = c.getTexts()[1];
				int r = c.getResults()[1];
			}
			//afficher texte t
			
			//Prendre en compte resultat r (sur vie/or/etc)
		}
			
		
	}
	
	
}
