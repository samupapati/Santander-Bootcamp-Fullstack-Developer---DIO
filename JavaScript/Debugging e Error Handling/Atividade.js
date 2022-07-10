array = [1, 5, 4, 6]

function verificaErro(arr, num) {
    try {
        if (arr === undefined && num === undefined) {
            throw new ReferenceError('A função não recebeu parâmetros')
        }
        if (typeof arr !== 'object') {
            throw new TypeError('Não foi recebido um array')
        }
        if (typeof num !== 'number') {
            throw new TypeError('Não foi recebido um número')
        }
        if (arr.length !== num) {
            throw new RangeError('Os parâmetros precisam ter valores iguais')
        }
        return 'certo!';
    } catch (e) {
        if(e instanceof RangeError){
            console.log('RangeError!')
            console.log(e.stack)
        } else if(e instanceof ReferenceError){
            console.log('ReferenceError!')
            console.log(e.stack)
        } else{
            console.log('Outro tipo de erro!')
            console.log(e.stack)
        }
    }
}

    verificaErro()