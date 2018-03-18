package hof.game.entity;

import java.util.List;

import hof.game.card.Carte;
import hof.game.card.Equipment;
import hof.game.equipment.EnumEquipment;
import hof.game.event.Battle;
import hof.game.event.CardChoose;
import hof.game.event.Choice;
import hof.game.event.Dice;
import hof.game.event.EnumEvent;
import hof.game.event.EnumResult;
import hof.game.card.CarteEvenement;

public class GameMaster {

	//Deck de carte evenement
	private CarteEvenement DeckEvenement;
	//Deck de carte equipement
	private List<Equipment> equipement;
	//Map du donjon (carte)
	private Carte[][] map;
	//Niveau du donjon
	private int level;
	//Player
	private Player Heros;

	public GameMaster () {


	}

	// génére le premier donjon.
	void generation_tuto() {
		equipement.add(new Equipment("Epee Rouille",0,EnumEquipment.Weapon,10,5));
		equipement.add(new Equipment("Hache de bucheron",1,EnumEquipment.Weapon,15,0));
		DeckEvenement.getDeckD().add(new Dice("Reveil",0,EnumEvent.Dice, "Vous vous reveillez douloureux, ne vous rappelant pas ce qui c'est passe.\nAutour de vous des corps sans vie,beaucoup de corps.\nVous etes dans une fosse commune, sans sous, sans nourriture, sans equipement.\nVous fouillez autour de vous dans l'espoir de trouver quelque chose!\n",10,new String[]{"Vous trouvez 25 pièces d'or dans les poches des defunts. Vous faites une priere pour eux avant de partir.","Vous trouvez 10 pièces d'or dans les poches des defunts. Vous etes decu de ne pas avoir trouve plus."},new int[]{25,10},new EnumResult[]{EnumResult.plusgold,EnumResult.plusgold},"La faim vous tiraille alors que vous vous eloignez.\n"));
		DeckEvenement.getDeckCC().add(new CardChoose("Marchand Vereux",0,EnumEvent.CardChoose, "Vous croisez un marchand sur votre route. Vous le suppliez de vous echangez votre or contre de la nourriture et de quoi vous defendre.Il vous donne quelques equipements rouilles et vous demande de choisir entre une epee et une hache",new String[]{"Vous choisissez l'epee","Vous choisissez la hache"},new Equipment[] {equipement.get(0),equipement.get(1)},"il vous lance un sac de nourriture et vous conseille de vous depechez car la route est longue jusque la ville."));
		DeckEvenement.getDeckB().add(new Battle("Bandit Malchanceux",0,EnumEvent.Battle, "Vous entendez un bruit venant des buissons. Un bandit surgit et vous ordonne de lui donner vos biens. La diplomatie ne vous menera nulle part.\n","Bandit",30,10,10,new String[]{"Vous avez battu le bandit. Lui faisant les poches vous trouvez un peu d'or\n","Le bandit vous blesse, mais vous arrivez a fuir de justesse. Saignant, vous essayez de le semer.\n"},new int[]{15,5},new EnumResult[]{EnumResult.plusgold,EnumResult.plushp},"Le combat vous a fatigue mais la vue de la ville proche vous soulage.\n"));
		DeckEvenement.getDeckC().add(new Choice("Avenir?",0,EnumEvent.Choice, "Vous suivez le chemin arrivant en ville. Mais vous apercevez une foule bloquant la porte. Que faire ?\n",new String[]{"Vous choisissez de continuer jusque la porte de la ville.\n","Vous choisissez de trouver une autre porte pour entrer en ville\n",""},new int[]{0,0},new EnumResult[]{null,null},"Vous arrivez a penetrer en ville avec difficultes\n"));
		map[0][0] = DeckEvenement.getDeckD().get(0);
		map[0][1] = DeckEvenement.getDeckCC().get(0);
		map[0][2] = DeckEvenement.getDeckB().get(0);
		map[0][3] = DeckEvenement.getDeckC().get(0);
	}

	//génére le donjon.
	void generation_Donjon() {
		for(int i = 0;i<5;i++)
		{
			for(int j = 0;j<5;j++)
			{
				switch((int) Math.random() * 4) 
				{
				case 0:
					map[i][j] = DeckEvenement.getDeckD().get((int) Math.random() * 10);
					break;
				case 1:
					map[i][j] = DeckEvenement.getDeckCC().get((int) Math.random() * 10);
					break;
				case 2:
					map[i][j] = DeckEvenement.getDeckB().get((int) Math.random() * 10);
					break;
				case 3:
					map[i][j] = DeckEvenement.getDeckC().get((int) Math.random() * 10);
					break;
				default:
					map[i][j] = DeckEvenement.getDeckB().get((int) Math.random() * 10);
					break;
				}

			}
		}
	}

	//Jeu
	void playCarte(int x, int y) {
		int n = 0;
		int d = 0;
		int m = 1;
		int k= 0;
		switch(map[x][y].getType())
		{
		case Battle:
			Battle b = (Battle) map[x][y];
			// afficher intro nom ennemi etc... 
			b.getIntro();
			b.getNom();
			//Tour player, bouton atck = 1, bouton def = 2
			while(b.getHp()>0 && Heros.getHp()>0)
			{
				switch(m) {
				case 1:
					switch(n)
					{
					case 1:
						n =(Heros.getAttack()-b.getDef());
						if(n>0)
							b.setHp(b.getHp()-n);
						else
							n = 0;
						break;
					case 2:
						Heros.setDefence(Heros.getDefence()*2);
						break;
					}
					m = 2;
					break;
				case 2:
					//Tour ennemi
					switch((int)Math.random())
					{
					case 0:
						n = (b.getAtk() - Heros.getDefence()); 
						if(n>0)
							Heros.setHp(Heros.getHp()-n);
						else
							n = 0;
						break;
					case 1:
						d = 1;
						b.setDef(b.getDef()*2);
						break;
					}
					m = 1;
					break;
				}
				//Reset def heros
				Heros.reset();
				//Reset def ennemi
				if(d!=0)
					b.setDef((int)(b.getDef()/2));
			}
			m=1;
			//Selection recompense
			int[] s = b.getResults();
			String[] text = b.getTexts();
			EnumResult[] typeresult = b.getTyperesult();

			if(b.getHp()<=0)
			{
				k=0;
			}
			if(Heros.getHp()<=0)
			{
				k = 1;
			}
			//apliquer results
			switch(typeresult[k])
			{
			case plusgold:
				Heros.setGold(Heros.getGold()+s[k]);
				break;
			case minusgold:
				Heros.setGold(Heros.getGold()-s[k]);
				break;
			case plusfood:
				Heros.setFood(Heros.getFood()+s[k]);
				break;
			case minusfood:
				Heros.setFood(Heros.getFood()-s[k]);
				break;
			case plusrep:
				Heros.setReputation(Heros.getReputation()+s[k]);
				break;
			case minusrep:
				Heros.setReputation(Heros.getReputation()-s[k]);
				break;
			case plushp:
				Heros.setHp(Heros.getHp()+s[k]);
				break;
			case minushp:
				Heros.setHp(Heros.getHp()-s[k]);
				break;
			}
			//Afficher text result
			//text[k];


			//afficher outro
			b.getOutro();
			break;

		case Choice:
			Choice c = (Choice)map[x][y];
			c.getIntro();
			String[] text1 = c.getTexts();
			int[] s1 = c.getResults();
			EnumResult[] typeresult1 = c.getTyperesult();
			// k = valeur bouton 1 ou 2 ou 3
			//afficher text1[k]

			switch(typeresult1[k])
			{
			case plusgold:
				Heros.setGold(Heros.getGold()+s1[k]);
				break;
			case minusgold:
				Heros.setGold(Heros.getGold()-s1[k]);
				break;
			case plusfood:
				Heros.setFood(Heros.getFood()+s1[k]);
				break;
			case minusfood:
				Heros.setFood(Heros.getFood()-s1[k]);
				break;
			case plusrep:
				Heros.setReputation(Heros.getReputation()+s1[k]);
				break;
			case minusrep:
				Heros.setReputation(Heros.getReputation()-s1[k]);
				break;
			case plushp:
				Heros.setHp(Heros.getHp()+s1[k]);
				break;
			case minushp:
				Heros.setHp(Heros.getHp()-s1[k]);
				break;
			}
			//Afficher outro
			c.getOutro();
			break;

		case CardChoose:
			CardChoose cc = (CardChoose)map[x][y];
			cc.getIntro();
			String[] text2 = cc.getTexts();
			// k = valeur bouton 1 ou 2 ou refuser
			//afficher text2[k]
			Equipment e = cc.getChoix()[k];
			switch(e.getEquipmentCard().getType())
			{
			case Weapon:
				Heros.setWeapon(e);
				Heros.reset();
				break;
			case Shield:
				Heros.setShield(e);
				Heros.reset();
				break;
			case Armor:
				Heros.setArmor(e);
				Heros.reset();
				break;
			case Accessory:
				Heros.setAccessory(e);
				Heros.reset();
				break;
			}
			//Afficher outro
			cc.getOutro();
			break;

		case Dice:
			Dice dc = (Dice)map[x][y];
			dc.getIntro();
			String[] text3 = dc.getTexts();
			int[] s3 = dc.getResults();
			EnumResult[] typeresult3 = dc.getTyperesult();
			//Bouton lancer dés
			int l = ((int)Math.random()*6)+1 + ((int)Math.random()*6)+1 + ((int)Math.random()*6)+1;
			if(l>dc.getLimit())
			{
				k = 0;
			}
			else
			{
				k = 1;
			}
			//afficher text3[k]
			//appliquer result k
			switch(typeresult3[k])
			{
			case plusgold:
				Heros.setGold(Heros.getGold()+s3[k]);
				break;
			case minusgold:
				Heros.setGold(Heros.getGold()-s3[k]);
				break;
			case plusfood:
				Heros.setFood(Heros.getFood()+s3[k]);
				break;
			case minusfood:
				Heros.setFood(Heros.getFood()-s3[k]);
				break;
			case plusrep:
				Heros.setReputation(Heros.getReputation()+s3[k]);
				break;
			case minusrep:
				Heros.setReputation(Heros.getReputation()-s3[k]);
				break;
			case plushp:
				Heros.setHp(Heros.getHp()+s3[k]);
				break;
			case minushp:
				Heros.setHp(Heros.getHp()-s3[k]);
				break;
			}
			//Afficher outro
			dc.getOutro();
			break;
		}

	}





}
