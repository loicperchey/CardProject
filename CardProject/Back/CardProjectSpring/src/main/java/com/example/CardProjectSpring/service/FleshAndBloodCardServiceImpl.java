package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.repository.FleshAndBloodCardRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FleshAndBloodCardServiceImpl implements FleshAndBloodCardService{

    @Autowired
    private FleshAndBloodCardRepository fleshAndBloodCardRepository;
    @Override
    public FleshAndBloodCard saveFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard) {
        return fleshAndBloodCardRepository.save(fleshAndBloodCard);
    }

    @Override
    public List<FleshAndBloodCard> findFleshAndBloodCard() {
        return fleshAndBloodCardRepository.findAll();
    }

    @Override
    public FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard, int id) {
        fleshAndBloodCard = fleshAndBloodCardRepository.findById(id).orElse(null);
        assert fleshAndBloodCard != null;
        return fleshAndBloodCardRepository.save(fleshAndBloodCard);
    }

    @Override
    public void deleteFleshAndBloodCardById(int id) {
        fleshAndBloodCardRepository.deleteById(id);
    }

    @Override
    public FleshAndBloodCard findFleshAndBloodCardById(int id) {
        return fleshAndBloodCardRepository.findById(id).orElse(null);
    }


    @Override
    public FleshAndBloodCard findFleshAndBloodCardByName(String name) {
        return fleshAndBloodCardRepository.findByName(name);
    }


}



