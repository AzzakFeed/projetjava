<?php
session_start();
?>

<?php
 $mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
 
if ( isset($_POST['nom']) && isset($_POST['prenom'])  && isset($_POST['age'])
  && isset($_POST['villemusicien'])  && isset($_POST['numtelm'])  && isset($_POST['mailm'])
    && isset($_POST['sitem'])   && isset($_POST['descriptionmusicien'])
      && (isset($_POST['guitare']) || isset($_POST['basse']) || isset($_POST['batterie'])|| isset($_POST['chanteur']) )
		&& (isset($_POST['rock']) || isset($_POST['blues']) || isset($_POST['jazz'])|| isset($_POST['rap']) )) {
 $a = $_POST['nom'];
 $b = $_POST['prenom'];
 $c = $_POST['age'];
 $d = $_POST['villemusicien'];
 $e = $_POST['numtelm'];
 $f = $_POST['mailm'];
 $g = $_POST['sitem'];
 $description = $_POST['descriptionmusicien'];
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
	 
 $sql = "INSERT INTO Musicien (nomm, prenomm, agem, villem, telephonem, adressemailm, sitem, descriptionm, instrumentm,stylem) 
 VALUES ('$a', '$b', '$c', '$d', '$e', '$f', '$g','$description', '$instru', '$stylem')";
 $mysqli->query($sql);
 
 header('Location: http://pubhtml/~E092321Z/Projet_PHP/succesformulaire.php');
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
				<p>De quel instrument jouez-vous? <br>
					Guitare <INPUT type="checkbox" name="guitare">
					Basse <INPUT type="checkbox" name="basse"><br>
					Batterie <INPUT type="checkbox" name="batterie">
					Chanteur <INPUT type="checkbox" name="chanteur"><br>
				</p>
				<p>Style musical:<br>
					Rock <INPUT type="checkbox" name="rock">
					Blues <INPUT type="checkbox" name="blues"><br>
					Jazz <INPUT type="checkbox" name="jazz">
					Rap <INPUT type="checkbox" name="rap"><br>
				<p></p>
				<p>Decrivez vous:<br><TEXTAREA name="descriptionmusicien" rows="8" cols="20">
				<!--Présentez vous, votre histoire, vos objectifs, etc... !-->
				</TEXTAREA></p>
				<p><input type="submit" value="Ajouter"/></p>
				<p></p> <input type="reset" value="Annuler" /></p>
				</form>
		</div>
    </header>

</body>
</html>
