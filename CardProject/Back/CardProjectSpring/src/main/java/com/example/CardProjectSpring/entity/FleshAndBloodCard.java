package com.example.CardProjectSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


import java.time.Year;
import java.util.List;

@Entity
@Table(name="FleshAndBloodCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public class FleshAndBloodCard extends Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idCardFleshAndBlood;
    private int cost;

    private int pitch;
    private List<String> Types;

    private String text;

    private int Attack;

    private int Defense;

    @ManyToMany
    @JoinTable(name="FleshAndBloodCard_DeckFleshAndBlood",
    joinColumns = @JoinColumn(name="idCardFleshAndBlood", referencedColumnName = "idCardFleshAndBlood"), inverseJoinColumns = @JoinColumn(name="idFleshAndBloodDeck", referencedColumnName = "idFleshAndBloodDeck"))
    private List<DeckFleshAndBlood> deckFleshAndBloodList;

    public int getIdCardFleshAndBlood() {
        return idCardFleshAndBlood;
    }

    public void setIdCardFleshAndBlood(int idCardFleshAndBlood) {
        this.idCardFleshAndBlood = idCardFleshAndBlood;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public List<String> getTypes() {
        return Types;
    }

    public void setTypes(List<String> types) {
        Types = types;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public FleshAndBloodCard() {
    }

    public FleshAndBloodCard(String name, String editor, String edition, Year release, int cost, int pitch, List<String> types, String text, int attack, int defense, List<DeckFleshAndBlood> deckFleshAndBloodList) {
        super(name, editor, edition, release);
        this.cost = cost;
        this.pitch = pitch;
        Types = types;
        this.text = text;
        Attack = attack;
        Defense = defense;
        this.deckFleshAndBloodList = deckFleshAndBloodList;
    }

    public FleshAndBloodCard(String name, String editor, String edition, Year release, List<String> types, String text, List<DeckFleshAndBlood> deckFleshAndBloodList) {
        super(name, editor, edition, release);
        Types = types;
        this.text = text;
    }

    @Override
    public String toString() {
        return "FleshAndBloodCard{" +
                "idCardFleshAndBlood=" + idCardFleshAndBlood +
                ", cost=" + cost +
                ", pitch=" + pitch +
                ", Types=" + Types +
                ", text='" + text + '\'' +
                ", Attack=" + Attack +
                ", Defense=" + Defense +
                ", deckFleshAndBloodList=" + deckFleshAndBloodList +
                '}';
    }
}


