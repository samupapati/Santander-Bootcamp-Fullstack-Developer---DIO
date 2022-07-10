array = [1, 4, 9, 20, -66, 90, 35, 32, 44, 50, 5, 0, 285, -500, 1028]

//sem function
novoArray = array.filter((item) => item % 2 === 0)
console.log('Sem function: ')
console.log(novoArray)

//com function com arrow function
function retornaPares(arr){
    return novoArray2 = arr.filter((item) => item % 2 === 0)
}
console.log('com function com arrow function:')
console.log(retornaPares(array));

//com function sem arrow function
function retornaPares2(arr){
    return novoArray3 = arr.filter(function(item) {
        return item % 2 === 0
    });
}
console.log('com function sem arrow function:')
console.log(retornaPares2(array))