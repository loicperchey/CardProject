package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="FleshAndBloodCard")
public class FleshAndBloodCard extends Card{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    private int id_Flesh_And_Blood_Card;

    public int pitch;

    public int cost;

    public String type;

    public int attack;

    public int defense;

    @ManyToMany
    @JoinTable(name="FlESHCARD_DECK",
            joinColumns = @JoinColumn(name = "FLESHCARD_ID", referencedColumnName = "id_Flesh_And_Blood_Card"),
            inverseJoinColumns = @JoinColumn(name="DECK_ID", referencedColumnName = "id_deck")
    )
    public List<Deck> listDeckFleshAndBlood;
    public int getId_Flesh_And_Blood_Card() {
        return id_Flesh_And_Blood_Card;
    }

    public void setId_Flesh_And_Blood_Card(int id_Flesh_And_Blood_Card) {
        this.id_Flesh_And_Blood_Card = id_Flesh_And_Blood_Card;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public FleshAndBloodCard(String nom, String editor, String game, Date dateSortie, int id_Flesh_And_Blood_Card) {
        super(nom, editor, game, dateSortie);
        this.id_Flesh_And_Blood_Card = id_Flesh_And_Blood_Card;
    }
}
