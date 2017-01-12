/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction permettant de tester la condition de victoire du joueur passé en paramètres et qui renvoi "vrai" si celle ci est vérifiée
*/

public class Victoire {

	public static boolean VictoireFinale (Joueur j1, Pays[] tabPays, Pays[] Afrique, Pays[] AmeriqueNord, Pays[] AmeriqueSud, Pays[] Asie, Pays[] Europe, Pays[] Oceanie){
	
		boolean victory = false; // De base on part du principe que le joueur n'a pas rempli sa condition de victoire
		int nbVictoire = j1.getNConditionDeVictoire();

		if(nbVictoire == 1){

			victory = ConditionsVictoire.verifiervictoire1 (j1, tabPays);
		}

		if(nbVictoire == 2){

			victory = ConditionsVictoire.verifiervictoire2(j1, AmeriqueNord, Afrique);
		}
	
		if(nbVictoire == 3){

			victory = ConditionsVictoire.verifiervictoire3(j1, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);
		}
	
		if(nbVictoire == 4){

			victory = ConditionsVictoire.verifiervictoire4(j1, tabPays);
		}

		if(nbVictoire == 5){

			victory = ConditionsVictoire.verifiervictoire5(j1, AmeriqueNord, Oceanie);
		}

		if(nbVictoire == 6){

			victory = ConditionsVictoire.verifiervictoire6(j1, Asie, Afrique);
		}

		if(nbVictoire == 7){

			victory = ConditionsVictoire.verifiervictoire7(j1, Asie, AmeriqueSud);
		}
	
		if(nbVictoire == 8){

			victory = ConditionsVictoire.verifiervictoire8(j1, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);
		}

		return victory;
	}

}
