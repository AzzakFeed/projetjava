public class Fonctions {
//fonctions et procédures
public static void AfficherConditionVictoire(Joueur j1){
	if (j1.getNConditionDeVictoire() == 1){
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir 18 territoires et occuper chacun d'eux avec deux armees au moins");
	}
	if (j1.getNConditionDeVictoire() == 2){
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalite l'Amérique du Nord et l'Afrique");
	}
	if (j1.getNConditionDeVictoire() == 3){
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalite l'Europe et l'Amerique du sud plus un troisieme continent au choix");
	}
	if (j1.getNConditionDeVictoire() == 4) {
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir 24 territoires aux choix");
	}
	if (j1.getNConditionDeVictoire() == 5) {
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalite l'Amerique du Nord et l'Oceanie");
	}
	if (j1.getNConditionDeVictoire() == 6) {
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalite l'Asie et l'Afrique");
	}
	if (j1.getNConditionDeVictoire() == 7) {
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalite l'Asie et l'Amerique du sud");
	}
	if (j1.getNConditionDeVictoire() == 8) {
		System.out.println("Joueur " +j1.getCouleur()+" : Vous devez conquerir en totalité l'Europe et l'Oceanie plus un troisieme continent au choix");
	}
}

/*public static void CreationPays(){
*/	
}
