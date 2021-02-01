<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../style/bootstrap.min.css">
    <title>Pokedex</title>
</head>
<body>
    <?php require_once('../php_partials/menu.php'); ?>
    <div class="container mt-5">
        <div class="card">
            <div class="card-header text-light bg-secondary">
                <div class="media">
                    <img src="../media/pikachu.png" class="mr-3" width="55" height="55">
                    <label>Pokemon</label>
                </div>                 

            </div>                      
            <div class="card-body">
                <form enctype="multipart/form-data" action="./tabla.php" method="POST">                
                    <div class="form-group row">
                        <label for="txtNumero" class="col-sm-2 col-form-label">Numero</label>
                        <div class="col-sm-10">
                            <input type="text" name="txtNumero" id="txtNumbre" placeholder="Numero del pokemon" maxlength="3" autofocus class="form-control">
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="txtNombre" class="col-sm-2 col-form-label">Nombre</label>
                        <div class="col-sm-10">
                            <input type="text" name="txtNombre" id="txtNombre" placeholder="Nombre del pokemon" required class="form-control">
                        </div>
                    </div>     

                    <div class="form-group row">
                        <label for="cbxRegion" class="col-sm-2 col-form-label">Region</label>
                        <div class="col-sm-10">
                            <select name="cbxRegion" id="cbxRegion" class="custom-select">
                                <option value="Kanto">Kanto</option>
                                <option value="Johto">Johto</option>
                                <option value="Hoenn">Hoenn</option>
                                <option value="Sinnoh">Sinnoh</option>
                                <option value="Teselia">Teselia</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label" for="chxTipo">Tipo</label>
                        <div class="col-sm-10">
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxPlanta" value="Planta">
                                <label class="custom-control-label" for="chxPlanta">Planta</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxVeneno" value="Veneno">
                                <label class="custom-control-label" for="chxVeneno">Veneno</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxFuego" value="Fuego">
                                <label class="custom-control-label" for="chxFuego">Fuego</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxVolador" value="Volador">
                                <label class="custom-control-label" for="chxVolador">Volador</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxAgua" value="Agua">
                                <label class="custom-control-label" for="chxAgua">Agua</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxElectrico" value="Electrico">
                                <label class="custom-control-label" for="chxElectrico">Electrico</label>
                            </div>
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxHada" value="Hada">
                                <label class="custom-control-label" for="chxHada">Hada</label>
                            </div>  
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxBicho" value="Bicho">
                                <label class="custom-control-label" for="chxBicho">Bicho</label>
                            </div>  
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxLucha" value="Lucha">
                                <label class="custom-control-label" for="chxLucha">Lucha</label>
                            </div> 
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="chxTipo[]" class="custom-control-input" id="chxPsiquico" value="Psiquico">
                                <label class="custom-control-label" for="chxPsiquico">Psiquico</label>
                            </div> 
                        </div>

                    </div>
                        
                    <div class="form-group row">
                        <label for="numAltura" class="col-sm-2 col-form-label">Altura</label>
                        <div class="col-sm-10">
                            <div class="input-group mb-3">                            
                                    <input type="text" class="form-control" name="numAltura" id="numAltura" min="1">
                                    <div class="input-group-append">
                                        <span class="input-group-text" id="numAltura">cm</span>
                                    </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="numPeso" class="col-sm-2 col-form-label">Peso</label>
                        <div class="col-sm-10">
                            <div class="input-group mb-3">                            
                                    <input type="text" class="form-control" name="numPeso" id="numPeso" min="0.01" step='0.01'>
                                    <div class="input-group-append">
                                        <span class="input-group-text" id="numPeso">Kg</span>
                                    </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="rbxEvolucion" class="col-sm-2 col-form-label">Evolucion: </label>
                        <div class="col-sm-10">
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" id="rbSinEvolucionar" checked name="rbEvolucion" class="custom-control-input" value="Sin Evolucionar">
                                <label class="custom-control-label" for="rbSinEvolucionar">Sin Evolucionar</label>
                            </div>
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" id="rb1aEvolucion" name="rbEvolucion" class="custom-control-input" value="Primera Evolucion">
                                <label class="custom-control-label" for="rb1aEvolucion">Primera Evolucion</label>
                            </div>
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" id="rb2aEvolucion" name="rbEvolucion" class="custom-control-input" value="Segunda Evolucion">
                                <label class="custom-control-label" for="rb2aEvolucion">Segunda Evolucion</label>
                            </div>  
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="image1"class="col-sm-2 col-form-label">Imagen</label>
                        <div class="col-sm-10">
                            <div class="custom-file">   
                                <input type="hidden" name="MAX_FILE_SIZE" value="30000" />                            
                                <input type="file" class="custom-file-input" id="imgpokemon" name="imgpokemon">
                                <label class="custom-file-label" for="imgpokemon" data-browse="Elegir">Selecionar Archivo</label>
                            </div>
                        </div>
                    </div>  

                    <label style="float: right;"><a href="cancelar.html" class="btn btn-secondary">Cancelar</a></label>
                    <button type="submit" class="btn btn-primary" style="float: right;">Aceptar</button>
                    
               </form>      
            </div> 
        </div>             
    </div>

</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</html>