<?php

 $mysqli = new mysqli("mysql", "E102952E","WKXM9C9F", "E102952E");
 
if ( isset($_POST['nom']) && isset($_POST['prenom'])  && isset($_POST['age'])  && isset($_POST['villemusicien'])) {
 $a = $_POST['nom'];
 $b = $_POST['prenom'];
 $c = $_POST['age'];
 $d = $_POST['villemusicien'];

 $sql = "INSERT INTO Musicien (nomm, prenomm, agem, villem) 
 VALUES ('$a', '$b', '$c', '$d')";
 echo "<pre>\n$sql\n</pre>\n";


 
 if ($mysqli->query("INSERT INTO Musicien (nomm, prenomm, agem, villem) 
 VALUES ('$a', '$b', '$c', '$d')") === TRUE) {
	printf("Profil rempli avec succès.\n");
 $mysqli->query($sql);
}
 $mysqli->query($sql);
}
?>
