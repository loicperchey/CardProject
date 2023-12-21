package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;

import java.util.List;

public interface FleshAndBloodCardService {

    FleshAndBloodCard saveFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard);
    FleshAndBloodCard findFleshAndBloodCardById(Integer idFleshAndBloodCard);
    List<FleshAndBloodCard> findFleshAndBloodCard();

    FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard, Integer idFleshAndBloodCard);

    void deleteFleshAndBloodCardById(Integer idFleshAndBloodCard);



   FleshAndBloodCard findFleshAndBloodCardByName(String name);
}
