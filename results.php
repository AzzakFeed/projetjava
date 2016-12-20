

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<!-- Barre de navigation horizontale, top !-->
<ul class="nav" id="nav">
  <li><a href="#home">Accueil</a></li>
    <li><a href="#addgroup">Ajouter votre groupe</a></li>
	<li><a href="#addmusician">Ajouter votre profil de musicien</a></li>
  <li><a href="#about">A propos</a></li>
  <li><a href="#contact">Contact</a></li>
    <li><a href="#contact">Se déconnecter</a></li>
</ul>

<!-- Titre !-->
    <header>
        <div class="header">
                <h1>Nom<h1>
				<p>Annuaire</p>
        </div>
    </header>

<div class="contenu" id="contenuform">


<?php
ini_set('display_errors', 'On');
error_reporting(E_ALL);
$mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");

if (isset( $_POST['nomgroupe'])){
 $a = $_POST['nomgroupe'];
 }

if (isset( $_POST['villegroupe'])){
 $b = $_POST['villegroupe'];
}
if (isset( $_POST['nomgroupe'])){
	$req = "SELECT nomg FROM Groupe WHERE nomg='$a'";
	$resultat=mysqli_query($mysqli,$req,MYSQLI_STORE_RESULT);
	while($tab=mysqli_fetch_assoc($resultat)){
		echo "Nom: " . $tab["nomg"]. "<br>";
	}
}
else {
	$req = "SELECT nomg FROM Groupe";
	$resultat=mysqli_query($mysqli,$req,MYSQLI_STORE_RESULT);
	while($tab=mysqli_fetch_assoc($resultat)){
		echo "Nom: " . $tab["nomg"]. "<br>";
	}
}
$mysqli->close();

?>



</div>
</body>
</html>

