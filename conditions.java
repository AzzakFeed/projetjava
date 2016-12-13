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
}
				
if(cpt ==18){
	return true;
	else
	return false;
 }
}

boolean verifiervictoire2 (Joueur j2){ 
	
	//créer un tableau avec les pays d'un continent
	//si Pays.getJoueur == j1, cpt +1, et si cpt = tout, cptcontinent +1.
	// refaire pour tous les continents. Si cptcontinent = 2,3 ... 

/* Fonction verifiervictoire1 (Joueur j1)
 cpt = 0;
Pour i de 0 à 41
Si pays.get(joueur)= j1;
cpt = cpt +1;

Si cpt == 24 alors return true;
sinon return false;


 

/*
if (cond[i] = 0){
System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquerir 18 territoires et occuper chacun d'eux avec deux armees au moins");
}
if (cond[i] = 1){
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir en totalité l'Amérique du Nord et l'Afrique");
}

if (cond[i] = 2){
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir en totalité l'Europe et l'Amérique du sud plus un troisième continent au choix");
}

if (cond[i] = 3) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir 24 territoires aux choix");
}


if (cond[i] = 4) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir en totalité l'Amérique du Nord et l'Océanie");
}


if (cond[i] = 5) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir en totalité l'Asie et l'Afrique");
}


if (cond[i] = 6) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+" : Vous devez conquérir en totalité l'Asie et l'Amérique du sud");
}


if (cond[i] = 7) {
	System.out.println("Joueur " +tabJoueur[i].getCouleur+"Vous devez conquérir en totalité l'Europe et l'Océanie plus un troisième continent au choix");
}
*/
