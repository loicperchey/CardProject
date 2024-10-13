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
    private int id;


    private Integer cost;

    private Integer pitch;

    @NonNull
    private String type;

    private String talent;

    @NonNull
    private String text;

    private int attack;

    private int defense;

    @ManyToMany
    @JsonIgnore
    private Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence;

    public FleshAndBloodCard(String name, String edition, Year year, Integer cost, Integer pitch, @NonNull String type, String talent, @NonNull String text, int attack, int defense, Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence) {
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
