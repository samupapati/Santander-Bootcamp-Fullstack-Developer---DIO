var currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;

function increment(){
    currentNumber++
    currentNumberWrapper.innerHTML = currentNumber;
    if(currentNumber >= 0){
        currentNumberWrapper.style.color = 'greenyellow'
    }
    if(currentNumber >= 5){
        this.disabled = true
    }
}

function decrement(){
    currentNumber--
    currentNumberWrapper.innerHTML = currentNumber;
    if(currentNumber < 0){
        currentNumberWrapper.style.color = 'red'
    }
}

//desafio
var subtrair = document.getElementById('subtrair');
var adicionar = document.getElementById('adicionar');

subtrair.addEventListener('click', decrement)
adicionar.addEventListener('click', increment)


if(currentNumber >= 0){
    currentNumberWrapper.style.color = 'greenyellow'
}



