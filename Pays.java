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
	//Constructeurs
		//constructeur vide
		/*public Pays (){
			this(j1,0,"neverland",0);
			nbpays=++nbpayscrees;
		}*/
		//constructeur "max"
		public Pays(Joueur joueur,int id,String nom,int occupepar ){
			this.joueur=joueur;
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

		public void addVoisin (Pays p){
			tabdeplacements[nbvoisins]=p;
			nbvoisins++;
		}
		
		//"Getteurs"
		public Joueur getJoueur(){
			return joueur;
		}
		public int getId(){
			return id;
		}
		public String getNom(){
			return nom;
		}
		public int getOccupepar(){
			return occupepar;
		}
		/*public Pays[] getDeplacements(){
			return tabdeplacements;
		}*/
}










































