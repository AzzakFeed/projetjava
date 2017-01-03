boolean verifiervictoire6 (Joueur j1){  // Posséder Asie et l'Afrique
	int cptAsie=0;
	int cptAfrique=0;
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	//victoire
	if(cptAsie==12 && cptAfrique=6){
		return true;
	}else{
		return false;
	}
}
	
boolean verifiervictoire7 (Joueur j1){ // Posséder Asie et Amérique du sud
	int cptAsie=0;
	int cptAmSud=0;
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
			cptAmSud = cptAmSud+1;
		}
	}
	//victoire
	if(cptAsie==12 && cptAmSud==4){
		return true;
	}else{
		return false;
	}
}

boolean verifiervictoire8 (Joueur j1){ // Posséder Europe, Océanie et un troisième continent au choix.
	int cptEurope=0;
	int cptOceanie=0;
	int cptAsie=0;
	int cptAmSud=0;
	int cptAmNord=0;
	int cptAfrique=0;
	//posséder l'Europe
	for(i=0;i<6;i++){
		if(Europe[i].getJoueur == j1){
			cptEurope = cptEurope+1;
		}
	}
	//posséder l'Océanie
	for(i=0;i<4;i++){
		if(AOceanie[i].getJoueur == j1){
			cptOceanie = cptOceanie+1;
		}
	}
	//3ème continent
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
			cptAmSud = cptAmSud+1;
		}
	}
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	//victoire
	if(cptEurope==6 && cptOceanie==4 && (cptAmSud==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12){
		return true;
	}else{
		return false;
	}
}

boolean verifiervictoire3 (Joueur j1){  // Posséder Europe, Amérique du Sud et un troisième continent au choix
	int cptEurope=0;
	int cptOceanie=0;
	int cptAsie=0;
	int cptAmSud=0;
	int cptAmNord=0;
	int cptAfrique=0;
	//posséder l'Europe
	for(i=0;i<6;i++){
		if(Europe[i].getJoueur == j1){
			cptEurope = cptEurope+1;
		}
	}
	//posséder l'Amérique du Sud
	for(i=0;i<4;i++){
		if(AmeriqueSud[i].getJoueur == j1){
			cptAmSud = cptAmSud+1;
		}
	}
	
	//3ème continent
	//posséder l'Asie
	for(i=0;i<12;i++){
		if(Asie[i].getJoueur == j1){
			cptAsie = cptAsie+1;
		}
	}
	//posséder l'Océanie
	for(i=0;i<4;i++){
		if(AOceanie[i].getJoueur == j1){
			cptOceanie = cptOceanie+1;
		}
	}
	//posséder l'Amérique du Nord
	for(i=0;i<9;i++){
		if(AmeriqueNord[i].getJoueur == j1){
			cptAmNord = cptAmNord+1;
		}
	}
	//posséder l'Afrique
	for(i=0;i<6;i++){
		if(Afrique[i].getJoueur == j1){
			cptAfrique = cptAfrique+1;
		}
	}
	//victoire
	if(cptEurope==6 && cptAmSud==4 && (cptOceanie==4 || cptAmNord==9 || cptAfrique==6 || cptAsie==12){
		return true;
	}else{
		return false;
	}
}
