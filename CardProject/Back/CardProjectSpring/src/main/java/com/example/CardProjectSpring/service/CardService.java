package com.example.CardProjectSpring.service;


import com.example.CardProjectSpring.entity.Card;

import java.util.List;

public interface CardService {

    Card saveCard(Card card);

    List<Card> findCard();

    Card updateCard(Card card, int id);

    void deleteCardById(int id);

    Card findCardById(int id);

}
