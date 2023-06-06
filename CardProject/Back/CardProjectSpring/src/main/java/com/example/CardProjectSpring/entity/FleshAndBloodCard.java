package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.ArrayList;

@Entity
@Table(name="FleshAndBloodCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class FleshAndBloodCard extends GeneralCaracteristicCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private int cost;

    private int pitch;

    private ArrayList<String> type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public FleshAndBloodCard() {
    }

    public FleshAndBloodCard(String name, String edition, Date date, int cost, int pitch, ArrayList<String> type) {
        super(name, edition, date);
        this.cost = cost;
        this.pitch = pitch;
        this.type = type;
    }
}
