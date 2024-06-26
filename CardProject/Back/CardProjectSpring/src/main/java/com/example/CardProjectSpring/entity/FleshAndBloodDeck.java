package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "FleshAndBloodDeck")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class FleshAndBloodDeck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    private String deckName;

 @ManyToMany
    @JoinTable(
            name="FleshAndBloodDeck_FleshAndBloodCard",
            joinColumns = @JoinColumn(name = "idFleshAndBloodCard"),
            inverseJoinColumns = @JoinColumn(name = "idFleshAndBloodDeck")
    )
    private Collection<FleshAndBloodCard> fleshAndBloodCardList;

    public FleshAndBloodDeck(String deckName, Collection<FleshAndBloodCard> fleshAndBloodCardList) {
        this.deckName = deckName;
        this.fleshAndBloodCardList = fleshAndBloodCardList;
    }
}
