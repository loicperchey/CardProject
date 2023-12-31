package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;

import java.util.List;

public interface FleshAndBloodCardService {

    FleshAndBloodCard saveFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard);
    FleshAndBloodCard findFleshAndBloodCardById(int id);
    List<FleshAndBloodCard> findFleshAndBloodCard();

    FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard, int id);

    void deleteFleshAndBloodCardById(int id);



   FleshAndBloodCard findFleshAndBloodCardByName(String name);
}
