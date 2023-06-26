package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="DeckFleshAndBlood")
public class DeckFleshAndBlood {

    private int idFleshAndBloodDeck;

    @ManyToMany(mappedBy = "deckFleshAndBloodList")
    private List<FleshAndBloodCard> idFleshAndBloodCards;

}
