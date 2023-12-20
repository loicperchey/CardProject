package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;

import java.util.List;

public interface FleshAndBloodCardService {

    FleshAndBloodCard saveFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard);

    List<FleshAndBloodCard> findFleshAndBloodCard();

    FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard administratorAccount, Integer idFleshAndBloodCard);

    void deleteFleshAndBloodCardById(Integer idFleshAndBloodCard);

    FleshAndBloodCard findFleshAndBloodCardById(Integer idFleshAndBloodCard);

   FleshAndBloodCard findFleshAndBloodCardByName(String name);
}
