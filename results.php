<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<!-- Barre de navigation horizontale, top !-->
<ul class="nav" id="nav">
	<li><a href="pageaccueil.php">Accueil</a></li>
    <li><a href="pageprofilgroupe.php">Ajouter votre groupe</a></li>
	<li><a href="pageprofilmusicien.php">Ajouter votre profil de musicien</a></li>
	<li><a href="recherche.php">Accéder à l'annuaire</a></li>
	<li><a href="pageapropos.php">A propos</a></li>
	<li><a href="pagecontact.php">Contact</a></li>
    <li><a href="deconnexion.php">Se déconnecter</a></li>
</ul>

<!-- Titre !-->
    <header>
        <div class="header">
                <h1>Annuaire<h1>
				<p></p>
        </div>
    </header>

<div class="contenu" id="contenuform">

<?php
ini_set('display_errors', 'On');
error_reporting(E_ALL);



$mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
if (isset( $_POST['nomgroupe'])){
 $nomg = $_POST['nomgroupe'];
 }
if (isset( $_POST['villegroupe'])){
 $villeg = $_POST['villegroupe'];
}
if (isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ){
for($i=1;$i<=4;$i++){
	if(isset($_POST['guitare'])){
		$instru='guitare';
	}else{
		if(isset($_POST['basse'])){
			$instru='basse';
		}else{
			if(isset($_POST['batterie'])){
				$instru='batterie';
			}else{
				if(isset($_POST['chanteur'])){
					$instru='chanteur';
				}
			}
		}
	}
}
}

printf ($nomg,$villeg);

if (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) {
for($j=1;$j<=4;$j++){
	if(isset($_POST['rock'])){
		$stylem='Rock';
	}else{
		if(isset($_POST['blues'])){
			$stylem='Blues';
		}else{
			if(isset($_POST['jazz'])){
				$stylem='Jazz';
			}else{
				if(isset($_POST['rap'])){
					$stylem='Rap';
				}
			}
		}
	}
}
}
//rajouter conditions négatives
if (isset( $_POST['nomgroupe'])){
	$req = "SELECT nomg, villeg, styleg, telephoneg FROM Groupe WHERE nomg='$nomg'";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomg, $villeg, $styleg, $telephoneg);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du groupe: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> __________________________________ <br>",$nomg,$villeg,$styleg,$telephoneg);
	}
	mysqli_stmt_close($stmt);
}
if (isset( $_POST['villegroupe'])){
	$req = "SELECT nomg, villeg, styleg, telephoneg FROM Groupe WHERE villeg='$villeg'";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomg, $villeg, $styleg, $telephoneg);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du groupe: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> __________________________________ <br>",$nomg,$villeg,$styleg,$telephoneg);
	}
	mysqli_stmt_close($stmt);
}


if (empty($nomg)  && empty($villeg) && empty($instru) && empty($stylem)){ 
	$req = "SELECT nomg, villeg, styleg, telephoneg FROM Groupe";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomg, $villeg, $styleg, $telephoneg);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du groupe: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> __________________________________ <br>",$nomg,$villeg,$styleg,$telephoneg);
	}
	mysqli_stmt_close($stmt);
}


$mysqli->close();
?>


</div>
</body>
</html>
