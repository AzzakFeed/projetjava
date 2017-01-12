/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction gérant l'obtention des renforts
*/

import java.util.ArrayList;

public class Renfort{

	public static int renforts (Joueur j1, ArrayList<Pays> TabJoueurPays, Pays[] tabPays, Pays[] Continent1, Pays[] Continent2, Pays[] Continent3, Pays[] Continent4, Pays[] Continent5, Pays[] Continent6){

		int i;

		// Le joueur dispose chaque tour de renforts égaux au nombre de territoires possédés/3 (arrondi à l'entier inférieur).
		int pionsdispo = 0;
		pionsdispo = (int)(Math.floor(TabJoueurPays.size()/3));


		// De plus, s'il possède intégralement un continent, le joueur reçoit des renforts supplémentaires.
		int cptEurope=0;
		int cptOceanie=0;
		int cptAsie=0;
		int cptAmSud=0;
		int cptAmNord=0;
		int cptAfrique=0;

		//posséder l'Europe
			for(i=0;i<7;i++){
				if(Continent5[i].getJoueur() == j1){
					cptEurope = cptEurope+1;
				}
			}
	
		if ( cptEurope == 6 ){
		pionsdispo += 5;
		}
	
			//posséder l'Amérique du Sud
			for(i=0;i<4;i++){
				if(Continent3[i].getJoueur() == j1){
					cptAmSud = cptAmSud+1;
				}
			}
	
			if ( cptAmSud == 4 ){
		pionsdispo += 2;
		}
	
			//posséder l'Asie
			for(i=0;i<12;i++){
				if(Continent4[i].getJoueur() == j1){
					cptAsie = cptAsie+1;
				}
			}
	
			if ( cptAsie == 12 ){
		pionsdispo += 7;
		}
	
	
	
			//posséder l'Océanie
			for(i=0;i<4;i++){
				if(Continent6[i].getJoueur() == j1){
					cptOceanie = cptOceanie+1;
				}
			}
	
	
			if ( cptOceanie == 4 ){
		pionsdispo += 2;
		}	
	
			//posséder l'Amérique du Nord
			for(i=0;i<9;i++){
				if(Continent2[i].getJoueur ()== j1){
					cptAmNord = cptAmNord+1;
				}
			}
	
			if ( cptAmNord == 9){
		pionsdispo += 5;
		}
			//posséder l'Afrique
			for(i=0;i<6;i++){
				if(Continent1[i].getJoueur() == j1){
					cptAfrique = cptAfrique+1;
				}
			}

		if ( cptAfrique == 6 ){
		pionsdispo += 3;
		}

		return pionsdispo;
	}
}


