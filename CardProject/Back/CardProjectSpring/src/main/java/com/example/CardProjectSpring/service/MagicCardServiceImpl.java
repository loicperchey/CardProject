package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.MagicCard;
import com.example.CardProjectSpring.repository.MagicCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicCardServiceImpl implements MagicCardService{

    @Autowired
    private MagicCardRepository magicCardRepository;
    @Override
    public MagicCard saveMagicCard(MagicCard magicCard) {
        return magicCardRepository.save(magicCard);
    }

    @Override
    public List<MagicCard> findMagicCardList() {
        return(List<MagicCard>) magicCardRepository.findAll();
    }

    @Override
    public MagicCard findMagicCardById(int idMagicCard) {
        return magicCardRepository.findById(idMagicCard).orElse(null);
    }

    @Override
    public MagicCard updateMagicCard(MagicCard magicCard, int idMagicCard) {
        MagicCard magicCard1= magicCardRepository.findById(idMagicCard).get();
        return magicCardRepository.save(magicCard);
    }

    @Override
    public void deleteMagicCardById(int idMagicCard) {
        magicCardRepository.deleteById(idMagicCard);
    }
}
