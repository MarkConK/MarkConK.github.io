//set time
var currentTime = 10;

// Get the modal
var modal = document.getElementById("myModal");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];


// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
/*window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}*/

cuentaAtras();


//Cronometro para anunciar el final del juego
function cuentaAtras(){
    currentTime--;
    console.log(currentTime)
    if (currentTime === 0) {
        clearInterval(timer);
        modal.style.display = "block";
        //alert('GAME OVER');
    };
}
let timer = setInterval(cuentaAtras, 1000);