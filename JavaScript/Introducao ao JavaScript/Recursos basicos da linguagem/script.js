//variaveis
var desconto = 0.2;
const PRECO = 0.2;
var total = PRECO - desconto;

//funções
function soma(a, b) {
    return a + b; // 8
};

soma(3, 5);

//console
console.log('Hello world!');
let evenNums = []
function returnEvenValues(array){
    for(let i = 0; i < array.length; i++){
        if(array[i] % 2 === 0){
            evenNums.push(array[i]);
        } else{
            console.log(`${array[i]} não é par`)
        }
    }
    console.log('Os números pares são: ', evenNums)
}

let array = [1, 2, 4, 5, 7, 8]

returnEvenValues(array)