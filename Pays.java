/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la classe "Pays" pour la création des pays dans le jeu
*/

public class Pays{

	//Champs
		private Joueur joueur; //correspond au joueur qui possède le pays
		private int id; //n° du pays
		private String nom; //Nom du pays
		private int occupepar; //nombre de pions sur le pays
		private Pays[] tabdeplacements= new Pays[6]; //tableau des pays voisins (tableau d'objets Pays)
		private static int nbpayscrees=0; //va nous permettre avec la variable suivante de connaitre le nombre d'objet 'Pays' créés
		private int nbpays; 
	        private int nbvoisins =0;	

	//Constructeur

		public Pays(int id,String nom,int occupepar ){
			this.id=id;
			this.nom=nom;
			this.occupepar=occupepar;
		}

	//Methodes
		//"Setteurs"
		//pour modifier le propriétaire du pays
		public void setJoueur(Joueur joueur){
			this.joueur=joueur;
		}
		//pour modifier le nombre de pions occupant un pays
		public void setOccupepar(int occupepar){
			this.occupepar=occupepar;
		}
		//pour ajouter un voisin au pays
		public void addVoisin (Pays p){
			tabdeplacements[nbvoisins]=p;
			nbvoisins++;
		}
		
		//"Getteurs"
		//pour obtenir le joueur possédant le pays
		public Joueur getJoueur(){
			return joueur;
		}
		//pour obtenir l'id du pays
		public int getId(){
			return id;
		}
		//pour obtenir le nom du pays
		public String getNom(){
			return nom;
		}
		//pour obtenir le nombre d'armées occupant le pays
		public int getOccupepar(){
			return occupepar;
		}
		//pour obtenir le tableau des voisins du pays
		public Pays[] getDeplacements(){
			return tabdeplacements;
		}
}










































