package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.Year;

@Entity
@Table(name = "FleshAndBloodHeroes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class FleshAndBloodHeroes extends Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    private Integer intelligence;


    private Integer pv;

    public FleshAndBloodHeroes(String name, String edition, Year year, Integer intelligence, Integer pv) {
        super(name, edition, year);
        this.intelligence = intelligence;
        this.pv = pv;
    }
}
