let obj = {}

//adiciona chave name e valor julia ao objeto
obj.name = "julia"
obj["name"] = "julia"
console.log(obj)

//adiciona chave age e valor 20 ao objeto
obj.age = "20"
obj["age"] = "20"
console.log(obj)

//retorna os valores do objeto
console.log(Object.values(obj))

//retorna as chaves do objeto
console.log(Object.keys(obj))

//adicionando as chaves e os valores ja na inicialização do array
let pessoa = {
    nome: "Julia",
    idade: "20",
    endereco: "Rua 2"
}

//retornando nome
console.log(pessoa.nome)
console.log(pessoa["nome"])

