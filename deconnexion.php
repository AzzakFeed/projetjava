<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<title>Déconnexion</title>
</head>
<body>


<!-- Titre !-->
   <header>
        <div class="header">
                <h1>Nom<h1>
				<p>Déconnexion</p>
        </div>
    </header>

<div class="contenu" id="smallbox">
	Merci de votre visite et à bientôt !
	<?php
	
	session_destroy();
	
	?>
		
	 </div>
	 <br> <br>
<a href="connexion.php" class="button">Retour à la page d'accueil</a>
	
	
	
	

	   
	  
	   

</body>
</html>
