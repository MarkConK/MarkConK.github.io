<?php
//abrir bd
function openBd(){
    $servername = "localhost";
    $username = "root";
    $password = "";
    try {
        $conexion = new PDO("mysql:host=$servername;dbname=pokedex", $username, $password);
        // set the PDO error mode to exception
        $conexion->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $conexion->exec("set names utf8");
    } catch (PDOException $e) {
        echo "Connection failed: " . $e->getMessage();
    }
}

function closeBd(){
    return null;
}

function selectAPokemons(){
    $conexion = openBd();

    $sentencia = "SELECT * FROM pokemons";
    $sentencia = $conexion->prepare($sentencia);
    $sentencia->execute();

    $resultado = $sentencia->fetchAll();

    $conexion = closeBd();

    return $resultado;
}

function selectTipoPokemon(){
    $conexion = openBd();

    $sentencia = "SELECT * FROM tipos";
    $sentencia = $conexion->prepare($sentencia);
    $sentencia->execute();

    $resultado = $sentencia->fetchAll();

    $conexion = closeBd();

    return $resultado;
}

function selectRegiones(){
    $conexion = openBd();

    $sentencia = "SELECT * FROM regiones";
    $sentencia = $conexion->prepare($sentencia);
    $sentencia->execute();

    $resultado = $sentencia->fetchAll();

    $conexion = closeBd();

    return $resultado;
}

function selectPokemonId($id){
    $conexion = openBd();

    $sentencia = "SELECT * FROM pokemons WHERE id = $id";
    $sentencia = $conexion->prepare($sentencia);
    $sentencia->execute();

    $resultado = $sentencia->fetchAll();

    $conexion = closeBd();

    return $resultado;
}

function selectTiposPokemon($id){
    $conexion = openBd();

    $sentencia = "SELECT * FROM tipos_has_pokemon WHERE id_pokemon = $id";
    $sentencia = $conexion->prepare($sentencia);
    $sentencia->execute();

    $resultado = $sentencia->fetchAll();

    $conexion = closeBd();

    return $resultado;
}

function insertPokemon($numero, $nombre, $altura, $peso, $evolucion, $imagen, $regiones_id){
    $conn = connect();
    $stmt = $conn -> prepare("INSERT INTO pokemons (numero, nombre, altura, peso, evolucion, imagen, regiones_id) VALUES (:numero, :nombre, :altura, :peso, :evolucion, :imagen, :regiones_id)");
    $stmt->bindParam(':numero',$numero);
    $stmt->bindParam(':nombre',$nombre);
    $stmt->bindParam(':altura',$altura);
    $stmt->bindValue(':peso',$peso);
    $stmt->bindValue(':evolucion',$evolucion);
    $stmt->bindParam(':imagen',$imagen);
    $stmt->bindParam(':regiones_id',$regiones_id);

    $stmt -> execute();
    $conn = disconnect();
}

function borrarPokemon(){

}

/*

--Inserir un pokemon--
Donades totes les dades pokemon, número, nom, alçada, pes, 
evolució, imatge, regió i tipus s’ha d’inserir el pokemon i també la relació del pokemon i els tipus.
S’han de fer tots els inserts o cap.

--Esborrar pokemon--
Donada la id d’un pokemon, s’ha d’esborrar de la base de dades.
*/


















?>