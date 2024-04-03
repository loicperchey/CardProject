package com.example.CardProjectSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.Year;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FleshAndBloodCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter

@NoArgsConstructor
@ToString
public class FleshAndBloodCard extends Card{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public int id;


    public Integer cost;

    public Integer pitch;

    public String type;

    public String talent;

    public String text;

    public int attack;

    public int defense;

    @ManyToMany
    @JsonIgnore
    private Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence;

    public FleshAndBloodCard(String name, String edition, Year year, Integer cost, Integer pitch, String type, String talent, String text, int attack, int defense, Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence) {
        super(name, edition, year);
        this.cost = cost;
        this.pitch = pitch;
        this.type = type;
        this.talent = talent;
        this.text = text;
        this.attack = attack;
        this.defense = defense;
        this.fleshAndBloodDeckListPresence = fleshAndBloodDeckListPresence;
    }
}
