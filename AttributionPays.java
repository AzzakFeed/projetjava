public class AttributionPays {

	//champs
	private int nbpays; 
	private boolean[] tableauAttribution= new boolean[41]; //tableau des pays non attribués
	private Joueur[] tabJoueur= new Joueur[3]; //tableau des joueurs
	private Pays[] tabPays= new Pays[42]; //tableau des Pays
	private int i;
	private int j;
	private int y;
	private String color;
	private boolean test;

	//tirage au sort condition victoire
	//création des joueurs
	Joueur j1=new Joueur("Bleu",cond1);
	Joueur j2=new Joueur("Vert",cond2);
	Joueur j3=new Joueur("Rouge",cond3);
	//tableau des joueurs
		for(i=0;i<3;i++){
			if(i=0){
				tabJoueur[i]=j1;
			}else{
				if (i=1){
					tabJoueur[i]=j2;
				}else{
					tabjoueur[i]=j3;
				     }
			     }
		}

	//calcul du nombre de pays
	nbpays=42/3;//nombre de pays par joueur

	//création des pays
	Pays p1=new Pays(1,"Afghanistan",1);
	Pays p2=new Pays(2,"Afrique du Nord",1);
	Pays p3=new Pays(3,"Afrique du Sud",10);
	Pays p4=new Pays(4,"Afrique Orientale",10);
	Pays p5=new Pays(5,"Alaska",1);
	Pays p6=new Pays(6,"Alberta",1);
	Pays p7=new Pays(7,"Amerique Centrale",5);
	Pays p8=new Pays(8,"Argentine",1);
	Pays p9=new Pays(9,"Australie Occidentale",10);
	Pays p10=new Pays(10,"Australie Orientale",1);
	Pays p11=new Pays(11,"Brésil",10);
	Pays p12=new Pays(12,"Chine",5);
	Pays p13=new Pays(13,"Congo",5);
	Pays p14=new Pays(14,"Egypte",1);
	Pays p15=new Pays(15,"Etat de l'Est",10);
	Pays p16=new Pays(16,"Etat de l'Ouest",1);
	Pays p17=new Pays(17,"Europe du Nord",5);
	Pays p18=new Pays(18,"Europe du Sud",5);
	Pays p19=new Pays(19,"Europe Occidentale",1);
	Pays p20=new Pays(20,"Grande Bretagne",5);
	Pays p21=new Pays(21,"Groenland",5);
	Pays p22=new Pays(22,"Inde",1);
	Pays p23=new Pays(23,"Indonésie",5);
	Pays p24=new Pays(24,"Islande",1);
	Pays p25=new Pays(25,"Japon",1);
	Pays p26=new Pays(26,"Kamchatka",5);
	Pays p27=new Pays(27,"Madagascar",1);
	Pays p28=new Pays(28,"Mongolie",10);
	Pays p29=new Pays(29,"Moyen Orient",10);
	Pays p30=new Pays(30,"Nouvelle Guinée",5);
	Pays p31=new Pays(31,"Ontario",5);
	Pays p32=new Pays(32,"Oural",5);
	Pays p33=new Pays(33,"Pérou",5);
	Pays p34=new Pays(34,"Québec",10);
	Pays p35=new Pays(35,"Scandinavie",10);
	Pays p36=new Pays(36,"Siam",10);
	Pays p37=new Pays(37,"Sibérie",10);
	Pays p38=new Pays(38,"Tchita",1);
	Pays p39=new Pays(39,"Territoire du Nord Ouest",10);
	Pays p40=new Pays(40,"Ukraine",10);
	Pays p41=new Pays(41,"Venezuela",10);
	Pays p42=new Pays(42,"Yakoutie",5);
	
	
	//tableau des pays

	//initialisation du tableau des pays non attribués
	for (i=0;i<42;i++){
		tableauAttribution[i]=false;
	}
	
	//attribution des pays
	for(i=0;i<3;i++){
		color=tabJoueur[i].getCouleur();
		for (j=0;j<x;j++){
			test=false;
			while(test=false){
				y=Math.min((int(Math.round(Math.random())*100)-59),0); //obtenir un nombre aléatoire entre 0 et 41
				if tableauAttribution[y]=false{ //le pays est disponible
					tabPays[y].setJoueur(tabJoueur[i]);
					tableauAttribution[y]=true;
					test=true;
				}
			}
		}
	}
}
