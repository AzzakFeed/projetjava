import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main (String[] args){
	//champs
	int nbpays; 
	boolean[] tableauAttribution= new boolean[42]; //tableau des pays non attribués
	Joueur[] tabJoueur= new Joueur[3]; //tableau des joueurs
	Pays[] tabPays= new Pays[42]; //tableau des Pays
	//tableaux des pays possédés par chaque joueur
	ArrayList<Pays> Joueur1Pays = new ArrayList<Pays>();
	ArrayList<Pays> Joueur2Pays = new ArrayList<Pays>();
	ArrayList<Pays> Joueur3Pays = new ArrayList<Pays>();
	ArrayList<Pays>[] TabJoueurPays = new ArrayList[3];
	//variables
	int i;
	int j;
	int y;
	String color;
	boolean test;
	int[] cond = new int[3];
	int tirage;
	int condtemp[] = {0,0,0};
	//scanner de saisie
	Scanner sc = new Scanner(System.in);

	//Tirage au sort des conditions de victoire
	// Total 8
	for(i=0;i<3;i++){
		do{
			tirage =(1+(int)(Math.random() * ((8-1) +1)));
			condtemp[i]=tirage;
			}while(tirage==condtemp[0] && tirage==condtemp[1]);
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

	Fonctions.CreationPays(tabPays);

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
		Fonctions2.PlacementArmees(tabJoueur[i], TabJoueurPays[i], tabPays);
	}

	//vrai tour de jeu
		//reception et disposition des renforts
		//ordres de déplacement et combat + réattribution des pays et nouvelles positions des armées
		//vérification de la condition de victoire
}
}

