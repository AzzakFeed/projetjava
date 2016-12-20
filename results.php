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
                <h1>Annuaire<h1>
				<p></p>
        </div>
    </header>

<div class="contenu" id="contenuform"

<?php
ini_set('display_errors', 'On');
error_reporting(E_ALL);
$mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
$whereClause = "1=1";
 

if ( isset( $_POST['submit'] ) ) { 

	// Vérifie et sauvegarde si les champs correspondants sont remplis
	if (isset( $_POST['nomgroupe'])){
 $a = $_POST['nomgroupe'];
 $where = 1;
 $whereClause= $whereClause."AND WHERE nomgroupe = '$a'";
}

if (isset( $_POST['villegroupe'])){
 $b = $_POST['villegroupe'];
  $where = 1;
 $whereClause= $whereClause."AND WHERE villegroupe = '$b'";
}

	if($where == 1){
 $sql = "SELECT * FROM Groupe WHERE ".$whereClause;
}
	else {
$sql = "SELECT * FROM Groupe";
}

 $result = $mysqli->query($sql);
 $row_cnt = $result->num_rows;
 if ($row_cnt> 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "Nom: " . $row["nomg"]. " - Ville: " . $row["villeg"]. " " . $row["siteg"]. "<br>";
    }
} else {
    echo "0 results";
}
$mysqli->close();
}

?>

</div>
</body>
</html>

