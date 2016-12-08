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
	public Joueur (String c, int n, int id){
		couleur = c;
		nConditionDeVictoire = n;
		id = ++n; // Incrémentation à chaque création d'une instance.
	}
	
	//set
public void set(String c, int n, int id){
	couleur = c;
	nConditionDeVictoire = n;
}

	//getCouleur
public String getCouleur() {
	return couleur;
}

	//get le numéro de condition de victoire
public int getNConditionDeVictoire() {
	return nConditionDeVictoire;
}

}

