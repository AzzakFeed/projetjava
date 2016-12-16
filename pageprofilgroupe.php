<?php
session_start();
?>

<?php

 $mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
 
if ( isset($_POST['nomgroupe']) && isset($_POST['villegroupe'])  && isset($_POST['numtelg'])  && isset($_POST['mailg'])  && isset($_POST['siteg'])   && isset($_POST['descriptiongroupe'])) {
 $a = $_POST['nomgroupe'];
 $b = $_POST['villegroupe'];
 $c = $_POST['numtelg'];
 $d = $_POST['mailg'];
 $e = $_POST['siteg'];
 $description = $_POST['descriptiongroupe'];

 $sql = "INSERT INTO Groupe (nomg, villeg, telephoneg, adressemailg, siteg, descriptiong) 
 VALUES ('$a', '$b', '$c', '$d', '$e', '$description')";

 $mysqli->query($sql);
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
  <li><a href="#home">Accueil</a></li>
    <li><a href="#addgroup">Ajouter votre groupe</a></li>
	<li><a href="#addmusician">Ajouter votre profil de musicien</a></li>
  <li><a href="#about">A propos</a></li>
  <li><a href="#contact">Contact</a></li>
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
				<SELECT name="style[]" size="3" multiple>
					<OPTION value=1>Rock</OPTION>
					<OPTION value=2>Jazz</OPTION>
					<OPTION value=3>Reggae</OPTION>
					<OPTION value=4>Blues</OPTION>
					<OPTION value=5>Disco</OPTION>
					<OPTION value=6>Rap</OPTION>     
				</SELECT> </p>
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
