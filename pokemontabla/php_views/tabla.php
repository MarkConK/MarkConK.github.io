<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../style/bootstrap.min.css">
    <title>Tabla</title>
</head>
<body>
    <?php
    include('../php_librarys/bd.php');
    require_once('../php_partials/menu.php'); ?>
    <div class="container mt-5">
        <table class="table table-bordered">
            <thead class="thead bg-secondary">
                <tr>
                    <th scope="col">Imagen</th>
                    <th scope="col">Numero</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Región</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Altura</th>
                    <th scope="col">Peso</th>
                    <th scope="col">Evolución</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td scope="row">
                        <?php //Subir imagen
                            $nombre=$_FILES['imgpokemon']['name'];
                            $guardado=$_FILES['imgpokemon']['tmp_name'];
                            if(!file_exists('../media/pokemons')){
                                mkdir('../media/pokemons',777,true);                               
                            }   
                            if(move_uploaded_file($guardado, '../media/pokemons/'.$nombre)){
                                echo "<img src='../media/pokemons/$nombre' height='70px' width='70px'>";                               
                            }
                            else{
                                echo 'Archivo no se pudo guardar';
                            }                            
						?>
                    </td>
                    <td><?php echo $_POST['txtNumero'] ?></td>
                    <td><?php echo $_POST['txtNombre'] ?></td>
                    <td><?php echo $_POST['cbxRegion']?></td>
                    <td><?php 
                            if (isset($_POST['chxTipo'])) {
                                foreach ($_POST['chxTipo'] as $value) {
                                    echo $value . '<br>';
                                }   
                            }                                               
                        ?>
                    </td>
                    <td><?php echo $_POST['numAltura'] . ' cm' ?></td>
                    <td><?php echo $_POST['numPeso'] . ' Kg' ?></td>
                    <td><?php echo $_POST['rbEvolucion']?>
                    </td>
                    
                </tr>               
            </tbody>
        </table>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</html>