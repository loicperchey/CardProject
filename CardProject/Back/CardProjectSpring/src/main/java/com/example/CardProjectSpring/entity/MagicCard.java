package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.Year;
import java.util.ArrayList;

@Entity
@Table(name="MagicCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MagicCard extends Card{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idMagicCard;

    private ArrayList<String> colorList;

    private int cost;

    private ArrayList<String> typeList;

    private ArrayList<String> capacityList;

    private String text;

    private int attack;

    private int defense;

    public int getIdMagicCard() {
        return idMagicCard;
    }

    public void setIdMagicCard(int idMagicCard) {
        this.idMagicCard = idMagicCard;
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }

    public void setColorList(ArrayList<String> colorList) {
        this.colorList = colorList;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ArrayList<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(ArrayList<String> typeList) {
        this.typeList = typeList;
    }

    public ArrayList<String> getCapacityList() {
        return capacityList;
    }

    public void setCapacityList(ArrayList<String> capacityList) {
        this.capacityList = capacityList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public MagicCard() {
    }

    public MagicCard(String name, String editor, String edition, Year release, ArrayList<String> colorList, int cost, ArrayList<String> typeList, ArrayList<String> capacityList, String text, int attack, int defense) {
        super(name, editor, edition, release);
        this.colorList = colorList;
        this.cost = cost;
        this.typeList = typeList;
        this.capacityList = capacityList;
        this.text = text;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "MagicCard{" +
                "idMagicCard=" + idMagicCard +
                ", colorList=" + colorList +
                ", cost=" + cost +
                ", typeList=" + typeList +
                ", capacityList=" + capacityList +
                ", text='" + text + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
