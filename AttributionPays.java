public class AttributionPays {

	public static void main (String[] args){
	//champs
	int nbpays; 
	boolean[] tableauAttribution= new boolean[42]; //tableau des pays non attribués
	Joueur[] tabJoueur= new Joueur[3]; //tableau des joueurs
	Pays[] tabPays= new Pays[42]; //tableau des Pays
	int i;
	int j;
	int y;
	String color;
	boolean test;
	int[] cond = new int[3];
	int tirage;

	//Tirage au sort des conditions de victoire
	// Total 8
	for(i=0;i<3;i++){
		tirage =(int)(1+(int)(Math.random() * ((8-1) +1)));
		cond[i] = tirage;
	}

	//création des joueurs
	Joueur j1=new Joueur("Bleu",cond[0]);
	Joueur j2=new Joueur("Vert",cond[1]);
	Joueur j3=new Joueur("Rouge",cond[2]);

	//tableau des joueurs
		for(i=0;i<3;i++){
			if(i==0){
				tabJoueur[i]=j1;
			}else{
				if (i==1){
					tabJoueur[i]=j2;
				}else{
					tabJoueur[i]=j3;
				     }
			     }
		}

	//calcul du nombre de pays
	nbpays=42/3;//nombre de pays par joueur

	//création des pays et du tableau de pays
	Pays p1=new Pays(1,"Afghanistan",1);
	tabPays[0]=p1;
	Pays p2=new Pays(2,"Afrique du Nord",1);
	tabPays[1]=p2;
	Pays p3=new Pays(3,"Afrique du Sud",10);
	tabPays[2]=p3;
	Pays p4=new Pays(4,"Afrique Orientale",10);
	tabPays[3]=p4;
	Pays p5=new Pays(5,"Alaska",1);
	tabPays[4]=p5;
	Pays p6=new Pays(6,"Alberta",1);
	tabPays[5]=p6;
	Pays p7=new Pays(7,"Amerique Centrale",5);
	tabPays[6]=p7;
	Pays p8=new Pays(8,"Argentine",1);
	tabPays[7]=p8;
	Pays p9=new Pays(9,"Australie Occidentale",10);
	tabPays[8]=p9;
	Pays p10=new Pays(10,"Australie Orientale",1);
	tabPays[9]=p10;
	Pays p11=new Pays(11,"Brésil",10);
	tabPays[10]=p11;
	Pays p12=new Pays(12,"Chine",5);
	tabPays[11]=p12;
	Pays p13=new Pays(13,"Congo",5);
	tabPays[12]=p13;
	Pays p14=new Pays(14,"Egypte",1);
	tabPays[13]=p14;
	Pays p15=new Pays(15,"Etat de l'Est",10);
	tabPays[14]=p15;
	Pays p16=new Pays(16,"Etat de l'Ouest",1);
	tabPays[15]=p16;
	Pays p17=new Pays(17,"Europe du Nord",5);
	tabPays[16]=p17;
	Pays p18=new Pays(18,"Europe du Sud",5);
	tabPays[17]=p18;
	Pays p19=new Pays(19,"Europe Occidentale",1);
	tabPays[18]=p19;
	Pays p20=new Pays(20,"Grande Bretagne",5);
	tabPays[19]=p20;
	Pays p21=new Pays(21,"Groenland",5);
	tabPays[20]=p21;
	Pays p22=new Pays(22,"Inde",1);
	tabPays[21]=p22;
	Pays p23=new Pays(23,"Indonésie",5);
	tabPays[22]=p23;
	Pays p24=new Pays(24,"Islande",1);
	tabPays[23]=p24;
	Pays p25=new Pays(25,"Japon",1);
	tabPays[24]=p25;
	Pays p26=new Pays(26,"Kamchatka",5);
	tabPays[25]=p26;
	Pays p27=new Pays(27,"Madagascar",1);
	tabPays[26]=p27;
	Pays p28=new Pays(28,"Mongolie",10);
	tabPays[27]=p28;
	Pays p29=new Pays(29,"Moyen Orient",10);
	tabPays[28]=p29;
	Pays p30=new Pays(30,"Nouvelle Guinée",5);
	tabPays[29]=p30;
	Pays p31=new Pays(31,"Ontario",5);
	tabPays[30]=p31;
	Pays p32=new Pays(32,"Oural",5);
	tabPays[31]=p32;
	Pays p33=new Pays(33,"Pérou",5);
	tabPays[32]=p33;
	Pays p34=new Pays(34,"Québec",10);
	tabPays[33]=p34;
	Pays p35=new Pays(35,"Scandinavie",10);
	tabPays[34]=p35;
	Pays p36=new Pays(36,"Siam",10);
	tabPays[35]=p36;
	Pays p37=new Pays(37,"Sibérie",10);
	tabPays[36]=p37;
	Pays p38=new Pays(38,"Tchita",1);
	tabPays[37]=p38;
	Pays p39=new Pays(39,"Territoire du Nord Ouest",10);
	tabPays[38]=p39;
	Pays p40=new Pays(40,"Ukraine",10);
	tabPays[39]=p40;
	Pays p41=new Pays(41,"Venezuela",10);
	tabPays[40]=p41;
	Pays p42=new Pays(42,"Yakoutie",5);
	tabPays[41]=p42;
	

	
	//initialisation du tableau des pays non attribués
	for (i=0;i<42;i++){
		tableauAttribution[i]=false;
	}
	
	//attribution des pays
	for(i=0;i<3;i++){
		color=tabJoueur[i].getCouleur();
		for (j=0;j<nbpays;j++){
			test=false;
			while(test==false){
				y=(int)((int)(Math.random() * ((41) +1))); //obtenir un nombre aléatoire entre 0 et 41
				if (tableauAttribution[y]==false){ //le pays est disponible
					tabPays[y].setJoueur(tabJoueur[i]);
					tableauAttribution[y]=true;
					test=true;
				}
			}
		}
	}
	}
}
