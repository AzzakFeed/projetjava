/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction permettant de placer les troupes du joueur en début de partie
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions2 {

	public static void PlacementArmees(Joueur j1, ArrayList<Pays> TabJoueurPays, Pays[] tabPays, Pays[] Continent1, Pays[] Continent2, Pays[] Continent3, Pays[] Continent4, Pays[] Continent5, Pays[] Continent6){

		//variables
		int nbpions=21; // chaque joueur reçoit 35 armées, 1 armé est soustraite de chaque pays possédé (14) pour y être placée (35-14=21)
		int num, j, i, choix;
		int nbarme=0;
		Scanner sc = new Scanner(System.in);
		//Affichage de la condition de victoire du joueur
		Fonctions.AfficherConditionVictoire(j1);
		//une armée est placée automatiquement sur chaque pays possédé par le joueur (cf respect des règles)
		for(i=0;i<14;i++){
			TabJoueurPays.get(i).setOccupepar(1);
		}
		do {

			//menu

			System.out.println("\n\njoueur"+ j1.getCouleur()+"\n\n");
			System.out.println("Menu:\n 1: Afficher la carte du monde\n 2: Placez vos troupes\n");
			System.out.println("Saisissez votre choix");
			choix = sc.nextInt();
			switch (choix){
			
				case 1:
				//cas1:	Affichage des pays+infos par continent
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
			
				case 2:
				//cas2: placement des troupes
				System.out.println("Il vous reste "+nbpions+" pions à placer\n");
				//réaffichage des forces du joueur
				for(j=0;j<TabJoueurPays.size();j++){
				System.out.println("Pays : "+TabJoueurPays.get(j).getNom()+" n° "+TabJoueurPays.get(j).getId()+" Occupé par : "+TabJoueurPays.get(j).getOccupepar()+" armée(s)");
				}
					do{
						System.out.println("\nsaisissez le numéro du pays sur lequel vous voulez placer une/des armée(s)");
						num=sc.nextInt();
					}while(num<1 || num>=43); // le pays existe
					if (true==TabJoueurPays.contains(tabPays[num-1])){ //le joueur possède le pays
						System.out.println("saisissez le nombre de troupe à placer");
						nbarme=sc.nextInt();
						if(nbarme<=nbpions && nbarme>=0){ //le joueur possède assez d'armées
							//placement des armées
							tabPays[num-1].setOccupepar(nbarme+tabPays[num-1].getOccupepar());
							nbpions=nbpions-nbarme;
						}else
							System.out.println("Vous ne disposez pas d'assez de troupes");
					}else
						System.out.println("Ce pays n'est pas disponible");
				System.out.println("\n"+"\n"+"\n");
				break;
			}
		}while (nbpions>0); 
	}

}
