document.addEventListener('DOMContentLoaded', () => {

    //declaramos el boton start para iniciar el juego
    document.getElementById('BtnStart').addEventListener('click', startGame, true)

    //ocultamos el footer de momento
    document.querySelector('footer').hidden = true

    //Declaramos nuestros arrays con los productos y clientes
    const productArray          = [
        {
            name: 'arandano',
            tipo: 'producto',
            img: '../media/fruta-juego4/arandano.png',
            precio:'2'
        },
        {
            name: 'cereza',
            tipo: 'producto',
            img: '../media/fruta-juego4/cereza.png',
            precio:'4'
        },
        {
            name: 'coco',
            tipo: 'producto',
            img: '../media/fruta-juego4/coco.png',
            precio:'5'
        },
        {
            name: 'fresa',
            tipo: 'producto',
            img: '../media/fruta-juego4/fresa.png',
            precio:'3'
        },
        {
            name: 'mango',
            tipo: 'producto',
            img: '../media/fruta-juego4/mango.png',
            precio:'2'
        },
        {
            name: 'naranja',
            tipo: 'producto',
            img: '../media/fruta-juego4/naranja.png',
            precio:'4'
        },
        {
            name: 'manzana',
            tipo: 'producto',
            img: '../media/fruta-juego4/manzana.png',
            precio:'3'
        },
        {
            name: 'pera',
            tipo: 'producto',
            img: '../media/fruta-juego4/pera.png',
            precio:'3'
        },
        {
            name: 'pina',
            tipo: 'producto',
            img: '../media/fruta-juego4/pina.png',
            precio:'4'
        },
        {
            name: 'platanos',
            tipo: 'producto',
            img: '../media/fruta-juego4/platanos.png',
            precio:'2'
        },
        {
            name: 'sandia',
            tipo: 'producto',
            img: '../media/fruta-juego4/sandia.png',
            precio:'6'
        },
        {
            name: 'uvas',
            tipo: 'producto',
            img: '../media/fruta-juego4/uvas.png',
            precio:'8'
        }
    ];
    const clienteArray          = [
        {
            name: 'person1',
            img: '../media/personas-juego4/person.png'
        },
        {
            name: 'person2',
            img: '../media/personas-juego4/person2.png'
        },
        {
            name: 'person3',
            img: '../media/personas-juego4/person3.png'
        },
        {
            name: 'person4',
            img: '../media/personas-juego4/person4.png'
        },
        {
            name:'person5',
            img:'../media/personas-juego4/person5.png'
        }
    ];
    const productClienteArray   = [
        {
            name: 'arandano',
            img: '../media/fruta-juego4/fruta-cliente/arandano-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/arandano-success.png',
            img_e: '../media/fruta-juego4/fruta-error/arandano-error.png',
            img_click: '../media/fruta-juego4/fruta-select/arandano-select.png'
        },
        {
            name: 'cereza',
            img: '../media/fruta-juego4/fruta-cliente/cereza-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/cereza-success.png',
            img_e: '../media/fruta-juego4/fruta-error/cereza-error.png',
            img_click: '../media/fruta-juego4/fruta-select/cereza-select.png'
        },
        {
            name: 'coco',
            img: '../media/fruta-juego4/fruta-cliente/coco-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/coco-success.png',
            img_e: '../media/fruta-juego4/fruta-error/coco-error.png',
            img_click: '../media/fruta-juego4/fruta-select/coco-select.png'
        },
        {
            name: 'fresa',
            img: '../media/fruta-juego4/fruta-cliente/fresa-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/fresa-success.png',
            img_e: '../media/fruta-juego4/fruta-error/fresa-error.png',
            img_click: '../media/fruta-juego4/fruta-select/fresa-select.png'
        },
        {
            name: 'mango',
            img: '../media/fruta-juego4/fruta-cliente/mango-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/mango-success.png',
            img_e: '../media/fruta-juego4/fruta-error/mango-error.png',
            img_click: '../media/fruta-juego4/fruta-select/mango-select.png'
        },
        {
            name: 'naranja',
            img: '../media/fruta-juego4/fruta-cliente/naranja-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/naranja-success.png',
            img_e: '../media/fruta-juego4/fruta-error/naranja-error.png',
            img_click: '../media/fruta-juego4/fruta-select/naranja-select.png'
        },
        {
            name: 'manzana',
            img: '../media/fruta-juego4/fruta-cliente/manzana-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/manzana-success.png',
            img_e: '../media/fruta-juego4/fruta-error/manzana-error.png',
            img_click: '../media/fruta-juego4/fruta-select/manzana-select.png'
        },
        {
            name: 'pera',
            img: '../media/fruta-juego4/fruta-cliente/pera-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/pera-success.png',
            img_e: '../media/fruta-juego4/fruta-error/pera-error.png',
            img_click: '../media/fruta-juego4/fruta-select/pera-select.png'
        },
        {
            name: 'pina',
            img: '../media/fruta-juego4/fruta-cliente/pina-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/pina-success.png',
            img_e: '../media/fruta-juego4/fruta-error/pina-error.png',
            img_click: '../media/fruta-juego4/fruta-select/pina-select.png'
        },
        {
            name: 'platanos',
            img: '../media/fruta-juego4/fruta-cliente/platanos-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/platanos-success.png',
            img_e: '../media/fruta-juego4/fruta-error/platanos-error.png',
            img_click: '../media/fruta-juego4/fruta-select/platanos-select.png'
        },
        {
            name: 'sandia',
            img: '../media/fruta-juego4/fruta-cliente/sandia-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/sandia-success.png',
            img_e: '../media/fruta-juego4/fruta-error/sandia-error.png',
            img_click: '../media/fruta-juego4/fruta-select/sandia-select.png'
        },
        {
            name: 'uvas',
            img: '../media/fruta-juego4/fruta-cliente/uvas-cliente.png',
            img_s: '../media/fruta-juego4/fruta-success/uvas-success.png',
            img_e: '../media/fruta-juego4/fruta-error/uvas-error.png',
            img_click: '../media/fruta-juego4/fruta-select/uvas-select.png'
        }
    ];

    //hacemos un random del array de clientes para que no salgan en el mismo orden
    productClienteArray.sort(()     => 0.5 - Math.random())

    //seleccionamos nuestros elementos del html para trabajar con ellos
    const grid                      = document.querySelector('.grid')
    const grid_productos            = document.querySelector('.grid-productos')
    const grid_clientes             = document.querySelector('.grid-clientes')
    const timeLeft                  = document.querySelector('#time-left')
    const resultDisplay             = document.querySelector('#result')
    const sumaDisplay               = document.querySelector('#suma')
    const background                = document.querySelector('#juego4')
    const puntosDisplay             = document.querySelector('#mensaje')

    //ponemos en hidden los marcadores mientras dure el menu
    document.querySelector('h4').hidden         = true
    document.getElementById('seconds').hidden   = true
    document.getElementById('time-left').hidden = true
    //ponemos el fondo de menu
    background.style.backgroundImage="url(../media/background-juego4/menu.png)"
    
    function startGame(){
        document.getElementById('BtnKeep').addEventListener('click', keepPoints, true)
        //declaramos las variables con las que vamos a trabajar
        let currentTime                 = timeLeft.textContent
        var productChosen               = []
        var productDemandaId            = []
        var productIdVenta              = []
        var ganancia                    = 0
        var contador                    = 1
        var id_cliente                  = 0
        var id_producto                 = 0
        var productClass                = null

        //comprobamos que el boton esté para borrarlo o no borramos el boton al inicar el juego
        if(document.getElementById('BtnStart') != null){
            document.getElementById('BtnStart').remove();
        }

        background.style.backgroundImage=" url(../media/background-juego4/imagen-juego.png)";
        //volvemos a mostrar los marcadores ahora que el juego se ha iniciado
        document.querySelector('h4').hidden         = false
        document.getElementById('seconds').hidden   = false
        document.getElementById('time-left').hidden = false

        /// Recogemos el modal
        var modal = document.getElementById("myModal")
        // Cogemos el span que tiene la X para cerrar el modal
        var span = document.getElementsByClassName("close")[0]
        // onclick en el span para cerrarlo
        span.onclick = function() {
            modal.style.display = "none"
        }
        //creamos la grid con los productos
        function createBoardProductos(){
            for(let i = 0; i < productArray.length; i++){
                var product = document.createElement('img')
                product.setAttribute('id', i)
                product.setAttribute('src', productArray[i].img)
                product.setAttribute('tpo', productArray[i].tipo)
                product.addEventListener('click', clickProductos)
                grid.appendChild(product)
            }
        }
        //CREATE CLIENTE
        function timerClientes(){
            //si hay 5 elementos en la grid, esperamos otros 5 segundos para lanzar otro cliente
            if (grid_clientes.childElementCount == 5) {
                contador = 0
            }
            //añadimos un cliente cada X segundos
            if (contador == 1) {
                //si hay 5 clientes en la tabla paramos
                if (id_cliente == 5) {
                    id_cliente = 0
                }
                //si hemos llegado a 12 significa que ya hemos administrado todos los productos disponibles
                if(id_producto  == 12){
                    id_producto = 0
                }
                //creamos nuestro cliente 
                var cliente         = document.createElement('img')
                cliente.setAttribute('id', id_producto)
                cliente.setAttribute('class', 'cliente' + id_producto)
                cliente.setAttribute('src', clienteArray[id_cliente].img)
                grid_clientes.appendChild(cliente)

                //creamos el producto cliente junto al cliente
                var producto_cliente = document.createElement('img')
                producto_cliente.setAttribute('id'   , id_producto)
                producto_cliente.setAttribute('class', 'producto-cliente' + id_producto)
                producto_cliente.setAttribute('src'  , productClienteArray[id_producto].img)
                producto_cliente.setAttribute('tipo' , 'demanda')
                producto_cliente.addEventListener('click', clickProductos)
                grid_productos.appendChild(producto_cliente)

                //incrementamos el contador de cliente
                id_cliente++
                //incrementamos el contador de productoCliente
                id_producto++
                //reseteamos el contador
                contador = 1
            }
            else{
                //incrementamos nuestro contador de tiempo
                contador++
            }
        }
        let timerClient = setInterval(timerClientes, 1000)

        //Cronometro para anunciar el final del juego
        function cuentaAtras(){
            currentTime--
            timeLeft.textContent = currentTime
            if (currentTime === 0) {
                clearInterval(timer)
                clearInterval(timerClient)
                //alert("GAME OVER")
                puntosDisplay.textContent   = "HAS GANADO UN TOTAL DE " + ganancia + " PUNTOS"
                document.getElementById('BtnNext').remove()
                document.getElementById('puntos').value = ganancia
                
                modal.style.display         = "block"
            };
        }
        let timer = setInterval(cuentaAtras, 1000)

        //comprobamos si los productos son los correctos y hacen match
        function checkForMatch(){
            //guardamos el producto del cliente en productoChosen
            var productoChosen = document.querySelector(productClass)

            //usamos el id del producto para guardar la clase del cliente
            clientClass = '.cliente' + productDemandaId[0]
            var clientChosen   = document.querySelector(clientClass)

            //guardamos los nombres de los productos por separados para poder compararlos
            const optionOneId = productChosen[0]
            const optionTwoId = productChosen[1]

            if(optionOneId === optionTwoId){
                //si hemos hecho match sumamos el precio del producto a nuestra ganancia
                ganancia    = ganancia + parseFloat(productArray[productIdVenta[0]].precio)
                resultDisplay.textContent   = ganancia + ' $ '
                //mostramos el precio que ganamos con este match y luego lo ponemos en hidden hasta el siguiente
                sumaDisplay.textContent     = ' +' + parseFloat(productArray[productIdVenta[0]].precio) + '$'
                document.getElementById("suma").style.visibility="visible"
                setTimeout(function(){document.getElementById("suma").style.visibility="hidden"}, 2000)
                //como el match ha sido correcto, cambiamos la imagen a img_success
                productoChosen.setAttribute('src', productClienteArray[productDemandaId[0]].img_s)

                setTimeout(function(){ productoChosen.remove(); clientChosen.remove();}, 1500)
            } else{ 
                //si no hace match no sumamos nada, mostramos que suma 0$
                sumaDisplay.textContent = ' + 0$'
                document.getElementById("suma").style.visibility="visible"
                setTimeout(function(){document.getElementById("suma").style.visibility="hidden"}, 2000)
                //como el match NO ha sido correcto, cambiamos la imagen a img_error
                productoChosen.setAttribute('src', productClienteArray[productDemandaId[0]].img_e)
                setTimeout(function(){ productoChosen.remove(); clientChosen.remove();}, 1500)

            }      
            //vaciamos los array para el siguiente producto
            productChosen   = []
            productDemandaId = []
            productIdVenta    = []
        }

        //cuando hacemos click en un producto
        function clickProductos(){
            //guardamos el id del producto
            var productId   = this.getAttribute('id')
            //aqui guardamos su tipo
            var productType = this.getAttribute('tipo')
           
            //si es una demanda (pedido por el cliente) guardamos su nombre en el array productChosen
            //y su id en productDemandaId
            if (productType === 'demanda'){       
                this.setAttribute('src', productClienteArray[productId].img_click)
                productChosen.push(productClienteArray[productId].name)
                //guardamos sus id para poder trabajar con ella mas tarde
                productDemandaId.push(productId)
                //guardamos la clase del producto
                productClass = '.' + this.getAttribute('class')
            }

            //si no es demanda es que es tipo producto y guardamos su nombre en el array productChosen
            else{
                productChosen.push(productArray[productId].name)      
                productIdVenta.push(productId)
            }

            //cuando hay dos elementos los comprobamos
            if(productChosen.length === 2){
                setTimeout(checkForMatch, 100)
            }
        }

        createBoardProductos()
               
        function keepPoints(){
            const bar           = document.querySelector('.progress-bar')
            var aux = bar.textContent
            console.log(aux)
            bar.textContent     = (ganancia + parseInt(aux)) + "%"
            console.log(bar.textContent)
            document.getElementById("progress-bar").style.width = bar.textContent
            ganancia = 0
            modal.style.display = "none"
        }
    }  
})