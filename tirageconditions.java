//Tirage au sort des conditions de victoire

// Total 8

private float[] cond = new float[3];



for(i=1; i <= 3; i++)
{
tirage = 1+(int)(Math.random() * ((8-1) +1));   //
cond[i] = tirage;
}

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
