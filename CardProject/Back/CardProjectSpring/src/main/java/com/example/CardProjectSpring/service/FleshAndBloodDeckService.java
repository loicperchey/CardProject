package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodDeck;

import java.util.List;

public interface FleshAndBloodDeckService {

    FleshAndBloodDeck saveFleshAndBloodDeck(FleshAndBloodDeck fleshAndBloodDeck);
    FleshAndBloodDeck findFleshAndBloodDeckById(int id);
    List<FleshAndBloodDeck> findFleshAndBloodDeck();

    FleshAndBloodDeck updateFleshAndBloodDeck (FleshAndBloodDeck fleshAndBloodDeck, int id);

    void deleteFleshAndBloodDeckById(int id);



    FleshAndBloodDeck findFleshAndBloodDeckByName(String deckName);
}
