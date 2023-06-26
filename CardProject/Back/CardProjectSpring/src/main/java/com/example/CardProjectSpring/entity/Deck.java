package com.example.CardProjectSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@MappedSuperclass
public class Deck {

    private int idUser;

    private List<String> format;

    private int quantityCards;
}
