import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {
  @Input() btnText: string = 'Clique'
  @Input() btnType: string = '';
  @Output() clickFilho = new EventEmitter;
  textFilho = 'Clicou no filho'

  constructor() { }

  ngOnInit(): void {
  }


  clicou(){
    this.clickFilho.emit(this.textFilho)
  }
}
