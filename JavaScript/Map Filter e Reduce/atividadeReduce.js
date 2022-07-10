//Some todos os números de um array
function somaNumeros(arr){
    return arr.reduce(function(prev, current) {
        console.log({prev})
        console.log({current})
        return prev + current;
    })
}

const arr = [1, 2]

console.log('exercicio 1:')
console.log(somaNumeros(arr))
//===============================================

/*
Crie uma função que recebe uma lista de preços e um número representando
o saldo disponível. Calcule qual será o saldo final após subtrair todos os 
preços da lista enviada.
 */

const lista = [
    {
        nome: 'Sabão em pó',
        preco: 30,
    },
    {
        nome: 'cereal',
        preco: 12,
    },
    {
        nome: 'toalha',
        preco: 30,
    },
];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function (prev, current, index){
        console.log("rodada ", index + 1);
        console.log({prev})
        console.log('current: ', current.preco)
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log('\n')
console.log('exercicio 2')
console.log(calculaSaldo(saldoDisponivel, lista))