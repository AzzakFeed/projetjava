/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction permettant de placer les renforts du joueur en début de tour
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Fonction3 {

	public static void PlacementRenfort(int renforts, Joueur j1, ArrayList<Pays> TabJoueurPays, Pays[] tabPays){
		int num, j;
		int nbarme=0;
		Scanner sc = new Scanner(System.in);
		Fonctions.AfficherConditionVictoire(j1);
				System.out.println("\nJoueur "+j1.getCouleur()+" positionnez vos renforts\n");	
				
				while (renforts>0){
					do {
						//affichage du nombre de renforts restants et de l'état des forces du joueur
						System.out.println("Il vous reste "+renforts+" renforts à placer\n");
						for(j=0;j<TabJoueurPays.size();j++){
						System.out.println("Pays : "+TabJoueurPays.get(j).getNom()+" n° "+TabJoueurPays.get(j).getId()+" Occupé par : "+TabJoueurPays.get(j).getOccupepar()+" armée(s)");
						}
							do{
								System.out.println("\nsaisissez le numéro du pays sur lequel vous voulez placer une/des renfort(s)");
								num=sc.nextInt();
							}while(num<1 || num>=43); // le pays existe
							if (true==TabJoueurPays.contains(tabPays[num-1])){ //si le joueur possède le pays
								System.out.println("saisissez le nombre de renforts à placer");
								nbarme=sc.nextInt();
								if(nbarme<=renforts && nbarme>=0){ //le joueur dispose de suffisament de renforts
									tabPays[num-1].setOccupepar(nbarme+tabPays[num-1].getOccupepar());
									renforts=renforts-nbarme;
								}else
									System.out.println("Vous ne disposez pas d'assez de renforts");
							}else
								System.out.println("Ce pays n'est pas disponible");
						}while (renforts>0); 
			
				}
			System.out.println("\n"+"\n"+"\n"+"\n");
}
}
