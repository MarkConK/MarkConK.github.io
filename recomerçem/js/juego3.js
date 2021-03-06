products = ["carne","gamba","cangrejo","pez","pez2","girasol","queso","queso2","queso3"];
aux = 0;
time = -1;
points = 0;
vdialogo = 0;
var drag;
//ocultamos el footer de momento
document.querySelector('footer').hidden = true;
// document.getElementById("divBox").hidden = "true";
document.getElementById("divBox").style.display = "none"
document.getElementById("food").style.height = "370px"
var button = document.createElement("button")
var div = document.createElement("div")
div.classList.add("ml-auto")
button.classList.add("btn")
button.classList.add("btn-primary")
button.classList.add("m-4")
button.innerHTML = "Siguiente"
button.addEventListener("click",dialogo)
document.getElementById('food').appendChild(div);
div.appendChild(button)
document.getElementById('BtnKeep').addEventListener('click', keepPoints, true)
//Cogemos el div con el mensaje del modal
const puntosDisplay             = document.querySelector('#mensaje');
// Recogemos el modal
var modal = document.getElementById("myModal")
// Cogemos el span que tiene la X para cerrar el modal
var span = document.getElementsByClassName("close")[0]
// onclick en el span para cerrarlo
span.onclick = function() {
    modal.style.display = "none"
}

function openBox(){
    aux = 0;
    var box = document.getElementById("box");
    $("#box").fadeOut("slow");
    setTimeout(function(){
    box.src = "../media/food/box_open.svg";
    $("#box").fadeIn("slow");
    
    intervalFoot = setInterval(function(){
        if(aux!=9){
            var randm = random(-1,products.length-1);
            randm = products[randm];
            var img = document.createElement('img');
            img.id = randm;
            img.style.cursor = "move";
            url = "../media/food/"+ randm+".svg";
            img.src = url;
            img.draggable = "true";
            img.classList.add("products");
            document.getElementById('food').appendChild(img);
            foodEvent(img);
            // $("#"+ randm).fadeIn("slow");
            aux++;
        }
        else{clearInterval(intervalFoot)

        }
    },500);
    if(time == -1){timer()}
}, 600);
    
}
function random(min, max) {
    return Math.floor(Math.random() * (max - min)) + min + 1;
}

function checkProduct(product,shop){
    var meat = ["carne"];
    var fish = ["gamba","cangrejo","pez","pez2"];
    var plants = ["girasol"];
    var cheese = ["queso","queso2","queso3"];
    var fruit = ["pepe"];
    var vegetable = ["pepe2"];
    var products;
    var result = true;
    switch(shop){
        case 'meat': products = meat; break;
        case 'fish' : products = fish; break;
        case 'plants': products = plants; break;
        case 'cheese': products = cheese; break;
        case 'fruit': products = fruit; break;
        case 'vegetable': products = vegetable; break;
    }
    if(products.indexOf(product) == -1){
        result = false;
    }
    return result;
}
function foodEvent(img){
    img.addEventListener('dragstart',function(event){
        drag = event.target;
        drag.style.opacity = .5
    });
    img.addEventListener('dragend',function(event){
        drag.style.opacity = ""
    });
}
const market_stop = document.getElementsByClassName('market_stop')

for(var i = 0; i < market_stop.length;i++){
    market_stop[i].addEventListener('dragover',function(event){
            event.preventDefault()
        })
    market_stop[i].addEventListener('drop', function(event){
            var test = document.getElementById("test")
            event.preventDefault()
            if(checkProduct(drag.id,event.target.id)){
                test.innerHTML = "CORRECTO!"
                test.style.color = "green"
                points += 3;
            }
            else{
                test.innerHTML = "INCORRECTO!"
                test.style.color = "red"
            }
            drag.parentNode.removeChild(drag);
        })
}
function timer(){
    time = 50;
    var timer = document.getElementById("timer")
    var intervalTime = setInterval(function(){
        if(time>=0){
            timer.innerHTML = time
            time--; 
            if(time<=10){
                timer.style.color = "red"
            }
        }
        else{clearInterval(intervalTime);
        puntosDisplay.textContent   = "HAS GANADO UN TOTAL DE " + points + " PUNTOS";
        modal.style.display         = "block";}
    checkDivFood()
    },1000)
}

function checkDivFood(){
    var products = document.getElementsByClassName("products")
    var textPoints = document.getElementById("points")
    if(products.length == 0){
        textPoints.innerHTML = points
        openBox()
    }
}
function dialogo(){
    if(vdialogo !=1){
        document.getElementById("food").style.backgroundImage = "url('../media/juego3dialogo2.png')";
        button.innerHTML = "Iniciar juego"
        vdialogo = 1
    }
    else{
        button.hidden = "true"
        document.getElementById("food").style.backgroundImage = "none"
        document.getElementById("food").style.height = null
        document.getElementById("divBox").style.display = "block"
        document.getElementById("divBox").style.backgroundColor ="#5DC7BD";
        div.classList.remove("ml-auto")
    }
}

function keepPoints(){
    const bar           = document.querySelector('.progress-bar')
    var aux = bar.textContent
    bar.textContent     = (points + parseInt(aux)) + "%"

    document.getElementById("progress-bar").style.width = bar.textContent
    points = 0
    modal.style.display = "none"
    var game3           = document.getElementById("juego3")
    var game4           = document.getElementById("juego4")

    game3.style.display = "none"

    game4.style.display = "block"

}