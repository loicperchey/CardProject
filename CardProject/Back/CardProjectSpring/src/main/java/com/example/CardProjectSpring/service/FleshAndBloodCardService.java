package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;

import java.util.List;

public interface FleshAndBloodCardService {

    FleshAndBloodCard saveFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard);

    List<FleshAndBloodCard> findFleshAndBloodCardList();

    FleshAndBloodCard findFleshAndBloodCardById(int idFleshAndBloodCard);

    FleshAndBloodCard updateFleshAndBloodCard(FleshAndBloodCard fleshAndBloodCard, int idFleshAndBloodCard);

    void deleteFleshAndBloodCardById(int idFleshAndBloodCard);
}
