package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="MagicCard")
public class MagicCard extends Card{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    private int id_magic_card;

    private List<Color> colorList;

    private String type;

    private int attack;

    private int defend;

    @ManyToMany
    @JoinTable(name="MAGICCARD_DECK",
            joinColumns = @JoinColumn(name = "MAGICCARD_ID", referencedColumnName = "id_magic_card"),
            inverseJoinColumns = @JoinColumn(name="DECK_ID", referencedColumnName = "id_deck")
    )
    public List<Deck> listDeckMagic;

    public int getId_magic_card() {
        return id_magic_card;
    }

    public void setId_magic_card(int id_magic_card) {
        this.id_magic_card = id_magic_card;
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
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

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public MagicCard(String nom, String editor, String game, Date dateSortie, List<Color> colorList, String type, int attack, int defend) {
        super(nom, editor, game, dateSortie);
        this.colorList = colorList;
        this.type = type;
        this.attack = attack;
        this.defend = defend;
    }

    @Override
    public String toString() {
        return "MagicCard{" +
                "id_magic_card=" + id_magic_card +
                ", colorList=" + colorList +
                ", type='" + type + '\'' +
                ", attack=" + attack +
                ", defend=" + defend +
                ", id_card=" + id_card +
                ", nom='" + nom + '\'' +
                ", editor='" + editor + '\'' +
                ", game='" + game + '\'' +
                ", dateSortie=" + dateSortie +
                '}';
    }
}
