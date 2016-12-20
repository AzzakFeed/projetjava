<!DOCTYPE html>
<html>
<head>
	
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<script>
function hidelogin() {
	document.getElementById("formulogin").style.display = "none";
	document.getElementById("buttonregister").style.display = "none";
	document.getElementById("formuregister").style.display = "block";
	document.getElementById("buttonlogin").style.display = "block";
}

function showlogin() {
	document.getElementById("formuregister").style.display = "none";
	document.getElementById("buttonregister").style.display = "block";
	document.getElementById("formulogin").style.display = "block";
	document.getElementById("buttonlogin").style.display = "none";
}


</script>

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
	}
}
	
	/*
	$query->query($sql);
	if(mysqli_num_rows($query) > 0){
			$sql = "SELECT password_user FROM Utilisateur";
			$query->query($sql);
			if(mysqli_num_rows($query) > 0){
					header('Location: http://pubhtml/~E102952E/projetphp/pageaccueil.php');
		}
	}
	}
		*/
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
  
  // basic name_user validation
  /*
  if (empty($name_user)) {
   $error = true;
   $name_userError = "Veuillez entrer votre nom d'utilisateur.";
  } else if (strlen($name_user) < 3) {
   $error = true;
   $name_userError = "Votre nom d'utilisateur doit comporter au moins 3 caractères.";
  } else if (strlen($name_user) > 15) {
   $error = true;
   $name_userError = "Votre nom d'utilisateur ne doit pas comporter plus de 15 caractères.";
}
  
  /*basic email_user validation
  if ( !filter_var($email_user,FILTER_VALIDATE_email_user) ) {
   $error = true;
   $email_userError = "Veuillez entrer une adresse email valide";
  } else {
   check email_user exist or not 
   $query = "SELECT email_user FROM Utilisateur WHERE user_email='$user_email'";
   $result = query($query);
   $count = mysql_num_rows($result);
   if($count!=0){
    $error = true;
    $email_userError = "L'adresse email est déjà utilisée.";
   }
  }
  
  // password_userword validation
  if (empty($password_user)){
   $error = true;
   $password_userError = "Veuillez entrer un mot de passe.";
  } else if(strlen($password_user) < 6) {
   $error = true;
   $password_userError = "Un mot de passe doit comporter au moins 6 caractères.";
    } else if(strlen($password_user) > 15) {
   $error = true;
   $password_userError = "Un mot de passe ne doit pas comporter plus de 15 caractères.";
  }
  
  // password_userword encrypt using SHA256();
  $password_userword = hash('sha256', $password_user);
  
  // if there's no error, continue to signup
  if( !$error ) {
	 */
	    $sql = "INSERT INTO Utilisateur (name_user, password_user, email_user) 
   VALUES ('$name_user','$password_user','$email_user')";
   
	$mysqli->query($sql);
}
?>



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
  <!-- pas de bouton déconnexion pour la page de connexion-->
</ul>

<!-- Titre !-->
    <header>
        <div class="header">
                <h1>Projet PHP<h1>
				<p></p>
        </div>
    </header>

<!-- Bouttons !-->	


<button id="buttonregister" class="buttonregister" type="button" onclick="hidelogin()">S'enregistrer</button>

<button id="buttonlogin" class="buttonlogin" type="button" onclick="showlogin()">Se connecter</button>


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
