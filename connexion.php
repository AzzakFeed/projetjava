<!DOCTYPE html>
<html>
<head>
	
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<script>
function hidelogin() {
	document.getElementById("formulogin").style.display = "none";
	document.getElementById("buttonregister").style.display = "none";
}

function showregister() {
	document.getElementById("formuregister").style.display = "block";
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
  <!-- pas de bouton déconnexion-->
</ul>

<!-- Titre !-->
    <header>
        <div class="header">
                <h1>Projet PHP<h1>
				<p></p>
        </div>
    </header>

<!-- Bouttons !-->	


<button id="buttonregister" class="buttonregister" type="button" onclick="hidelogin(); onclick=showregister()">S'enregistrer</button>

<ul class="formulogin" id="formulogin">
	<fieldset>
    <legend>Se connecter</legend>
 <form action="login.php">
  Nom d'utilisateur:<br>
  <input type="text" name="user"><br>
  <br/>
  Mot de passe:<br>
  <input type="password" name="mdp"><br>
  <br/>
  <input type="submit" value="OK !">
	</form> 
	</ul>
	</fieldset>
	
	<ul class="formuregister" id="formuregister">
		<fieldset>
    <legend>S'enregistrer</legend>
 <form action="register.php">
  Nom d'utilisateur:<br>
  <input type="text" name="user"><br>
  <br/>
  Mot de passe:<br>
  <input type="password" name="mdp"><br>
  <br/>
    Adresse email:<br>
  <input type="email" name="email"><br>
  <br/>
  <input type="submit" value="OK !">
	</form> 
</ul>

	<br/>
	
</body>
</html>
