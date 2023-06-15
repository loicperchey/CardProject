package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.Card;
import com.example.CardProjectSpring.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{
    @Autowired
    private CardRepository cardRepository;
    @Override
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> findCard() {
        return (List<Card>) cardRepository.findAll();
    }

    @Override
    public Card updateCard(Card card, int id) {
        Card card1 = cardRepository.findById(id).get();
        return cardRepository.save(card1);
    }

    @Override
    public void deleteCardById(int id) {
        cardRepository.deleteById(id);
    }

    @Override
    public Card findCardById(int id) {
        return cardRepository.findById(id).orElse(null);
    }
}
