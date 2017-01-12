/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant les différentes fonctions (8) qui permettent de valider les conditions de victoire
*/

public class ConditionsVictoire {

	// 1) Posséder 18 territoires avec 2 pions au minimum chacun
	public static boolean verifiervictoire1 (Joueur j1, Pays[] tabPays){  
		int cpt = 0; 
		int i;

		for(i=0;i<42;i++){
			if(tabPays[i].getJoueur() == j1){
				if(tabPays[i].getOccupepar() >=2){
					cpt += 1;
				}
			}
		}
				
		if(cpt >=18){
			return true;
			}else
				return false;
	}
	
	// 2) Amérique du Nord et Afrique	
	public static boolean verifiervictoire2 (Joueur j1, Pays[] AmeriqueNord, Pays[] Afrique){  
		int cptAfrique = 0;
		int cptAmNord = 0;
		int i;
		//posséder l'Amérique du Nord
		for(i=0;i<9;i++){
			if(AmeriqueNord[i].getJoueur() == j1){
				cptAmNord = cptAmNord+1;
			}
		}
	
		//posséder l'Afrique
		for(i=0;i<6;i++){
			if(Afrique[i].getJoueur() == j1){
				cptAfrique = cptAfrique+1;
			}
		}
	
		if(cptAfrique ==6 && cptAmNord == 9){
			return true;
			}else
				return false;
		
	}

	// 3) Posséder Europe, Amérique du Sud et un troisième continent au choix	
	public static boolean verifiervictoire3 (Joueur j1, Pays[] Afrique, Pays[] AmeriqueNord, Pays[] AmeriqueSud, Pays[] Asie, Pays[] Europe, Pays[] Oceanie){  

		int cptEurope=0;
		int cptOceanie=0;
		int cptAsie=0;
		int cptAmSud=0;
		int cptAmNord=0;
		int cptAfrique=0;
		int i;
		//posséder l'Europe
		for(i=0;i<6;i++){
			if(Europe[i].getJoueur() == j1){
				cptEurope = cptEurope+1;
			}
		}
		//posséder l'Amérique du Sud
		for(i=0;i<4;i++){
			if(AmeriqueSud[i].getJoueur() == j1){
				cptAmSud = cptAmSud+1;
			}
		}
	
		//3ème continent

		//posséder l'Asie
		for(i=0;i<12;i++){
			if(Asie[i].getJoueur() == j1){
				cptAsie = cptAsie+1;
			}
		}
		//posséder l'Océanie
		for(i=0;i<4;i++){
			if(Oceanie[i].getJoueur() == j1){
				cptOceanie = cptOceanie+1;
			}
		}
		//posséder l'Amérique du Nord
		for(i=0;i<9;i++){
			if(AmeriqueNord[i].getJoueur() == j1){
				cptAmNord = cptAmNord+1;
			}
		}
		//posséder l'Afrique
		for(i=0;i<6;i++){
			if(Afrique[i].getJoueur() == j1){
				cptAfrique = cptAfrique+1;
			}
		}

		//victoire
		if(cptEurope==6 && cptAmSud==4 && (cptOceanie==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12)){
			return true;
		}else{
			return false;
		}
	}

	// 4) Posséder 24 territoires
	public static boolean verifiervictoire4 (Joueur j1, Pays[] tabPays){  
		int cpt = 0; 
		int i;
		for(i=0;i<42;i++){
			if(tabPays[i].getJoueur() == j1){
				cpt += 1;
			}
		}
				
		if(cpt >=24){
			return true;
			}else
				return false;
	}
	
	 // 5) Posséder Amérique du Nord et Océanie
	public static boolean verifiervictoire5 (Joueur j1, Pays[] AmeriqueNord, Pays[] Oceanie){ 
		int cptOceanie=0;
		int cptAmNord=0;
		int i;

		//posséder l'Océanie
		for(i=0;i<4;i++){
			if(Oceanie[i].getJoueur() == j1){
				cptOceanie = cptOceanie+1;
			}
		}
		//posséder l'Amérique du Nord
		for(i=0;i<9;i++){
			if(AmeriqueNord[i].getJoueur() == j1){
				cptAmNord = cptAmNord+1;
			}
		}
		//victoire
		if(cptOceanie==4 && cptAmNord==6){
			return true;
		}else{
			return false;
		}
	}

	// 6) Posséder Asie et l'Afrique
	public static boolean verifiervictoire6 (Joueur j1, Pays[] Asie, Pays[] Afrique){  
		int cptAsie=0;
		int cptAfrique=0;
		int i;
		//posséder l'Asie
		for(i=0;i<12;i++){
			if(Asie[i].getJoueur() == j1){
				cptAsie = cptAsie+1;
			}
		}
		//posséder l'Afrique
		for(i=0;i<6;i++){
			if(Afrique[i].getJoueur() == j1){
				cptAfrique = cptAfrique+1;
			}
		}
		//victoire
		if(cptAsie==12 && cptAfrique==6){
			return true;
		}else{
			return false;
		}
	}
	
	// 7) Posséder Asie et Amérique du sud
	public static boolean verifiervictoire7 (Joueur j1, Pays[] Asie, Pays[] AmeriqueSud){ 
		int cptAsie=0;
		int cptAmSud=0;
		int i;
		//posséder l'Asie
		for(i=0;i<12;i++){
			if(Asie[i].getJoueur() == j1){
				cptAsie = cptAsie+1;
			}
		}
		//posséder l'Amérique du Sud
		for(i=0;i<4;i++){
			if(AmeriqueSud[i].getJoueur() == j1){
				cptAmSud = cptAmSud+1;
			}
		}
		//victoire
		if(cptAsie==12 && cptAmSud==4){
			return true;
		}else{
			return false;
		}
	}

	// 8) Posséder Europe, Océanie et un troisième continent au choix.
	public static boolean verifiervictoire8 (Joueur j1, Pays[] Afrique, Pays[] AmeriqueNord, Pays[] AmeriqueSud, Pays[] Asie, Pays[]Europe, Pays[] Oceanie){ 
		int cptEurope=0;
		int cptOceanie=0;
		int cptAsie=0;
		int cptAmSud=0;
		int cptAmNord=0;
		int cptAfrique=0;
		int i;

		//posséder l'Europe
		for(i=0;i<6;i++){
			if(Europe[i].getJoueur() == j1){
				cptEurope = cptEurope+1;
			}
		}
		//posséder l'Océanie
		for(i=0;i<4;i++){
			if(Oceanie[i].getJoueur() == j1){
				cptOceanie = cptOceanie+1;
			}
		}
		//3ème continent
		//posséder l'Asie
		for(i=0;i<12;i++){
			if(Asie[i].getJoueur() == j1){
				cptAsie = cptAsie+1;
			}
		}
		//posséder l'Amérique du Sud
		for(i=0;i<4;i++){
			if(AmeriqueSud[i].getJoueur() == j1){
				cptAmSud = cptAmSud+1;
			}
		}
		//posséder l'Amérique du Nord
		for(i=0;i<9;i++){
			if(AmeriqueNord[i].getJoueur() == j1){
				cptAmNord = cptAmNord+1;
			}
		}
		//posséder l'Afrique
		for(i=0;i<6;i++){
			if(Afrique[i].getJoueur() == j1){
				cptAfrique = cptAfrique+1;
			}
		}
		//victoire
		if(cptEurope==6 && cptOceanie==4 && (cptAmSud==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12)){
			return true;
		}else{
			return false;
		}
	}  

}
 
 
