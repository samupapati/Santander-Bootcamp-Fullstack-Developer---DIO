function comparaIgual(n1, n2){
    return n1 === n2 ? 'são iguais' : 'não são iguais'
}
function comparaMaiorMenorQue10(n1, n2){
    if(n1 + n2 > 10){
        return 'maior'
    } else{
        return 'menor'
    }
}
function comparaMaiorMenorQue20(n1, n2){
    if(n1 + n2 < 20){
        return 'menor'
    } else{
        return 'maior'
    }
}

n1 = 7
n2 = 16

console.log(`Os números ${n1} e ${n2} ${comparaIgual(n1, n2)}. Sua soma é ${n1 + n2}, que é ${comparaMaiorMenorQue10(n1, n2)} do que 10 e ${comparaMaiorMenorQue20(n1, n2)} que 20`)