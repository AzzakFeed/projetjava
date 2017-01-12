/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction permettant d'afficher le menu des différentes actions possibles d'un joueur pendant son tour:
- voir l'état de ses forces: pays+armées possédés par le joueur
- voir l'état des forces mondiales: ensemble des pays+armées du monde
- voir la liste des déplacements possibles depuis ses pays
- attaquer les autres pays
- déplacer ses troupes entre ses pays
*/

import java.util.Scanner;
import java.util.ArrayList;
public class Deplacement{

	public static boolean DeplacementTroupes(Joueur j1, ArrayList<Pays> TabJoueurPays, ArrayList<Pays> TabJoueurPays1, ArrayList<Pays> TabJoueurPays2, Pays[] tabPays, Pays[] Continent1, Pays[] Continent2, Pays[] Continent3, Pays[] Continent4, Pays[] Continent5, Pays[] Continent6){

		//variables
		Scanner sc = new Scanner(System.in);
		int choix, nbDefenseurs, numPays, numPays1;
		int i, j, nbarme, finDep, cptPays;
		boolean estVoisin=false;
		boolean finTour = false;
		boolean cond, deplacementsTermines;
		int[] pertesCombat = new int[2];
		Pays[] voisin = new Pays[6];

		//Affichage des options du menu et saisie du choix
		System.out.println("\n\njoueur"+ j1.getCouleur()+"\n\n");
		System.out.println("Menu:\n 1: Afficher vos forces\n 2: Afficher la carte du monde\n 3: Afficher vos déplacements possibles\n 4: Passer à l'offensive !\n 5: Déplacements internes (Attention à la fin de cette action votre tour se terminera)\n Défaut: Fin du tour\n !!Pensez bien à prendre des notes général de pacotille !!\n\n");
		System.out.println("Saisissez votre choix\n");
		choix = sc.nextInt();

		//Actions en fonction du choix
		switch (choix)
		{
			case 1:
				//Affichage des forces
				cptPays=0;
				for(j=0;j<TabJoueurPays.size();j++){
					if(TabJoueurPays.get(j) != null){
						cptPays = cptPays+1;
						System.out.println("Pays : "+TabJoueurPays.get(j).getNom()+" n° "+TabJoueurPays.get(j).getId()+" Occupé par : "+TabJoueurPays.get(j).getOccupepar()+" armée(s)");
					}
				}
				System.out.println("\nVous possédez "+cptPays+" pays");
			break;

			case 2:
				//Affichage des forces mondiales par continent
				//Afrique
				System.out.println("\n\nAfrique:");
				for(i=0;i<=5;i++){
					System.out.println("Pays: "+Continent1[i].getNom()+" n°: "+Continent1[i].getId()+" Détenu par le joueur :"+Continent1[i].getJoueur().getCouleur()+" Occupé par: "+Continent1[i].getOccupepar()+" armées");
				}
				//Asie
				System.out.println("\n\nAsie:");
				for(i=0;i<=11;i++){
					System.out.println("Pays: "+Continent4[i].getNom()+" n°: "+Continent4[i].getId()+" Détenu par le joueur :"+Continent4[i].getJoueur().getCouleur()+" Occupé par: "+Continent4[i].getOccupepar()+" armées");
				}
				//Amérique du Nord
				System.out.println("\n\nAmérique du Nord:");
				for(i=0;i<=8;i++){
					System.out.println("Pays: "+Continent2[i].getNom()+" n°: "+Continent2[i].getId()+" Détenu par le joueur :"+Continent2[i].getJoueur().getCouleur()+" Occupé par: "+Continent2[i].getOccupepar()+" armées");
				}
				//Amérique du Sud
				System.out.println("\n\nAmérique du Sud:");
				for(i=0;i<=3;i++){
					System.out.println("Pays: "+Continent3[i].getNom()+" n°: "+Continent3[i].getId()+" Détenu par le joueur :"+Continent3[i].getJoueur().getCouleur()+" Occupé par: "+Continent3[i].getOccupepar()+" armées");
				}
				//Europe
				System.out.println("\n\nEurope:");
				for(i=0;i<=6;i++){
					System.out.println("Pays: "+Continent5[i].getNom()+" n°: "+Continent5[i].getId()+" Détenu par le joueur :"+Continent5[i].getJoueur().getCouleur()+" Occupé par: "+Continent5[i].getOccupepar()+" armées");
				}
				//Océanie
				System.out.println("\n\nOcéanie:");
				for(i=0;i<=3;i++){
					System.out.println("Pays: "+Continent6[i].getNom()+" n°: "+Continent6[i].getId()+" Détenu par le joueur :"+Continent6[i].getJoueur().getCouleur()+" Occupé par: "+Continent6[i].getOccupepar()+" armées");
				}
				break;

			case 3:
				//Déplacements possibles
				System.out.println("Vos pays: ");
				for(j=0;j<TabJoueurPays.size();j++){
					System.out.println("Pays : "+TabJoueurPays.get(j).getNom()+" n° "+TabJoueurPays.get(j).getId()+" Occupé par : "+TabJoueurPays.get(j).getOccupepar()+" armée(s)\n");
					System.out.println("	Déplacement possible vers:\n");
					voisin=TabJoueurPays.get(j).getDeplacements();
					for(i=0;i<voisin.length;i++){
						if(voisin[i] != null){
							System.out.println("	Pays : "+voisin[i].getNom()+" n° "+voisin[i].getId()+" Possédé par joueur "+voisin[i].getJoueur().getCouleur()+" Occupé par : "+voisin[i].getOccupepar()+" armée(s)\n");
						}
					}
				}
				break;


			case 4: 
				//Attaquer
				do{
					System.out.println("saisissez le numéro du pays duquel vous souhaitez envoyer vos troupes combattre !!");
					numPays=sc.nextInt();
				}while(numPays<1 || numPays>=43);	//Le pays doit exister
				
				if (true==TabJoueurPays.contains(tabPays[numPays-1])){ //le pays appartient bien au joueur dont c'est le tour
					System.out.println("saisissez le nombre de troupe à déplacer (max 3 et laisser au moins 1 armée sur place)");
					nbarme=sc.nextInt();
					if(nbarme<=tabPays[numPays-1].getOccupepar() && nbarme>=0 && nbarme<=3 && ((tabPays[numPays-1].getOccupepar()-nbarme)>=1)){ //Le joueur possède bien assez d'armée(s), n'en prend pas plus de 3 et laisse au moins une armée sur le pays de départ
						do{
						voisin=tabPays[numPays-1].getDeplacements(); // on récupère la liste des voisins du pays de départ
						System.out.println("saisissez le numéro du pays à envahir !!");
						numPays1=sc.nextInt();
						if (numPays1>=1 && numPays1<=42){ //le pays à attaquer existe
							for(j=0;j<=5;j++){
								if(voisin[j] != null){
									if(voisin[j].getId()==numPays1){	//le pays à attaquer est bien voisin du pays de départ
										estVoisin=true; 
									}
								}
							}
						}
						}while(numPays1<1 || numPays1>42 || (true==TabJoueurPays.contains(tabPays[numPays1-1])) || (estVoisin !=true)); // on répète tout jusqu'à ce que le pays à attaquer soit un pays voisin du pays de départ et n'appartienne pas au joueur dont c'est le tour
					}else{
						System.out.println("Problème de troupes (cf règles petit malin !!)");
						break;
					}
				}else {
					System.out.println("Mais lis les règles b***** !!");
					break;
				}

				//le combat
				nbDefenseurs=tabPays[numPays1-1].getOccupepar(); // on récupère le nombre d'armées sur le pays attaqué
				pertesCombat=Combat.combat(nbarme, nbDefenseurs); // on calcul les pertes des 2 cotés
				//On soustrait les pertes de l'attaquant
				tabPays[numPays-1].setOccupepar(tabPays[numPays-1].getOccupepar()-pertesCombat[0]); 
				// On soustrait les pertes du défenseur
				tabPays[numPays1-1].setOccupepar(tabPays[numPays1-1].getOccupepar()-pertesCombat[1]); 
				// Affichage des pertes des 2 cotés
				System.out.println("Résumé du combat: \n Perte(s) attaquant: "+pertesCombat[0]+"\nPerte(s) défenseur: "+pertesCombat[1]);
				// On récupère le nombre de défenseurs encore présent sur le pays attaqué
				nbDefenseurs=tabPays[numPays1-1].getOccupepar()-pertesCombat[1];
				if(tabPays[numPays1-1].getOccupepar()==0){ // Il n'y a plus de défenseurs
					System.out.println("Félicitations général vous avez conquis ce pays !!");
					// On remplace l'ancien propriétaire du pays par l'attaquant
					tabPays[numPays1-1].setJoueur(j1);
					// On modifie le nombre d'armées du pays attaquant et du pays conquis
					tabPays[numPays1-1].setOccupepar(nbarme-pertesCombat[0]);
					tabPays[numPays-1].setOccupepar(tabPays[numPays-1].getOccupepar()-(nbarme-pertesCombat[0]));
					//actualisation des tableaux de pays
						//ajout du pays conquis au vainqueur
						TabJoueurPays.add(tabPays[numPays1-1]);
						//retrait du pays conquis au vaincu
						for(j=0;j<TabJoueurPays1.size();j++){
							if(TabJoueurPays1.get(j).getJoueur().getCouleur() == j1.getCouleur()){
								TabJoueurPays1.remove(tabPays[numPays1-1]);
							}
						}
						for(j=0;j<TabJoueurPays2.size();j++){
							if(TabJoueurPays2.get(j).getJoueur().getCouleur() == j1.getCouleur()){
								TabJoueurPays2.remove(tabPays[numPays1-1]);
							}
						}
					// Le joueur attaquant peut déplacer des troupes du pays attaquant vers le pays conquis
					System.out.println("Combien de troupe(s) souhaitez-vous déplacer depuis le pays attaquant vers le pays conquis ?");
					nbarme=sc.nextInt();
					// vérification que le joueur possède suffisament de troupes et laisse au moins une troupe sur le pays de départ
					if(nbarme<=tabPays[numPays-1].getOccupepar() && nbarme>=0 && ((tabPays[numPays-1].getOccupepar()-nbarme)>=1)){
						// déplacements
						tabPays[numPays1-1].setOccupepar(tabPays[numPays1-1].getOccupepar()+nbarme);
						tabPays[numPays-1].setOccupepar(tabPays[numPays-1].getOccupepar()-nbarme);
					}
				}else{ // Il reste des défenseurs, le pays n'est pas conquis
					if(pertesCombat[0]>pertesCombat[1]){
					System.out.println("Retourner à l'école militaire général !!");
					}else{
						if(pertesCombat[0] == pertesCombat[1]){
					System.out.println("We call it a draw !! Says the Black Knight");
						}else{
							if(pertesCombat[0]<pertesCombat[1]){
					System.out.println("Beau travail Général!!");
							}
						}
					}
				}
				
				break;
			case 5:
				//Déplacements internes et fin du tour
				deplacementsTermines=false;
				do{
					do{
						System.out.println("saisissez le numéro du pays duquel vous souhaitez déplacer vos troupes");
						numPays=sc.nextInt();
					}while(numPays<1 || numPays>=43); // Le pays existe
					if (true==TabJoueurPays.contains(tabPays[numPays-1])){ //Le joueur possède bien le pays
						System.out.println("saisissez le nombre de troupe à déplacer (laisser au moins 1 armée sur place)");
						nbarme=sc.nextInt();
						if(nbarme<=tabPays[numPays-1].getOccupepar() && nbarme>=0 && ((tabPays[numPays-1].getOccupepar()-nbarme)>=1)){ //vérification que le joueur possède suffisament de troupes et laisse au moins une troupe sur le pays de départ
							do{
							voisin=tabPays[numPays-1].getDeplacements(); //récupération des voisins
							System.out.println("saisissez le numéro du pays de destination");
							numPays1=sc.nextInt();
							if (numPays1>=1 && numPays1<=42){
								for(j=0;j<=5;j++){
									if (voisin[j] != null){
										if(voisin[j].getId()==numPays1){
											estVoisin=true;
										}
									}
								}
							}
							}while(numPays1<1 || numPays1>=43 || (true!=TabJoueurPays.contains(tabPays[numPays1-1])) || (estVoisin !=true)); // On répète jusqu'à ce que le pays de destination soit valide
							// On modifie les armées
							tabPays[numPays-1].setOccupepar(tabPays[numPays-1].getOccupepar()-nbarme);
							tabPays[numPays1-1].setOccupepar(tabPays[numPays1-1].getOccupepar()+nbarme);
						}else{
							System.out.println("Problème de troupes (cf règles petit malin !!)");
						}
					}else {
						System.out.println("Mais lis les règles b***** !!");
					}
					
					do{
						System.out.println("Avez vous fini vos déplacements ? (0: non // 1: oui)");
						finDep = sc.nextInt();
						if(finDep==0){
							cond=true;
						}else{
							if(finDep==1){
								cond=true;
								deplacementsTermines=true;
								}else{
									cond=false;
								}
						}
					}while(cond==false);
				}while(deplacementsTermines==false);
				finTour=true;
				break;
			default :
				//fin du tour
				finTour=true;
				break;
	}
	return finTour;
}
}
		


