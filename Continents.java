/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant les différentes fonctions (6) qui permettent d'obtenir les contients (tableaux de pays)
*/

public class Continents {

	// Création de l'Afrique
	public static Pays[] Afrique (Pays[] tabPays){

		Pays[] Afrique= new Pays[6];

		Afrique[0]=tabPays[1];
		Afrique[1]=tabPays[2];
		Afrique[2]=tabPays[3];
		Afrique[3]=tabPays[12];
		Afrique[4]=tabPays[13];
		Afrique[5]=tabPays[26];

		return Afrique;
	}

	// Création de l'Amérique du Nord
	public static Pays[] AmeriqueNord (Pays[] tabPays){

		Pays[] AmeriqueNord= new Pays[9];

		AmeriqueNord[0]=tabPays[4];
		AmeriqueNord[1]=tabPays[5];
		AmeriqueNord[2]=tabPays[6];
		AmeriqueNord[3]=tabPays[14];
		AmeriqueNord[4]=tabPays[15];
		AmeriqueNord[5]=tabPays[20];
		AmeriqueNord[6]=tabPays[30];
		AmeriqueNord[7]=tabPays[33];
		AmeriqueNord[8]=tabPays[38];

		return AmeriqueNord;

	}

	// Création de l'Amérique du Sud
	public static Pays[] AmeriqueSud (Pays[] tabPays){

		Pays[] AmeriqueSud= new Pays[4];

		AmeriqueSud[0]=tabPays[7];
		AmeriqueSud[1]=tabPays[10];
		AmeriqueSud[2]=tabPays[32];
		AmeriqueSud[3]=tabPays[40];

		return AmeriqueSud;
	}

	// Création de l'Asie
	public static Pays[] Asie (Pays[] tabPays){

		Pays[] Asie= new Pays[12];

		Asie[0]=tabPays[0];
		Asie[1]=tabPays[11];
		Asie[2]=tabPays[21];
		Asie[3]=tabPays[24];
		Asie[4]=tabPays[25];
		Asie[5]=tabPays[27];
		Asie[6]=tabPays[28];
		Asie[7]=tabPays[31];
		Asie[8]=tabPays[35];
		Asie[9]=tabPays[36];
		Asie[10]=tabPays[37];
		Asie[11]=tabPays[41];

		return Asie;

	}

	// Création de l'Europe
	public static Pays[] Europe (Pays[] tabPays){

		Pays[] Europe= new Pays[7];

		Europe[0]=tabPays[16];
		Europe[1]=tabPays[17];
		Europe[2]=tabPays[18];
		Europe[3]=tabPays[19];
		Europe[4]=tabPays[23];
		Europe[5]=tabPays[34];
		Europe[6]=tabPays[39];

		return Europe;

	}

	// Création de l'Océanie
	public static Pays[] Oceanie (Pays[] tabPays){

		Pays[] Oceanie= new Pays[4];

		Oceanie[0]=tabPays[8];
		Oceanie[1]=tabPays[9];
		Oceanie[2]=tabPays[22];
		Oceanie[3]=tabPays[29];

		return Oceanie;
	}
}
