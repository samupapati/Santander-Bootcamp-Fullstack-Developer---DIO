const pessoa = {
    nome: "Rodolfo",
    idade: 26,
    localNascimento: "Brasil",
}

function calculaIdade(anos){
    return console.log(`Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade`);
}

calculaIdade.call(pessoa, 5)
calculaIdade.apply(pessoa, [10])