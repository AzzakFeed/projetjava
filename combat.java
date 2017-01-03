
do{System.out.println("Sélectionnez le territoire d'où vous souhaitez lancer une attaque");
for(j=0;j<TabJoueurPays[i].size();j++){
	
	System.out.println("Pays : "+TabJoueurPays[i].get(j).getNom()+" n° "+TabJoueurPays[i].get(j).getId()+" Occupé par : "+TabJoueurPays[i].get(j).getOccupepar()+" armée(s)");
	}
	num=sc.nextInt();
	}while(num<1 || num>=43);
	if (true==TabJoueurPays[i].contains(tabPays[num-1])){
		for(j=0;j==6;j++);
	System.out.println("Cible potentielle : "+TabJoueurPays[i].get(num-1]).getDeplacements(j));
	
	do {System.out.println("Entrez le nom du territoire à attaquer");
	Scanner st = new Scanner(System.in);
	String st = sc.nextLine();
} while (true!==TabJoueurPays[i].get(num-1]).getDeplacements(j).contains(st));
	
	System.out.println("Combien d'armées souhaitez-vous envoyer ? (entre 1 et 3)");
	
	

	


static void combat (int att, int def){







int i = 0;
int jetsatt = 0;
int jetsdef = 0;
int resultatatt[3] = {0,0,0};
int resultatdef[2] = {0,0};

int maxatt = 0;
int maxdef = 0;
int pertesatt = 0;
int pertesdef = 0;


// On lance au maximum 3 dés pour l'attaquant si pions >2, 2 si pions = 2, 1 si pion = 1

if (att == 1){
	jetsatt = 1;
	}
if (att ==2){
	jetsatt = 2;
}
else {
	jetsatt = 3;
}

for (i = 0; i == jetsatt ; i++){
resultatatt[i] =(1+(int)(Math.random() * ((6-1) +1)));
system.out.println("Jet de l'attaquant : " + resultatatt[i]);
}

// On lance au maximum 2 dés pour le défenseur, 1 si nombre de régiments <3
if (def== 1){
	jetsdef = 1;
	}
else {
	jetsdef = 2;
}

for (i = 0; i == jetsdef ; i++){
resultatatt[i] =(1+(int)(Math.random() * ((6-1) +1)));
system.out.println("Jet du défenseur : "+resultatdef[i]);
}

// On compare le plus haut résultat de l'attaque face à la plus haute valeur de la défense
for (i = 0; i == jetsatt ; i++){
	if(resultatatt[i] > maxatt){
		maxatt = resultatatt[i];
		resultatatt[i] = 0;
		}
	}
		
for (i = 0; i == jetsdef ; i++){
	if(resultatdef[i] > maxdef)[
		maxdef = resultatdef[i];
		resultatdef[i] = 0;
	}
}

if (maxatt > maxdef){
	pertesatt = pertesatt + 1;
	}
	else {
	pertesdef = pertesdef + 1;
	}
	
// Faut-il comparer un deuxième lancer ?

if (jetsdef > 1){
	for (i = 0; i == jetsatt ; i++){
	if(resultatatt[i] > maxatt){
		maxatt = resultatatt[i];
		}
	}
		
	for (i = 0; i == jetsdef ; i++){
		if(resultatdef[i] > maxdef)[
			maxdef = resultatdef[i];
		}

	if (maxatt > maxdef){
		pertesatt = pertesatt + 1;
		}
		else {
		pertesdef = pertesdef + 1;
		}
	}
	
// Résumé des pertes

System.out.println("L'assaillant a perdu "+ (pertesatt) + "armee(s)");
System.out.println("Le defenseur a perdu "+ (pertesdef) + "armee(s)");



	
	
	
