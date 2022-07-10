array = [30, 30, 40, 5, 223, 2049, 3034, 5]

colecaoSet = new Set(array)

function retornaNewArray(){
    novoArray = []
    
    for(let i of colecaoSet){
        novoArray.push(i)
    }

    return novoArray;
}

console.log(retornaNewArray())