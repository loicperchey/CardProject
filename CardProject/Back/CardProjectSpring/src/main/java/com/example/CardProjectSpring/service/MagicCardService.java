package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.MagicCard;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MagicCardService {

    MagicCard saveMagicCard(MagicCard magicCard);

    List<MagicCard> findMagicCardList();

    MagicCard updateMagicCard(MagicCard magicCard, int id);

    void deleteMagicCardById(int id);

    MagicCard findMagicCardById(int id);

    List<MagicCard> findMagicCardByName(String name);
}
