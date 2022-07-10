a = ''
b = ''

const Erro = new Error('A string está vazia');
Erro.name = 'Sintaxe inválida';

function concatena(n1, n2){
    if(n1 === '' & n2 === ''){
        throw Erro;
    }
}

console.log(concatena(a, b))
