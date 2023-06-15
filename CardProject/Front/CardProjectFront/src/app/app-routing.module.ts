import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { FleshAndBloodDeckComponent } from './flesh-and-blood-deck/flesh-and-blood-deck.component';
import { HomeComponent } from './home/home.component';
import { MagicDeckComponent } from './magic-deck/magic-deck.component';
import {ReactiveFormsModule} from '@angular/forms'
import { BrowserModule } from '@angular/platform-browser';

const routes: Routes = [
  {path: 'home', component:HomeComponent},
  {path: 'flesh-and-blood-deck', component : FleshAndBloodDeckComponent},
  {path: 'magic-deck', component: MagicDeckComponent },

]

@NgModule({
  imports: [RouterModule.forRoot(routes), ReactiveFormsModule, BrowserModule],
  exports: [RouterModule]
})


export class AppRoutingModule {


  }


