<?php include "templates/master.php";
      include "../php_controllers/bd.php";
      $userData = getUserDataById($_SESSION["id"]);
      //die(var_dump($userData['id']));
/*if(!$_SESSION['id'])
{
  header('Location:../index.php');
}*/
?>

<!--Colocamos el titulo-->
<?php startblock('titulo'); ?>
Cuenta
<?php endblock() ?>

<!--Insertamos la css-->
<?php startblock('css');?>
<link rel="stylesheet" href="../style/cuenta.css">
<?php endblock() ?>

<!--Main-->
<?php startblock('principal'); ?>
<div class="container-fluid" >
  <div class="row" >
    <!-- MENÚ LATERAL -->
    <div class="col-2 bg-secondary position-absolute" style="height: 100%;">
      <ul class="nav flex-column nav-pills"id="menu">
        <li class="nav-item">
          <li class="nav-item">
            <a class="nav-link" id="navInfo" href="#info">Información</a>
          </li>
          <li class="nav-item"> 
            <a class="nav-link menul" id="navWhishlist" href="#lista-de-deseos">Whislist</a>
          </li>
          <li class="nav-item">
            <a class="nav-link menul" id="navCodigos" href="#codigos-promociones">Códigos de promociones</a>
          </li>
        </li>
      </ul>
    </div>
    <!-- DIV INFORMACION -->
    <div class="col-10 menu" id="informacion">
      <p id="titulo" class="display-4 m-3">Información</p>
      <form action="" method="" id="formInfo">
        <!-- Nombre -->
        <div class="form-group row">
          <label for="inputName" class="col-sm-2 col-form-label">Nombre</label>
          <div class="col-sm-5">
            <input type="text" class="form-control" id="inputName" value="<?php echo $userData['nombre'] ?>">
          </div>
        </div>
        <!-- Apellidos -->
        <div class="form-group row">
          <label for="inputSurname" class="col-sm-2 col-form-label">Apellidos</label>
          <div class="col-sm-5">
            <input type="text" class="form-control" id="inputSurname" value="<?php echo $userData['apellido'] ?>">
          </div>
        </div>
        <!-- EMAIL -->
        <div class="form-group row">
          <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
          <div class="col-sm-5">
            <input type="email" class="form-control" id="exampleFormControlInput1" value="<?php echo $userData['email'] ?>">
          </div>
        </div>
      </form>
    </div>
    <!-- DIV WHISLIST -->
    <div  class="col-10 menu" id="whislist">   
      <p id="titulo" class="display-4 m-3">Lista de deseos</p>
      <div class="row" id="rowPromo">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en Pescados Manoli</h3>
              <p class="card-text">Obtén 10€ de descuento por una compra superior a 50€ en Pescado Manoli</p>
              <p class="card-text">Código: OYJ65T1</p>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en carne</h3>
              <p class="card-text">Desde el 25/01/2021 hasta el 08/02/2021 obtienes 10€ de descuento en tu compra</p>
              <p class="card-text">Código: 7RTGJH2</p>
            </div>
          </div>
        </div>
      </div>
      <div class="row" id="rowPromo">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">5% de descuento en Fruteria Javier</h3>
              <p class="card-text">Obtén 5% de descuento por una compra superior a 15 en Fruteria Javier</p>
              <p class="card-text">Código: OYJ65T1</p>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">5% de descuento en pescado</h3>
              <p class="card-text">No desaproveches esta oportunidad con tu compra superior a 25€</p>
              <p class="card-text">Código: PRT24A1</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- DIV CODIGO PROMOCIONES -->    
    <div class="col-10 menu" id="codePromociones">    
      <p id="titulo" class="display-4 m-3">Códigos de promociones</p>
      <div class="row" id="rowPromo">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en Pescados Manoli</h3>
              <p class="card-text">Obtén 10€ de descuento por una compra superior a 50€ en Pescado Manoli</p>
              <p class="card-text">Código: OYJ65T1</p>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en carne</h3>
              <p class="card-text">Desde el 25/01/2021 hasta el 08/02/2021 obtienes 10€ de descuento en tu compra</p>
              <p class="card-text">Código: 7RTGJH2</p>
            </div>
          </div>
        </div>
      </div>
      <div class="row" id="rowPromo">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en Pescados Manoli</h3>
              <p class="card-text">Obtén 10€ de descuento por una compra superior a 50€ en Pescado Manoli</p>
              <p class="card-text">Código: OYJ65T1</p>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-block">
              <h3 class="card-title">10€ de descuento en carne</h3>
              <p class="card-text">Desde el 25/01/2021 hasta el 08/02/2021 obtienes 10€ de descuento en tu compra</p>
              <p class="card-text">Código: 7RTGJH2</p>
            </div>
          </div>
        </div>
      </div>
    </div>  
  </div>
        
</div>  
<?php endblock()?>

<!--Insertamos js-->
<?php startblock('js');?>
<script type="text/javascript" src="../js/cuenta.js"></script>
<?php endblock() ?>
