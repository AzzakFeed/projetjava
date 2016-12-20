<?php
session_start();
?>

<?php
header('Location: http://pubhtml/~E102952E/projetphp/pageaccueil.php');
?>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<title>Succès remplissage formulaire</title>
</head>
<body>



<!-- Titre !-->
    <header>
        <div id="bandeau">
                <h1>Formulaire rempli avec succès !!<h1>
		</div>
		<div id="contenu">
			<form method="post">
				<p><input type="submit" value="Retour à la page d'acceuil"/></p>
			</form>
		</div>
    </header>

</body>
</html>
