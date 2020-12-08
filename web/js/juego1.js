document.addEventListener('DOMContentLoaded', () => {

    const productArray =[
        {
            name: 'cloud',
            img: 'media/cloud.png'
        },
        {
            name: 'kairi',
            img: 'media/kairi.png'
        },
        {
            name: 'roxas',
            img: 'media/roxas.png'
        },
        {
            name: 'riku',
            img: 'media/riku.png'
        },
        {
            name: 'sora',
            img: 'media/sora.png'
        },
        {
            name: 'axel',
            img: 'media/axel.png'
        },
        {
            name: 'cloud',
            img: 'media/cloud.png'
        },
        {
            name: 'kairi',
            img: 'media/kairi.png'
        },
        {
            name: 'roxas',
            img: 'media/roxas.png'
        },
        {
            name: 'riku',
            img: 'media/riku.png'
        },
        {
            name: 'sora',
            img: 'media/sora.png'
        },
        {
            name: 'axel',
            img: 'media/axel.png'
        },
        {
            name: 'riku',
            img: 'media/riku.png'
        },
        {
            name: 'sora',
            img: 'media/sora.png'
        },
        {
            name: 'axel',
            img: 'media/axel.png'
        }
    ]

    const grid = document.querySelector('.grid')
    const grid_prodcutos = document.querySelector('.grid-productos')
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
    //createboardClientes
    function createBoardClientes(){
        for(let j = 0; j < 5; j++){
            var cliente = document.createElement('img')
            cliente.setAttribute('data-id', j)
            cliente.setAttribute('src', productArray[j].img)
            cliente.addEventListener('click', clickProductos)
            grid_prodcutos.appendChild(cliente)
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
    createBoardClientes()

})