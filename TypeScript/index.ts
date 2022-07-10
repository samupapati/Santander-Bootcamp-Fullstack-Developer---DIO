function soma (a: number, b: number) {
    return a + b;
}

//types
//interfaces

interface IAnimal{
    nome: string;
    tipo: 'terrestre' | 'aquático';
    domestico: boolean;
}

interface IFelino extends IAnimal{
    visaoNoturna: boolean;
}

interface ICanino extends IAnimal{
    porte: 'pequeno' | 'medio' | 'grande';
}

type IDometisco = IFelino | ICanino;


const animal: IDometisco = {
    domestico: true,
    nome: 'cachorro',
    porte: 'medio',
    tipo: 'terrestre',
}

// tratando tag input
const input = document.getElementById('input') as HTMLInputElement;

input.addEventListener('input', (event) => {
    console.log('digitei')
    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value)
    //console.log(event.currentTarget.)
})

//Generic types

function adicionaApendiceALista<NaoSei>(array: NaoSei[], valor: NaoSei){
    return array.map(() => valor);
}

adicionaApendiceALista([1, 2, 3], 5);

//Desenvolvendo condicionais a partir de parametros
/*
interface IUsuario{
    id: string;
    email: string;
}

interface IAdmin extends IUsuario{
    cargo: 'gerente' | 'coordernador' | 'supervisor';
}

function redireciona(usuario: IUsuario | IAdmin){
    if('cargo' in usuario){
        //redirecionar para a area de administração
    }

    // redirecionar para a área do usuário
}
*/

//utilizando o caracter '?' para variaveis opcionais
interface IUsuario{
    id: string;
    email: string;
    cargo? : 'gerente' | 'coordernador' | 'supervisor' | 'funcionario';
}

function redireciona(usuario: IUsuario){
    if(usuario.cargo){
        //redirecionar(usuario.cargo)
    }
    // redirecionar para a área do usuário
}

//Criando variaveis com propriedade readonly e private
interface Cachorro {
    nome: string;
    idade: number;
    parqueFavorito?: string;
}

type CachorroSomenteLeitura = {
    +readonly [K in keyof Cachorro]-?: Cachorro[K];
}

class MeuCachorro implements CachorroSomenteLeitura {
    idade; 
    nome;
    parqueFavorito;

    constructor(nome, idade){
        this.nome = nome
        this.idade = idade
    }
}

const cao = new MeuCachorro('Apolo', 14);

//Como importar bibliotecas com typescript
import $ from 'jquery';

$.fn.extend({
    novaFuncao(){
        console.log('Chamou nova funcao')
    }
})

$('body').novaFuncao();

//como usar Omit
interface Pessoa {
    nome: string;
    idade: number;
    nacionalidade: string;
}

// interface Brasileiro extends Pessoa Omit<Pessoa, 'nacionalidade'>{

// }

// const brasileiro: Brasileiro = {
    
// }