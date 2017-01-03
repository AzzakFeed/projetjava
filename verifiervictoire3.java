
boolean verifiervictoire3 (Joueur j1){  // Posséder Europe, Amérique du Sud et un troisième continent au choix
	int cpt = 0; 
	
	//Europe
	for(i=0;i==6;i++){
		if(Europe[i].getJoueur == j1){
			cpt += 1;
		}
		
		if(cpt==6){
			
			//Amérique du Sud
			
			cpt = 0;
			for (i=0; i== 4 ; i++){
				if( AmeriqueSud[i].getJoueur == j1){
					cpt += 1;
				}
			}
			if(cpt == 4){
		
				//Vérifier Amérique du nord
				
				cpt = 0;
				for (i = 0; i == 8 ; i++){
					if( AmeriqueNord[i].getJoueur == j1){
						cpt += 1;
					}
				}
				if (cpt == 12){
					return true;
					else
					{
						//Vérifier Asie
						cpt = 0;
						for(i = 0 ; i == 12 ; i++){
							if(Asie[i].getJoueur == j1){
								cpt +=1;
							}
						}
		
						if (cpt == 12){
							return true;
							else
							{
								
								//Vérifier Océanie
									cpt = 0;
									for (i= 0; i == 4 ; i++){
										if(Oceanie[i].getJoueur == j1){
											cpt +=1;
										}
									}
									
									if (cpt == 4){
										return true;
										else
										{
											//Vérifier Afrique
											cpt = 0;
											for (i = 0; i == 6 ; i++){
												if (Afrique[i].getJoueur = j1){
													cpt += 1;
												}
											}
											if (cpt == 6) {
											return true;
											else
											return false;}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
						
