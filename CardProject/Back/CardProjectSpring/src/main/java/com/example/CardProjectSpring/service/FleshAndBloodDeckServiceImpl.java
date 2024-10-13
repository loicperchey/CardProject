package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodDeck;
import com.example.CardProjectSpring.repository.FleshAndBloodDeckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FleshAndBloodDeckServiceImpl implements FleshAndBloodDeckService{

    @Autowired
    private FleshAndBloodDeckRepository fleshAndBloodDeckRepository;

    @Override
    public FleshAndBloodDeck saveFleshAndBloodDeck(FleshAndBloodDeck fleshAndBloodDeck) {
        return fleshAndBloodDeckRepository.save(fleshAndBloodDeck);
    }

    @Override
    public FleshAndBloodDeck findFleshAndBloodDeckById(int id) {
        return fleshAndBloodDeckRepository.findById(id).orElse(null);
    }

    @Override
    public List<FleshAndBloodDeck> findFleshAndBloodDeck() {
        return fleshAndBloodDeckRepository.findAll();
    }

    @Override
    public FleshAndBloodDeck updateFleshAndBloodDeck(FleshAndBloodDeck fleshAndBloodDeck, int id) {
        FleshAndBloodDeck fleshAndBloodDeck1 = fleshAndBloodDeckRepository.findById(id).get();
        BeanUtils.copyProperties(fleshAndBloodDeck, fleshAndBloodDeck1, "id");
        return fleshAndBloodDeckRepository.saveAndFlush(fleshAndBloodDeck1);
    }

    @Override
    public void deleteFleshAndBloodDeckById(int id) {
        fleshAndBloodDeckRepository.deleteById(id);
    }

    @Override
    public FleshAndBloodDeck findFleshAndBloodDeckByName(String deckName) {
        return fleshAndBloodDeckRepository.findByName(deckName);
    }
}
