import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions2 {

	public static void PlacementArmees(Joueur j1, ArrayList<Pays> TabJoueurPays, Pays[] tabPays){
		int nbpions=0;
		int num, j;
		int nbarme=0;
		Scanner sc = new Scanner(System.in);
		Fonctions.AfficherConditionVictoire(j1);
				System.out.println(j1.getNConditionDeVictoire()+"Joueur "+j1.getCouleur()+" positionnez vos armées");	
				for(j=0;j<TabJoueurPays.size();j++){
					nbpions=TabJoueurPays.get(j).getOccupepar()-1+nbpions;
					TabJoueurPays.get(j).setOccupepar(1);
				}
				while (nbpions>0){
					do {
						System.out.println("Il vous reste "+nbpions+" pions à placer");
						for(j=0;j<TabJoueurPays.size();j++){
						System.out.println("Pays : "+TabJoueurPays.get(j).getNom()+" n° "+TabJoueurPays.get(j).getId()+" Occupé par : "+TabJoueurPays.get(j).getOccupepar()+" armée(s)");
						}
							do{
								System.out.println("saisissez le numéro du pays sur lequel vous voulez placer une/des armée(s)");
								num=sc.nextInt();
							}while(num<1 || num>=43);
							if (true==TabJoueurPays.contains(tabPays[num-1])){
								System.out.println("saisissez le nombre de troupe à placer");
								nbarme=sc.nextInt();
								if(nbarme<=nbpions){
									tabPays[num-1].setOccupepar(nbarme+tabPays[num-1].getOccupepar());
									nbpions=nbpions-nbarme;
								}else
									System.out.println("Vous ne disposez pas d'assez de troupes");
							}else
								System.out.println("Ce pays n'est pas disponible");
						}while (nbpions>0); 
			
				}
			System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
}
}
