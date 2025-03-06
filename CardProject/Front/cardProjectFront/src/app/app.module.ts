import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FleshAndBloodComponent } from './flesh-and-blood/flesh-and-blood.component';
import { MagicComponent } from './magic/magic.component';
import { DeckFleshAndBloodComponent } from './flesh-and-blood/deck-flesh-and-blood/deck-flesh-and-blood.component';
import { MagicDeckComponent } from './magic/magic-deck/magic-deck.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    WelcomeComponent,
    FleshAndBloodComponent,
    MagicComponent,
    DeckFleshAndBloodComponent,
    MagicDeckComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
