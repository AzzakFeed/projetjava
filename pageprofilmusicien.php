<?php
session_start();
?>

<?php

 $mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
 
if ( isset($_POST['nom']) && isset($_POST['prenom'])  && isset($_POST['age'])  && isset($_POST['villemusicien'])) {
 $a = $_POST['nom'];
 $b = $_POST['prenom'];
 $c = $_POST['age'];
 $d = $_POST['villemusicien'];

 $sql = "INSERT INTO Musicien (nomm, prenomm, agem, villem) 
 VALUES ('$a', '$b', '$c', '$d')";

 $mysqli->query($sql);
}
?>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<title>Profil Musicien</title>
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
                <h1>Votre profil musicien<h1>
		</div>
		<div id="contenuform">
				<form method="post">
				<p>Nom:<br>
				<input type="text" name="nom"></p>
				<p>Prénom:<br>
				<input type="text" name="prenom"></p>
				<p>age:<br>
				<input type="text" name="age"></p>
				<p>Ville:<br>
				<input type="text" name="villemusicien"></p>
				<p>Numéro de téléphone:<br>
				<input type="tel" name="numtelm"></p>
				<p>Adresse mail:<br>
				<input type="email" name="mailm"></p>
				<p>Site internet <br>(MySpace, facebook, BandCamp, etc...):<br>
				<input type="text" name="sitem"></p>
				<p>De quel(s) instrument(s) jouez-vous? <br>
					Guitare <INPUT type="checkbox" name="guitare"><br>
					Vilon <INPUT type="checkbox" name="violon"><br>
					Basse <INPUT type="checkbox" name="basse"><br>
					Batterie <INPUT type="checkbox" name="batterie"><br>
					Chanteur <INPUT type="checkbox" name="chanteur"><br>
				</p>
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
				<p>Descrivez vous:<br><TEXTAREA name="descriptionmusicien" rows="8" cols="20">
				<!--Présentez vous, votre histoire, vos objectifs, etc... !-->
				</TEXTAREA></p>
				<p><input type="submit" value="Ajouter"/></p>
				<p></p> <input type="reset" value="Annuler" /></p>
				</form>
		</div>
    </header>

</body>
</html>
