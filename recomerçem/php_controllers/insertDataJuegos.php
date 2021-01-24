<?php
include "bd.php";

insertDataGame($_POST['puntos']);
header("Location: http://localhost/Mercat-Concepcio/php_views/juegos.php");

?>