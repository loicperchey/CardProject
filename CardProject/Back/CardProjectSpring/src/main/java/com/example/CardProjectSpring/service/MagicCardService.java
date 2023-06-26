package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.entity.MagicCard;

import java.util.List;

public interface MagicCardService {

    MagicCard saveMagicCard(MagicCard magicCard);

    List<MagicCard> findMagicCardList();

    MagicCard findMagicCardById(int idMagicCard);

    MagicCard updateMagicCard(MagicCard magicCard, int idMagicCard);

    void deleteMagicCardById(int idMagicCard);
}
