"use strict";
// Como podemos melhorar o esse código usando TS? 
var Profissao;
(function (Profissao) {
    Profissao[Profissao["Atriz"] = 0] = "Atriz";
    Profissao[Profissao["Padeiro"] = 1] = "Padeiro";
})(Profissao || (Profissao = {}));
let maria = {
    nome: "maria",
    idade: 29,
    profissao: Profissao.Atriz
};
let roberto = {
    nome: "roberto",
    idade: 19,
    profissao: Profissao.Padeiro
};
let laura = {
    nome: "laura",
    idade: 32,
    profissao: Profissao.Atriz
};
let carlos = {
    nome: "carlos",
    idade: 19,
    profissao: Profissao.Padeiro
};
