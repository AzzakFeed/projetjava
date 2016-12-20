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
				<p>Recherche</p>
        </div>
    </header>

<!-- Bouttons !-->	
<button id="buttonsearchmusician" class="buttonsearchmusician" type="button" onclick="searchmusician()">Je recherche un musicien</button>
<br/>
<br/>
<br/>
<button id="buttonsearchgroup" class="buttonsearchgroup" type="button" onclick="searchgroup()">Je recherche un groupe</button>

<!-- Requêtes de recherche !-->
<div class="contenu" id="searchgroup"

  <div id="bandeau">
                <h1>Critères de recherche<h1>
		</div>
		<div id="contenuform">
		<fieldset>
		<legend>Recherche d'un groupe</legend>
		<p>Vous pouvez renseigner ou non les champs suivants pour affiner votre recherche. Sinon, tout l'annuaire sera affiché.</p>
				<form action="results.php" method="post" target="_blank">
				<p>Nom du groupe:<br>
				<input type="text" name="nomgroupe"></p>
				<p>Ville:<br>
				<input type="text" name="villegroupe"></p>
				<p>Style musical:<br>
				<p>Recherche un musicien jouant de l'instrument suivant : (guitare, :<br>
				<input type="text" name="instrument"></p>
				<input type="submit" name="submit" value="Lancer la recherche">
				</fieldset>
</div>

</body>
</html>
