public class Pays{

	//Champs
		private String joueur; //correspondra à la couleur associé au joueur
		private int id; //n° du pays
		private String nom; //Nom du pays
		private int occupepar; //nombre de pions sur le pays
		private int deplacement1; //indique l'id du pays voisin vers lequel il est possible de déplacer ses pions; au maximum un pays peut avoir 6 pays voisins
		private int deplacement2;
		private int deplacement3;
		private int deplacement4;
		private int deplacement5;
		private int deplacement6;

	//Constructeurs
		//constructeur vide
		public Pays (){
			this("0",0,"neverland",0,0,0,0,0,0,0);
		}
		//constructeur "max"
		public Pays(String joueur,int id,String nom,int occupepar,int deplacement1,int deplacement2,int deplacement3,int deplacement4,int deplacement5,int deplacement6){
			this.joueur=joueur;
			this.id=id;
			this.nom=nom;
			this.occupepar=occupepar;
			this.deplacement1=deplacement1;
			this.deplacement2=deplacement2;
			this.deplacement3=deplacement3;
			this.deplacement4=deplacement4;
			this.deplacement5=deplacement5;
			this.deplacement6=deplacement6;
		}

	//Methodes
		//"Setteurs"
		//pour modifier le propriétaire du pays
		public void setJoueur(String joueur){
			this.joueur=joueur;
		}
		//pour modifier le nombre de pions occupant un pays
		public void setOccupepar(int occupepar){
			this.occupepar=occupepar;
		}
		//"Getteurs"
		public String getJoueur(){
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
		public int getDeplacement1(){
			return deplacement1;
		}
		public int getDeplacement2(){
			return deplacement2;
		}
		public int getDeplacement3(){
			return deplacement3;
		}
		public int getDeplacement3(){
			return deplacement1;
		}
		public int getDeplacement4(){
			return deplacement4;
		}
		public int getDeplacement5(){
			return deplacement5;
		}
		public int getDeplacement6(){
			return deplacement6;
		}
}








































