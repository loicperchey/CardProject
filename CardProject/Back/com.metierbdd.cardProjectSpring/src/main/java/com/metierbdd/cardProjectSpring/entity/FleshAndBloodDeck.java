package com.metierbdd.cardProjectSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Collection;

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

    @NonNull
    private String deckName;

    @NonNull
    private String format;

    @NonNull
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "heroesDeck")
    private FleshAndBloodHeroes heroes;

 @ManyToMany
    @JoinTable(
            name="FleshAndBloodDeck_FleshAndBloodCard",
            joinColumns = @JoinColumn(name = "idFleshAndBloodCard"),
            inverseJoinColumns = @JoinColumn(name = "idFleshAndBloodDeck")
    )
    private Collection<FleshAndBloodCard> fleshAndBloodCardList;

    public FleshAndBloodDeck(@NonNull String deckName, @NonNull String format, @NonNull FleshAndBloodHeroes heroes, Collection<FleshAndBloodCard> fleshAndBloodCardList) {
        this.deckName = deckName;
        this.format = format;
        this.heroes = heroes;
        this.fleshAndBloodCardList = fleshAndBloodCardList;
    }
}
