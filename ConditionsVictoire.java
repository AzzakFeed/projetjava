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
		if(Pays.getJoueur == j1){
			if(Pays.getOccupepar >=2){
			cpt += 1;
		}
	}
				
if(cpt ==18){
	return true;
	else
	return false;
 }
}

boolean verifiervictoire2 (Joueur j1){ 
	
	//créer un tableau avec les pays d'un continent
	//si Pays.getJoueur == j1, cpt +1, et si cpt = tout, cptcontinent +1.
	// refaire pour tous les continents. Si cptcontinent = 2,3 ... 


boolean verifiervictoire3 (Joueur j1){  // Posséder Europe, Amérique du Sud et un troisième continent au choix
	int cpt = 0; 
	
	//Europe
	for(i=0;i==8;i++){
		if(Pays.getJoueur == j1){
			cpt += 1;
		}
	}






boolean verifiervictoire4 (Joueur j1){  //Posséder 24 territoires
	int cpt = 0; 

	for(i=0;i==41;i++){
		if(Pays.getJoueur == j1){
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



boolean verifiervictoire6 (Joueur j1){  // Posséder Asie et l'Afrique
	
	
boolean verifiervictoire7 (Joueur j1){ // Posséder Asie et Amérique du sud


boolean verifiervictoire8 (Joueur j1){ // Posséder Europe, Océanie et un troisième continent au choix.




 
 
 
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

}
}
