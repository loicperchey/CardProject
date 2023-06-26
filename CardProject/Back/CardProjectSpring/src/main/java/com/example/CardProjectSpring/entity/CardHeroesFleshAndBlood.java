package com.example.CardProjectSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.Year;
import java.util.List;

@Entity
@Table(name="CardHeroesFleshAndBlood")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CardHeroesFleshAndBlood extends  FleshAndBloodCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "native", strategy = "native")
    private int idCardHeroesFleshAndBlood;

    private int intelligence;

    private int pv;

    public int getIdCardHeroesFleshAndBlood() {
        return idCardHeroesFleshAndBlood;
    }

    public void setIdCardHeroesFleshAndBlood(int idCardHeroesFleshAndBlood) {
        this.idCardHeroesFleshAndBlood = idCardHeroesFleshAndBlood;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }


    public CardHeroesFleshAndBlood() {
    }

    
}
