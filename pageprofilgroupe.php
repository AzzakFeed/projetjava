<?php
session_start();
?>

<?php

 $mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
 
if ( isset($_POST['nomgroupe']) && isset($_POST['villegroupe'])  && isset($_POST['numtelg'])
  && isset($_POST['mailg'])  && isset($_POST['siteg'])   && isset($_POST['descriptiongroupe'])
	&& (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) )
		&& (isset($_POST['guitariste']) || isset($_POST['bassiste']) || isset($_POST['batteur'])|| isset($_POST['chanteur']) )) {
 $a = $_POST['nomgroupe'];
 $b = $_POST['villegroupe'];
 $c = $_POST['numtelg'];
 $d = $_POST['mailg'];
 $e = $_POST['siteg'];
 $description = $_POST['descriptiongroupe'];

for($j=1;$j<=4;$j++){
	if($_POST['rock'] == on){
		$styleg='Rock';
	}else{
		if($_POST['blues'] == on){
			$styleg='Blues';
		}else{
			if($_POST['jazz'] == on){
				$styleg='Jazz';
			}else{
				if($_POST['rap'] == on){
					$styleg='Rap';
				}
			}
		}
	}
}
for($j=1;$j<=4;$j++){
	if($_POST['guitariste'] == on){
		$chercheg='guitariste';
	}else{
		if($_POST['bassiste'] == on){
			$chercheg='bassiste';
		}else{
			if($_POST['batteur'] == on){
				$chercheg='batteur';
			}else{
				if($_POST['chanteur'] == on){
					$chercheg='chanteur';
				}
			}
		}
	}
}
 $sql = "INSERT INTO Groupe (nomg, villeg, telephoneg, adressemailg, siteg, descriptiong,styleg, grecherchem) 
 VALUES ('$a', '$b', '$c', '$d', '$e', '$description','$styleg','$chercheg')";

 $mysqli->query($sql);
 
 header('Location: http://pubhtml/~E092321Z/Projet_PHP/succesformulaire.php');
 
}

?>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<title>Profil groupe</title>
</head>
<body>


<!-- Barre de navigation horizontale, top !-->
<ul class="nav" id="nav">
	<li><a href="pageaccueuil.php">Accueil</a></li>
    <li><a href="pageprofilgroupe.php">Ajouter votre groupe</a></li>
	<li><a href="pageprofilmusicien.php">Ajouter votre profil de musicien</a></li>
	<li><a href="recherche.php">votre recherche</a></li>
	<li><a href="pageapropos.php">A propos</a></li>
	<li><a href="pagecontact.php">Contact</a></li>
    <li><a href="connexion.php">Se déconnecter</a></li>
</ul>

<!-- Titre !-->
    <header>
       <div id="formulaire">
                <h1>Votre groupe<h1>
		</div>
		<div id="contenuform">
				<form method="post">
				<p>Nom du groupe:<br>
				<input type="text" name="nomgroupe"></p>
				<p>Ville:<br>
				<input type="text" name="villegroupe"></p>
				<p>Numéro de téléphone:<br>
				<input type="tel" name="numtelg"></p>
				<p>Adresse mail:<br>
				<input type="email" name="mailg"></p>
				<p>Site internet <br>(MySpace, facebook, BandCamp, etc...):<br>
				<input type="text" name="siteg"></p>
				<p>Style musical:<br>
					Rock <INPUT type="checkbox" name="rock">
					Blues <INPUT type="checkbox" name="blues"><br>
					Jazz <INPUT type="checkbox" name="jazz">
					Rap <INPUT type="checkbox" name="rap"><br>
				<p>Notre groupe recherche:<br>
					Rock <INPUT type="checkbox" name="guitariste">
					Blues <INPUT type="checkbox" name="bassiste"><br>
					Jazz <INPUT type="checkbox" name="batteur">
					Rap <INPUT type="checkbox" name="chanteur"><br>
				<p></p>
				<p></p>
				<p></p>
				<p></p>
				<p>Description du groupe:<br><TEXTAREA name="descriptiongroupe" rows="8" cols="20">
				<!--Présentez votre groupe, son histoire, les membres qui le composent, ses objectifs, etc... !-->
				</TEXTAREA></p>
				<p><input type="submit" value="Ajouter"/></p>
				<p></p> <input type="reset" value="Annuler" /></p>
				</form>
		</div>
    </header>

</body>
</html>
