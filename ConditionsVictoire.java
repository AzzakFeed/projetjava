public class ConditionsVictoire {

//Tirage au sort des conditions de victoire

// Total 8

private float[] cond = new float[3];



for(i=1; i <= 3; i++)
{
tirage = 1+(int)(Math.random() * ((8-1) +1));   //
cond[i] = tirage;
}

// faire les pays de 22 à 41

	
boolean verifiervictoire1 (Joueur j1){  //Posséder 18 territoires avec 2 pions au minimum chacun
	int cpt = 0; 

	for(i=0;i==41;i++){
		if(tabPays[i].getJoueur == j1){
			if(tabPays[i].getOccupepar >=2){
			cpt += 1;
		}
	}
				
if(cpt ==18){
	return true;
	else
	return false;
 }
}

	
boolean verifiervictoire2 (Joueur j1){  // Amérique du Nord et Afrique
	int cptAfrique = 0;
	int cptAmNord = 0;
	
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	
	if(cptAfrique ==6 && cptAmNord == 9){
		return true;
		else
		return false;
		}
	}
	
	
	

boolean verifiervictoire3 (Joueur j1){  // Posséder Europe, Amérique du Sud et un troisième continent au choix
	int cptEurope=0;
	int cptOceanie=0;
	int cptAsie=0;
	int cptAmSud=0;
	int cptAmNord=0;
	int cptAfrique=0;
	//posséder l'Europe
	for(i=0;i<6;i++){
		if(Europe[i].getJoueur == j1){
			cptEurope = cptEurope+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
			cptAmSud = cptAmSud+1;
		}
	}
	
	//3ème continent
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Océanie
	for(i=0;i<4;i++){
		if(AOceanie[i].getJoueur == j1){
			cptOceanie = cptOceanie+1;
		}
	}
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	//victoire
	if(cptEurope==6 && cptAmSud==4 && (cptOceanie==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12){
		return true;
	}else{
		return false;
	}
}

	   
	   

boolean verifiervictoire4 (Joueur j1){  //Posséder 24 territoires
	int cpt = 0; 

	for(i=0;i==41;i++){
		if(tabPays[i].getJoueur == j1){
			cpt += 1;
		}
	}
				
if(cpt >=24){
	return true;
	else
	return false;
 }
}
	
	

boolean verifiervictoire5 (Joueur j1){  // Posséder Amérique du Nord et Océanie
	int cptOceanie=0;
	int cptAmNord=0;
	//posséder l'Océanie
	for(i=0;i<4;i++){
		if(AOceanie[i].getJoueur == j1){
			cptOceanie = cptOceanie+1;
		}
	}
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	//victoire
	if(cptOceanie==4 && cptAmNord==6){
		return true;
	}else{
		return false;
	}

boolean verifiervictoire6 (Joueur j1){  // Posséder Asie et l'Afrique
	int cptAsie=0;
	int cptAfrique=0;
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
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
	
boolean verifiervictoire7 (Joueur j1){ // Posséder Asie et Amérique du sud
	int cptAsie=0;
	int cptAmSud=0;
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
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

boolean verifiervictoire8 (Joueur j1){ // Posséder Europe, Océanie et un troisième continent au choix.
	int cptEurope=0;
	int cptOceanie=0;
	int cptAsie=0;
	int cptAmSud=0;
	int cptAmNord=0;
	int cptAfrique=0;
	//posséder l'Europe
	for(i=0;i<6;i++){
		if(Europe[i].getJoueur == j1){
			cptEurope = cptEurope+1;
		}
	}
	//posséder l'Océanie
	for(i=0;i<4;i++){
		if(AOceanie[i].getJoueur == j1){
			cptOceanie = cptOceanie+1;
		}
	}
	//3ème continent
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
			cptAmSud = cptAmSud+1;
		}
	}
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	//victoire
	if(cptEurope==6 && cptOceanie==4 && (cptAmSud==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12){
		return true;
	}else{
		return false;
	}
}  
}
 
 
 
/*
if (cond[i] = 0){
System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir 18 territoires et occuper chacun d'eux avec deux armees au moins");
}
if (cond[i] = 1){
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalite l'Amérique du Nord et l'Afrique");
}
if (cond[i] = 2){
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalite l'Europe et l'Amerique du sud plus un troisieme continent au choix");
}
if (cond[i] = 3) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir 24 territoires aux choix");
}
if (cond[i] = 4) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalite l'Amerique du Nord et l'Oceanie");
}
if (cond[i] = 5) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalite l'Asie et l'Afrique");
}
if (cond[i] = 6) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalite l'Asie et l'Amerique du sud");
}
if (cond[i] = 7) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir en totalité l'Europe et l'Oceanie plus un troisieme continent au choix");
}
*/


