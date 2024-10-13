package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.Year;
import java.util.List;

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

    @NonNull
    private Integer intelligence;

    @NonNull
    private Integer pv;

    @OneToMany(mappedBy = "deckName")
    private List<FleshAndBloodDeck> deckNamePresence;

    public FleshAndBloodHeroes(String name, String edition, Year year, @NonNull Integer intelligence, @NonNull Integer pv, List<FleshAndBloodDeck> deckNamePresence) {
        super(name, edition, year);
        this.intelligence = intelligence;
        this.pv = pv;
        this.deckNamePresence = deckNamePresence;
    }
}
