package com.example.CardProjectSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Card")
public class Card {
        @Id
        @GeneratedValue
        protected int id;

        protected String nom;

        protected String editor;
        protected Date dateSortie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Card(String nom, String editor, Date dateSortie) {
        this.nom = nom;
        this.editor = editor;
        this.dateSortie = dateSortie;
    }


}


