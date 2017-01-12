<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<script>
function searchmusician() {
	document.getElementById("buttonsearchmusician").style.display = "none";
	document.getElementById("buttonsearchgroup").style.display = "none";
	document.getElementById("searchmusician").style.display = "block";
}

function searchgroup() {
	document.getElementById("buttonsearchmusician").style.display = "none";
	document.getElementById("buttonsearchgroup").style.display = "none";
	document.getElementById("searchgroup").style.display = "block";
}
</script>


<title>ProjetPHP</title>
</head>
<body>


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
                <h1>Recherche<h1>
	
        </div>
    </header>

<!-- Bouttons !-->	
<button id="buttonsearchmusician" class="buttonsearchmusician" type="button" onclick="searchmusician()">Je recherche un musicien</button>
<br/>
<br/>
<button id="buttonsearchgroup" class="buttonsearchgroup" type="button" onclick="searchgroup()">Je recherche un groupe</button>

<!-- Requêtes de recherche !-->
<!-- Groupe !-->
<div class="searchgroup" id="searchgroup"

 
		<div id="contenuform">
		<fieldset>
		<legend>Recherche d'un groupe</legend>
		<p>Vous pouvez renseigner ou non les champs suivants pour affiner votre recherche. Laissez les champs vides pour que tout l'annuaire soit affiché.</p>
				<form action="results.php" method="post" target="_blank">
				<p>Nom du groupe:<br>
				<input type="text" name="nomgroupe"></p>
				<p>Ville:<br>
				<input type="text" name="villegroupe"></p>
				<p>Style musical (cochez une seule case):	<br>
				Rock <INPUT type="checkbox" name="rock">
				Blues <INPUT type="checkbox" name="blues"><br>
				Jazz <INPUT type="checkbox" name="jazz">
				Rap <INPUT type="checkbox" name="rap"><br><br>
				<p>Le groupe cherche un musicien pratiquant l'instrument suivant (cochez une seule case):<br>	
				Guitare <INPUT type="checkbox" name="guitare">
				Basse <INPUT type="checkbox" name="basse"><br>
				Batterie <INPUT type="checkbox" name="batterie">
				Chanteur <INPUT type="checkbox" name="chanteur"><br>
				<br>
				<input type="submit" name="submit" value="Lancer la recherche">

				</fieldset>
		</div>
		</div>
		
		
		
<!-- Requêtes de recherche !-->
<!-- Musicien -->


<div class="searchmusician" id="searchmusician"

 
		<div id="contenuform">
		<fieldset>
		<legend>Recherche d'un musicien</legend>
		<p>Vous pouvez renseigner ou non les champs suivants pour affiner votre recherche. Laissez les champs vides pour que tout l'annuaire soit affiché.</p>
				<form action="results.php" method="post" target="_blank">
				<p>Nom du musicien:<br>
				<input type="text" name="nomm"></p>
				<p>Ville:<br>
				<input type="text" name="villem"></p>
				<p>Style musical (cochez une seule case):<br>
				Rock <INPUT type="checkbox" name="rock">
				Blues <INPUT type="checkbox" name="blues"><br>
				Jazz <INPUT type="checkbox" name="jazz">
				Rap <INPUT type="checkbox" name="rap"><br><br>
				<p>Le musicien joue de l'instrument suivant (cochez une seule case) :<br>	
				Guitare <INPUT type="checkbox" name="guitare">
				Basse <INPUT type="checkbox" name="basse"><br>
				Batterie <INPUT type="checkbox" name="batterie">
				Chanteur <INPUT type="checkbox" name="chanteur"><br>
				<br>
				<input type="submit" name="submit" value="Lancer la recherche">

				</fieldset>
		</div>
	</div>

</body>
</html>
