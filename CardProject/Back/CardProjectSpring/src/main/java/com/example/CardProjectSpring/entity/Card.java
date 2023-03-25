package com.example.CardProjectSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Card")
public abstract class Card {
        @Id
        @GeneratedValue
        protected int id_card;

        protected String nom;

        protected String editor;

        protected String game;
        protected Date dateSortie;

    public int getIdCard() {
        return id_card;
    }

    public void setIdCard(int id_card) {
        this.id_card = id_card;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Card(String nom, String editor, String game, Date dateSortie) {
        this.nom = nom;
        this.editor = editor;
        this.game = game;
        this.dateSortie = dateSortie;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id_card=" + id_card +
                ", nom='" + nom + '\'' +
                ", editor='" + editor + '\'' +
                ", game='" + game + '\'' +
                ", dateSortie=" + dateSortie +
                '}';
    }
}


