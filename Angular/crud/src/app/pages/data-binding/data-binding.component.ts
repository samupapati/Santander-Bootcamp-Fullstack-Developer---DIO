import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  text = 'Samuel'
  imgUrl = 'https://images.vexels.com/media/users/3/144839/isolated/lists/c053fda836de068b36cc18db64aec46d-ilustra-o-de-carro-preto.png'
  imgDescricao = 'carro'
  buttonText = 'Clique aqui'
  textRed = 'textred'
  bgColor = 'green'
  fontSize = '25px'
  textInput = ''

  cliqueaqui = 'Clique aqui'
  teste = 'Teste'
  classWarning = 'btn-warning'
  classDark = 'btn-dark'

  number = 0;
  destroy = false

  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(){
    return this.text
  }

  clicou(value: any){
    console.log('clicou aqui', value)
  }

  clicouNoFilho(text: any){
    console.log(text)
  }

  incremento(){
    this.number++
  }

  destroiComponent(){
    this.destroy = true
  }
}
