package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Deck")
public class Deck {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    private int id_deck;

    private String game;

    @ManyToMany(mappedBy = "listDeckFleshAndBlood")
   private List<FleshAndBloodCard> cardListFleshAndBlood;
    @ManyToMany(mappedBy = "listDeckMagic" )
    private List<MagicCard> listMagicCard;

    private int quantityCard;
}
