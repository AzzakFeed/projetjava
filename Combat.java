/*
Cadiot Vincent
Oshiro Ken
M2CCI
Fichier contenant la fonction permettant de déterminer l'issu d'un combat et qui retourne un tableau des pertes des 2 belligérants
*/

public class Combat{


	static int[] combat (int att, int def){

		int[] tabRes = new int[2];//tableau de résultat: 1ère case pertes de l'attaquant, 2ème case pertes du défenseur
		int i = 0;
		int jetsatt = 0;
		int jetsdef = 0;
		int resultatatt[] = {0,0,0}; // tableau des résultats des lancés de dés de l'attaquant
		int resultatdef[] = {0,0}; // tableau des résultats des lancés de dés du défenseur

		int maxatt = 0;
		int maxdef = 0;
		
		// On lance au maximum 3 dés pour l'attaquant si pions >2, 2 si pions = 2, 1 si pion = 1

		if (att == 1){
			jetsatt = 1;
			}else{
				if (att ==2){
					jetsatt = 2;
				}
				else {
					jetsatt = 3;
				}
			}

		for (i = 0; i < jetsatt; i++){
		resultatatt[i] =(1+(int)(Math.random() * ((6-1) +1))); //jeté de dé à 6 faces
		System.out.println("Jet de l'attaquant : " + resultatatt[i]);
		}

		// On lance au maximum 2 dés pour le défenseur, 1 si nombre de régiments <3
		if (def== 1){
			jetsdef = 1;
			}
		else {
			jetsdef = 2;
		}

		for (i = 0; i < jetsdef ; i++){
		resultatdef[i] =(1+(int)(Math.random() * ((6-1) +1))); //jeté de dé à 6 faces
		System.out.println("Jet du défenseur : "+resultatdef[i]);
		}

		// On compare le plus haut résultat de l'attaque face à la plus haute valeur de la défense
		for (i = 0; i < jetsatt ; i++){
			if(resultatatt[i] > maxatt){
				maxatt = resultatatt[i];
				}
			}
		
		for (i = 0; i < jetsdef ; i++){
			if(resultatdef[i] > maxdef){
				maxdef = resultatdef[i];
			}
		}

		if (maxatt > maxdef){
			// le dé le plus haut de l'attaquant est supérieur au dé le plus haut du défenseur
			tabRes[0]= 0;
			tabRes[1]= 1;
			}
			else {
			// le dé le plus haut de l'attaquant est inférieur au dé le plus haut du défenseur
			tabRes[0]= 1;
			tabRes[1]= 0;
			}
		//suppression du dé le plus fort pour pouvoir comparer ensuite le 2ème dé le plus haut

		for (i = 0; i < jetsatt ; i++){
			if(resultatatt[i] == maxatt){
				resultatatt[i]=0;
				maxatt=0;
				}
			}
		
		for (i = 0; i < jetsdef ; i++){
			if(resultatdef[i] == maxdef){
				resultatdef[i]=0;
				maxdef=0;
			}
		}
		// On compare le plus haut résultat de l'attaque face à la plus haute valeur de la défense

		if (jetsdef > 1){
			for (i = 0; i < jetsatt ; i++){
			if(resultatatt[i] > maxatt){
				maxatt = resultatatt[i];
				}
			}
		
			for (i = 0; i < jetsdef ; i++){
				if(resultatdef[i] > maxdef){
					maxdef = resultatdef[i];
				}

		}
	
		}

		if( att>=2 && def>=2){
			if (maxatt > maxdef){
				// le dé le plus haut de l'attaquant est supérieur au dé le plus haut du défenseur
				tabRes[1]= tabRes[1] + 1;
			}
			else {
				// le dé le plus haut de l'attaquant est inférieur au dé le plus haut du défenseur
				tabRes[0] = tabRes[0]+ 1;
			}
		}


		// Retour des pertes
		return tabRes;
	}
}


	
	
