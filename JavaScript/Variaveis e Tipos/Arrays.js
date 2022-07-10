let array = []

//adiciona no primeiro elemento do array
array.unshift(5)

//remove o primeiro elemento do array
array.shift()

//adiciona no ultimo elemento do array
array.push(3)

//remove o ultimo elemento do array
array.pop()

for(let i = 0; i < array.length; i++){
    console.log(array[i]);
}

//verifica se há um elemento no array
array.includes(1)

//saber se todos os itens são iguais a 5
array.every(item => item === 5)

//saber se algum item é igual a 5
array.some(item => item === 5)

//inverte a ordem do array
array.reverse()