document.addEventListener('DOMContentLoaded', () => {

    const productArray =[
        {
            name: 'arandano',
            img: 'media/fruta/arandano.png'
        },
        {
            name: 'cereza',
            img: 'media/fruta/cereza.png'
        },
        {
            name: 'coco',
            img: 'media/fruta/coco.png'
        },
        {
            name: 'fresa',
            img: 'media/fruta/fresa.png'
        },
        {
            name: 'mango',
            img: 'media/fruta/mango.png'
        },
        {
            name: 'naranja',
            img: 'media/fruta/naranja.png'
        },
        {
            name: 'manzana',
            img: 'media/fruta/manzana.png'
        },
        {
            name: 'pera',
            img: 'media/fruta/pera.png'
        },
        {
            name: 'pina',
            img: 'media/fruta/pina.png'
        },
        {
            name: 'platanos',
            img: 'media/fruta/platanos.png'
        },
        {
            name: 'sandia',
            img: 'media/fruta/sandia.png'
        },
        {
            name: 'uvas',
            img: 'media/fruta/uvas.png'
        }
    ]
    const clienteArray = [
        {
            name: 'person1',
            img: 'media/personas/person1.png'
        },
        {
            name: 'person2',
            img: 'media/personas/person2.png'
        },
        {
            name: 'person3',
            img: 'media/personas/person3.png'
        },
        {
            name: 'person4',
            img: 'media/personas/person4.png'
        }
    ]

    const grid = document.querySelector('.grid')
    const grid_prodcutos = document.querySelector('.grid-productos')
    const grid_clientes = document.querySelector('.grid-clientes')

    var productChosen =   [];
    var productChosenId = [];
    var productScore =      [];
    const resultDisplay = document.querySelector('#result');

    //createboardProductos
    function createBoardProductos(){
        for(let i = 0; i < productArray.length; i++){
            var product = document.createElement('img')
            product.setAttribute('data-id', i)
            product.setAttribute('src', productArray[i].img)
            product.addEventListener('click', clickProductos)
            grid.appendChild(product)
        }
    }
    //createboardProductoCliente
    function createBoardProductoCliente(){
        for(let j = 0; j < 4; j++){
            var producto_cliente = document.createElement('img')
            producto_cliente.setAttribute('data-id', j)
            producto_cliente.setAttribute('src', productArray[j].img)
            producto_cliente.addEventListener('click', clickProductos)
            grid_prodcutos.appendChild(producto_cliente)
        }
    }
    //createboardClientes
    function createBoardClientes(){
        for(let k = 0; k < clienteArray.length; k++){
            var cliente = document.createElement('img')
            cliente.setAttribute('data-id', k)
            cliente.setAttribute('src', clienteArray[k].img)
            grid_clientes.appendChild(cliente)
        }
    }
   

    //check matches
    function checkForMatch(){
        const optionOneId = productChosenId[0]
        const optionTwoId = productChosenId[1]
        if(productChosen[0] === productChosen[1]){
            alert('You found a match');
            productScore.push(productChosen);
        } else{
            alert('Try again')
        }        
        productChosen = []
        productChosenId = []
        resultDisplay.textContent = productScore.length;
    }
    //click productos
    function clickProductos(){
        var productId = this.getAttribute('data-id')
        productChosen.push(productArray[productId].name)
        productChosenId.push(productId)
        if(productChosen.length === 2){
            setTimeout(checkForMatch, 100)
        }
    }
    createBoardProductos()
    createBoardProductoCliente()
    createBoardClientes()

})