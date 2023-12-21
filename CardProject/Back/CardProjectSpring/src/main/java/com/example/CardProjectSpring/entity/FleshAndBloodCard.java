package com.example.CardProjectSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FleshAndBloodCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class FleshAndBloodCard extends Card{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer idFleshAndBloodCard;
    @NonNull
    private Integer cost;
    @NonNull
    private Integer pitch;
    @NonNull
    private String type;
    @NonNull
    private String talent;
    @NonNull
    private String text;
    @NonNull
    private int attack;
    @NonNull
    private int defense;

    @ManyToMany
    @NonNull
    @JsonIgnore
    private Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence;


}
