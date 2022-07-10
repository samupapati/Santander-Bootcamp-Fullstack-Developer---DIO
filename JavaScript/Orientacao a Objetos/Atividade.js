/*
Crie a classe ContaBancaria, que possui os parâmetros agencia, numero, tipo e saldo;

Dentro de ContaBancaria, construa o getter e o setter de saldo;

Dentro de ContaBancaria, crie os métodos sacar e depositar;

Crie uma classe-filha chamada ContaCorrente que herda todos esses parâmetros e ainda possua o parâmetro cartaoCredito;

Ainda em ContaCorrente, construa o getter e o setter de cartaoCredito;

Ainda em ContaCorrente, faça com que o tipo seja 'conta corrente' por padrão;

Crie uma classe-filha chamada ContaPoupanca que herda todos os parâmetros de ContaBancaria;

Crie uma classe-filha chamada ContaUniversitaria que herda todos os parâmetros de ContaBancaria;

Faça com que o método saque de ContaUniversitaria apenas seja capaz de sacar valores menores que 500 reais.
*/

class ContaBancaria{
    constructor(agencia, numero){
        this.agencia = agencia;       
        this.numero = numero;
        this.tipo = 'Conta Bancaria';
        this.saldo = 0;
    }
    set setSaldo(valor){
        return this.saldo = valor;
    }
    get getSaldo(){
        return this.saldo;
    }
    sacar(valor){
        if(!valor > this.saldo){
            return console.log('Saque negado, saldo insuficiente!')
        }
        return this.saldo -= valor;
    }
    depositar(valor){
        return this.saldo += valor;
    }
}

class ContaCorrente extends ContaBancaria {
    constructor(cCredito){
        super()
        this.agencia = '5649'
        this.numero = '0574 5620 5874 6566'
        this.tipo = 'Conta Corrente'
        this.cCredito = 0;
    }
    set setCCredito(num){
        return this.cCredito = num;
    }
    get getCCredito(){
        return this.cCredito;
    }
}

class ContaPoupanca extends ContaBancaria {
    constructor(){
        super()
        this.agencia = '0512'
        this.numero = '4654 5625 0320 3444'
        this.tipo = 'Conta Poupanca'
    }
}

class ContaUniversitaria extends ContaBancaria{
    constructor(){
        super()
        this.agencia = '9105'
        this.numero = '8779 9879 5115 7504'
        this.tipo = 'Conta Universitaria'
    }
    sacar(valor){
        if(valor > 500){
            return console.log('Conta universitária não pode sacar valores maiores que 500')
        } else if(valor > this.saldo){
            return console.log('Saque negado, saldo insuficiente!')
        } else{
            return this.saldo -= valor;
        }
    }
}


let Amanda = new ContaBancaria(6014, '4841 5659 1214 9801' )
let Bruno = new ContaCorrente()
let Carla = new ContaPoupanca()
let Junior = new ContaUniversitaria()

console.log('Seja bem vindo(a) ao banco!')
console.log('Olá, Amanda!')
console.log('Conta Bancaria')
console.log('Agência: ' + Amanda.agencia)
console.log('Numero: ' + Amanda.numero)
Amanda.setSaldo=1500
console.log('O seu saldo é: ' + Amanda.getSaldo);
Amanda.sacar(450)
console.log('Você sacou ' + 450 + ', seu novo saldo é: ' + Amanda.getSaldo)
Amanda.depositar(891)
console.log('Você depositou ' + 891 + ', seu novo saldo é: ' + Amanda.getSaldo)

console.log('\n')

console.log('Seja bem vindo(a) ao banco!')
console.log('Olá, Bruno!')
console.log(Bruno.tipo)
console.log('Agência: ' + Bruno.agencia)
console.log('Numero: ' + Bruno.numero)
Bruno.setSaldo=850
console.log('O seu saldo é: ' + Bruno.getSaldo);
Bruno.sacar(600)
console.log('Você sacou ' + 600 + ', seu novo saldo é: ' + Bruno.getSaldo)
Bruno.depositar(200)
console.log('Você depositou ' + 200 + ', seu novo saldo é: ' + Bruno.getSaldo)
Bruno.setCCredito = 5000
console.log('Crédito disponivel: ' + Bruno.getCCredito)

console.log('\n')

console.log('Seja bem vindo(a) ao banco!')
console.log('Olá, Carla!')
console.log(Carla.tipo)
console.log('Agência: ' + Carla.agencia)
console.log('Numero: ' + Carla.numero)
Carla.setSaldo=1023
console.log('O seu saldo é: ' + Carla.getSaldo);
Carla.sacar(457)
console.log('Você sacou ' + 457 + ', seu novo saldo é: ' + Carla.getSaldo)
Carla.depositar(356)
console.log('Você depositou ' + 356 + ', seu novo saldo é: ' + Carla.getSaldo)

console.log('\n')

console.log('Seja bem vindo(a) ao banco!')
console.log('Olá, Junior!')
console.log(Junior.tipo)
console.log('Agência: ' + Junior.agencia)
console.log('Numero: ' + Junior.numero)
Junior.setSaldo=600
console.log('O seu saldo é: ' + Junior.getSaldo);
Junior.sacar(450)
console.log('Você sacou ' + 420 + ', seu novo saldo é: ' + Junior.getSaldo)
Junior.depositar(235)
console.log('Você depositou ' + 235 + ', seu novo saldo é: ' + Junior.getSaldo)