/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant le "main"
Ce fichier permet de jouer au jeu Risk tel que programmé par les auteurs mentionnés ci-dessus
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Risk {
	public static void main (String[] args){
		//Variables
		int nbpays, i, j, k, y, nouveauxpions, tirage; 
		boolean[] tableauAttribution= new boolean[42]; //tableau des pays non attribués
		Joueur[] tabJoueur= new Joueur[3]; //tableau des joueurs
		Pays[] tabPays= new Pays[42]; //tableau des Pays
		//tableaux des continents
		Pays[] Afrique= new Pays[6];
		Pays[] AmeriqueNord= new Pays[9];
		Pays[] AmeriqueSud= new Pays[4];
		Pays[] Asie= new Pays[12];
		Pays[] Europe= new Pays[7];
		Pays[] Oceanie= new Pays[4];
		//tableaux des pays possédés par chaque joueur
		ArrayList<Pays> Joueur1Pays = new ArrayList<Pays>();
		ArrayList<Pays> Joueur2Pays = new ArrayList<Pays>();
		ArrayList<Pays> Joueur3Pays = new ArrayList<Pays>();
		ArrayList<Pays>[] TabJoueurPays = new ArrayList[3];
		String color;
		//variables de test de condition
		boolean test;
		boolean testTirage;
		boolean finTour=false;
		boolean finJeu = false;
		int[] cond = new int[3]; // tableau des conditions de victoire
		int condtemp[] = {0,0,0};
		//scanner de saisie
		Scanner sc = new Scanner(System.in);

		//Tirage au sort des conditions de victoire
		// Total 8
		for(i=0;i<3;i++){
			do{
				testTirage = true;
				tirage =(1+(int)(Math.random() * ((8-1) +1))); // nombre aléatoire entre 1 et 8
				for(j=0;j<3;j++){
					if(tirage == condtemp[j]){
						testTirage = false;
					}
				}
				if (testTirage == true){
					condtemp[i]=tirage;
				}
				}while(testTirage == false); // on répète jusqu'à obtenir un nombre entre 1 et 8 qui n'est pas encore tiré
				cond[i] = tirage;
		}

		//création des joueurs
		Joueur j1=new Joueur("Bleu",cond[0]);
		Joueur j2=new Joueur("Vert",cond[1]);
		Joueur j3=new Joueur("Rouge",cond[2]);

		//tableau des joueurs
			for(i=0;i<3;i++){
				if(i==0){
					tabJoueur[i]=j1;
				}else{
					if (i==1){
						tabJoueur[i]=j2;
					}else{
						tabJoueur[i]=j3;
					     }
				     }
			}

		//création du tableau de pays et des continents
		tabPays=Fonctions.CreationPays(tabPays);
		Afrique=Continents.Afrique(tabPays);
		AmeriqueNord=Continents.AmeriqueNord(tabPays);
		AmeriqueSud=Continents.AmeriqueSud(tabPays);
		Asie=Continents.Asie(tabPays);
		Europe=Continents.Europe(tabPays);
		Oceanie=Continents.Oceanie(tabPays);
	
		//tableau des tableaux dynamiques des pays possédés par les joueurs
			for(i=0;i<3;i++){
				if(i==0){
					TabJoueurPays[i]=Joueur1Pays;
				}else{
					if (i==1){
						TabJoueurPays[i]=Joueur2Pays;
					}else{
						TabJoueurPays[i]=Joueur3Pays;
					     }
				     }
			}

		//calcul du nombre de pays
		nbpays=42/3;//nombre de pays par joueur

		//initialisation du tableau des pays non attribués
		for (i=0;i<42;i++){
			tableauAttribution[i]=false;
		}
	
		//attribution des pays
		for(i=0;i<3;i++){
			for (j=0;j<nbpays;j++){
				test=false;
				while(test==false){
					y=((int)(Math.random() * ((41) +1))); //obtenir un nombre aléatoire entre 0 et 41
					if (tableauAttribution[y]==false){ //le pays est disponible
						tabPays[y].setJoueur(tabJoueur[i]);
						if(i==0){
							Joueur1Pays.add(tabPays[y]);
							}else{
								if(i==1){
									Joueur2Pays.add(tabPays[y]);
									}else{
										Joueur3Pays.add(tabPays[y]);
								 	}
							}
						tableauAttribution[y]=true;
						test=true;
					}
				}
			}
		}
	
		//premier tour: affichage des conditions de victoire+répartition des armées
		for(i=0;i<3;i++){
			Fonctions2.PlacementArmees(tabJoueur[i], TabJoueurPays[i], tabPays, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);
		}

		//vrai tour de jeu
		do{
		for(i=0;i<3;i++){ // pour chaque joueur
			System.out.println("\n\nTour du joueur "+(i+1));
			//reception et disposition des renforts		
			nouveauxpions=Renfort.renforts(tabJoueur[i], TabJoueurPays[i],tabPays, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);
			Fonction3.PlacementRenfort(nouveauxpions,tabJoueur[i], TabJoueurPays[i], tabPays);
			do {
				// pour pouvoir accéder aux joueurs dont ce n'est pas le tour
				if(i==0){
					j=1;
					k=2;
				}else{
					if(i==1){
						j=0;
						k=2;
					}else{
						j=0;
						k=1;
					}
				}
				//ordres de déplacement et combat + réattribution des pays et nouvelles positions des armées
				finTour=Deplacement.DeplacementTroupes(tabJoueur[i], TabJoueurPays[i], TabJoueurPays[j], TabJoueurPays[k],tabPays, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);			
			}while(finTour !=true); // tant que le joueur n'a pas signifié sa fin de tour
			//vérification de la condition de victoire*/
			finJeu = Victoire.VictoireFinale(tabJoueur[i], tabPays, Afrique, AmeriqueNord, AmeriqueSud, Asie, Europe, Oceanie);
			if(finJeu == true){ //le joueur à réalisé sa condition de victoire
				System.out.println("Félicitations joueur "+tabJoueur[i].getCouleur()+" vous avez remporté cette partie !! \n Honte à vous joueur"+tabJoueur[j].getCouleur() +" et joueur "+tabJoueur[k].getCouleur()+" vous avez été battu");
				break; // on sort de la boucle "for" car un joueur  à réalisé sa condition de victoire
			}
		}
		}while(finJeu != true);
		System.out.println("Jeu terminé !!"); 
	}
}

