package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.MagicCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicCardServiceImpl implements MagicCardService{
    @Override
    public MagicCard saveMagicCard(MagicCard magicCard) {
        return null;
    }

    @Override
    public List<MagicCard> findMagicCardList() {
        return null;
    }

    @Override
    public MagicCard updateMagicCard(MagicCard magicCard, int id) {
        return null;
    }

    @Override
    public void deleteMagicCardById(int id) {

    }

    @Override
    public MagicCard findMagicCardById(int id) {
        return null;
    }

    @Override
    public List<MagicCard> findMagicCardByName(String name) {
        return null;
    }
}
