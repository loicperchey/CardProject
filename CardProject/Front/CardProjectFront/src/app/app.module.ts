import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AppRoutingModule } from './app-routing.module';

import { FooterComponent } from './footer/footer.component';
import {ReactiveFormsModule} from '@angular/forms';
import { DeckComponent } from './deck/deck.component';
import { CardMagicComponent } from './deck/card-magic/card-magic.component';
import { FleshAndBloodDeckComponent } from './deck/flesh-and-blood-deck/flesh-and-blood-deck.component';
import { MagicCardDeckComponent } from './deck/magic-card-deck/magic-card-deck.component';
import { CardFleshAndBloodComponent } from './deck/card-flesh-and-blood/card-flesh-and-blood.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    FooterComponent,
    DeckComponent,
    CardMagicComponent,
    FleshAndBloodDeckComponent,
    MagicCardDeckComponent,
    CardFleshAndBloodComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
