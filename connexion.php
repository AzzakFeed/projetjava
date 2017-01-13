<!DOCTYPE html>
<html>
<head>
	
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<script>
function hidelogin() {
	document.getElementById("formulogin").style.display = "none";
	document.getElementById("buttonregister").style.display = "none";
	document.getElementById("smallbox").style.display = "none";
	document.getElementById("formuregister").style.display = "block";
	document.getElementById("buttonlogin").style.display = "block";
}

function showlogin() {
	document.getElementById("formuregister").style.display = "none";
	document.getElementById("buttonregister").style.display = "block";
	document.getElementById("formulogin").style.display = "block";
	document.getElementById("buttonlogin").style.display = "none";
	document.getElementById("smallbox").style.display = "block";
}


</script>





<title>Cherchegroupe.com</title>
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
    <li><a href="connexion.php">Connexion</a></li>
</ul>

<!-- Titre !-->
    <header>
         <div id="formulaire">
               <h1>Cherchegroupe.com<h1>
				<p>Connexion</p>
        </div>
    </header>

<!-- Bouttons !-->	


<button id="buttonregister" class="buttonregister" type="button" onclick="hidelogin()">S'enregistrer</button>

<button id="buttonlogin" class="buttonlogin" type="button" onclick="showlogin()">Se connecter</button>

<br>
<br>


<div id="smallbox">
	
	<?php

session_start();


$mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");

 
 $error = false;
 
 //Connexion
 
 $name_user_login = "";
 $password_user_login ="";
 
  if ( isset($_POST['name_user_login']) && isset($_POST['password_user_login'])) {
	$name_user_login = $_POST['name_user_login'];
	$password_user_login = $_POST['password_user_login'];
	
	
	
	$sql = "SELECT name_user FROM Utilisateur WHERE name_user='$name_user_login'";
	
	if ($result=mysqli_query($mysqli,$sql)){
		$rowcount=mysqli_num_rows($result);
		if($rowcount >0){
			header('Location: http://pubhtml/~E102952E/projetphp/pageaccueil.php');
		}
		else{
			echo("Identifiant ou mot de passe incorrect.");
		}
	}
}
	
 // Enregistrement
 if ( isset($_POST['name_user']) &&  isset($_POST['email_user']) && isset($_POST['password_user'])) {
  $name_user = $_POST['name_user'];
  $email_user = $_POST['email_user'];
  $password_user = $_POST['password_user'];
  
  
  
  // Nettoyage des données insérées par l'utilisateur afin d'éviter des injections SQL
  $name_user = trim($_POST['name_user']); 
  $name_user = strip_tags($name_user); 
  $name_user = htmlspecialchars($name_user);
  
  $email_user = trim($_POST['email_user']);
  $email_user = strip_tags($email_user);
  $email_user = htmlspecialchars($email_user);
  
  $password_user = trim($_POST['password_user']);
  $password_user = strip_tags($password_user);
  $password_user = htmlspecialchars($password_user);
  
	    $sql = "INSERT INTO Utilisateur (name_user, password_user, email_user) 
   VALUES ('$name_user','$password_user','$email_user')";
   
	$mysqli->query($sql);
}

$mysqli->close();
?>
	
	</div>




<ul class="formulogin" id="formulogin">
	<fieldset>
    <legend>Se connecter</legend>
 <form method="post">
  Nom d'utilisateur:<br>
  <input type="text" name="name_user_login"><br>
  <br/>
  Mot de passe:<br>
  <input type="password" name="password_user_login"><br>
  <br/>
  <input type="submit" value="Valider !">
	</form> 
	</ul>
	</fieldset>
	
	
	
	
	
	
	<ul class="formuregister" id="formuregister">
		<fieldset>
    <legend>S'enregistrer</legend>
 <form method="post">
  Nom d'utilisateur:<br>
  <input type="text" name="name_user"><br>
  <br/>
  Mot de passe:<br>
  <input type="password" name="password_user"><br>
  <br/>
    Adresse email:<br>
  <input type="email" name="email_user"><br>
  <br/>
  <input type="submit" value="Valider !">
	</form> 
</ul>

	<br/>
	
	
	
	
</body>
</html>
