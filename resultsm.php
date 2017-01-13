<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<!-- Barre de navigation horizontale, top !-->
<ul class="nav" id="nav">
	<li><a href="pageaccueil.php">Accueil</a></li>
    <li><a href="pageprofilMusicien.php">Ajouter votre Musicien</a></li>
	<li><a href="pageprofilMusicien.php">Ajouter votre profil de Musicien</a></li>
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

$nbrequete = 0;

$mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");

 //récupération des variables depuis le formulaire
if (isset( $_POST['nomMusicien'])){
 $nomm = $_POST['nomMusicien'];
 }
 
if (isset( $_POST['villeMusicien'])){
 $villem = $_POST['villeMusicien'];
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
//seul le premier champ du formulaire est rempli
if (isset( $_POST['nomMusicien']) && empty($villem) && empty($instru) && empty($stylem)){
	$req = "SELECT nomm, villem, stylem,  telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE nomm='$nomm'";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem, $instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete += 1;
}

//seul le deuxième champ du formulaire est rempli
if (isset( $_POST['villeMusicien']) && empty($nomm) && empty($instru) && empty($stylem) && $nbrequete<1){
	$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE villem='$villem'";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
}

//seuls les champs 1 et 2 du formulaires sont remplis
if (isset( $_POST['villeMusicien']) && isset( $_POST['nomMusicien']) && empty($instru) && empty($stylem) && $nbrequete <1){
	$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE villem='$villem' AND nomm='$nomm'";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
}


//Aucun champ du formulaire n'est rempli
if (empty($nomm)  && empty($villem) && empty($instru) && empty($stylem)){ 
	$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien";
	$stmt = mysqli_prepare($mysqli,$req);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
}

//seul le 3ème champ du formulaire est rempli
if((isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && empty($nomm)  && empty($villem) && empty($instru)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE stylem='$stylem'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seul le dernier champ du formulaire est rempli
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && empty($nomm)  && empty($villem) && empty($stylem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br> Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 1 et 3 du formulaire sont remplis
if((isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && isset($nomm)  && empty($villem) && empty($instru)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE stylem='$stylem' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}


//seuls les champs 1 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && isset($nomm)  && empty($villem) && empty($stylem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 2 et 3 du formulaire sont remplis
if((isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && empty($nomm)  && isset($villem) && empty($instru)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE stylem='$stylem' AND villem='$villem'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 2 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && empty($nomm)  && isset($villem) && empty($stylem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND villem='$villem'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 3 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && empty($nomm)  && empty($villem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND stylem='$stylem'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 1, 2 et 3 du formulaire sont remplis
if((isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && isset($nomm)  && isset($villem) && empty($instru)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE stylem='$stylem' AND villem='$villem' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 1, 3 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && isset($nomm)  && empty($villem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND stylem='$stylem' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 1, 2 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && isset($nomm)  && isset($villem) && empty($stylem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND villem='$villem' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//seuls les champs 2, 3 et 4 du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && empty($nomm)  && isset($villem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND stylem='$stylem' AND villem='$villem'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}

//tout les champs du formulaire sont remplis
if((isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) ) && (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) ) && isset($nomm)  && isset($villem)){
	if($nbrequete <1){
		$req = "SELECT nomm, villem, stylem, telephonem, instrumentm, agem, adressemailm, sitem, descriptionm FROM Musicien WHERE grecherchem='$instru' AND stylem='$stylem' AND villem='$villem' AND nomm='$nomm'";
		$stmt = mysqli_prepare($mysqli,$req);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $nomm, $villem, $stylem, $telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
		while (mysqli_stmt_fetch($stmt)) {
		printf ("Nom du Musicien: %s <br> Ville: %s <br> Style: %s <br> Téléphone: %s <br>  Instrument : %s <br> Age : %s <br> Adresse email : %s <br> Site web perso :  %s <br> Description : %s <br>__________________________________ <br>",$nomm,$villem,$stylem,$telephonem,$instrumentm, $agem, $adressemailm, $sitem, $descriptionm);
	}
	mysqli_stmt_close($stmt);
	$nbrequete = $nbrequete + 1;
	}
}


if ($nbrequete == 0){
	print("Aucun résultat trouvé");
}

$mysqli->close();
?>


</div>
</body>
</html>
