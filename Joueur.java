/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la classe "Joueur" pour la création des joueurs pour le jeu
*/

public class Joueur{
	
	//Champs
	private String couleur; // Indique la couleur du joueur. Sert de référentiel.
	private int nConditionDeVictoire; //Le numéro de la condition de victoire que le joueur devra accomplir pour gagner la partie.
	private static int n = 0; //Nombre de joueurs
	private int id; //id 
	
	//Constructeur vide
	public Joueur () {
		couleur ="defaut";
		nConditionDeVictoire =0;
	}
	
	//Constructeur max
	public Joueur (String c, int n){
		couleur = c;
		nConditionDeVictoire = n;
		id = ++n; // Incrémentation à chaque création d'une instance.
	}
	
	//getteurs

		//pour obtenir la couleur du joueur
	public String getCouleur() {
		return couleur;
	}

		//pour obtenir le numéro de condition de victoire du joueur
	public int getNConditionDeVictoire() {
		return nConditionDeVictoire;
	}
		//pour obtenir l'id du joueur
	public int getId() {
		return id;
	}

}
