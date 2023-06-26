import { Component, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
compteur: number=0;

cardEmitter: string ="card";
cardEmitterModification: string="";
change: EventEmitter<number> = new EventEmitter<number>();
changeModification : EventEmitter<string> = new EventEmitter<string>();

public compteurIncrement(){
  this.compteur++;
  this.change.emit(this.compteur);
}

public compteurDecrement(){
  this.compteur--;
  this.change.emit(this.compteur);
}
}
