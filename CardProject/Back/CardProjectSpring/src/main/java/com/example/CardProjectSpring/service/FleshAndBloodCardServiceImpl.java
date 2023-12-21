package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.repository.FleshAndBloodCardRepository;
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
    public FleshAndBloodCard findFleshAndBloodCardById(Integer idFleshAndBloodCard) {
        return fleshAndBloodCardRepository.findById(idFleshAndBloodCard).orElse(null);
    }
    @Override
    public FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard, Integer idFleshAndBloodCard) {
         FleshAndBloodCard fleshAndBloodCard1 = fleshAndBloodCardRepository.findById(idFleshAndBloodCard).get();
        return fleshAndBloodCardRepository.save(fleshAndBloodCard1);
    }

    @Override
    public void deleteFleshAndBloodCardById(Integer idFleshAndBloodCard) {
        fleshAndBloodCardRepository.deleteById(idFleshAndBloodCard);
    }



    @Override
    public FleshAndBloodCard findFleshAndBloodCardByName(String name) {
        return fleshAndBloodCardRepository.findByName(name);
    }


}



