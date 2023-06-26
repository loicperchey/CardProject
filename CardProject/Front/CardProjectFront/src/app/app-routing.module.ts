import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';

import {ReactiveFormsModule} from '@angular/forms'
import { BrowserModule } from '@angular/platform-browser';
import { CardMagicComponent } from './deck/card-magic/card-magic.component';
import { DeckComponent } from './deck/deck.component';
import { MagicCardDeckComponent } from './deck/magic-card-deck/magic-card-deck.component';
import { FleshAndBloodDeckComponent } from './deck/flesh-and-blood-deck/flesh-and-blood-deck.component';
import { CardFleshAndBloodComponent } from './deck/card-flesh-and-blood/card-flesh-and-blood.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'deck', component: DeckComponent},
  {path: 'deck-magic', component: MagicCardDeckComponent},
  {path: 'deck-flesh-and-blood', component: FleshAndBloodDeckComponent},
  {path: 'flesh-and-blood-card', component : CardFleshAndBloodComponent},
  {path: 'magic-card', component: CardMagicComponent },

]

@NgModule({
  imports: [RouterModule.forRoot(routes), ReactiveFormsModule, BrowserModule],
  exports: [RouterModule]
})


export class AppRoutingModule {


  }


