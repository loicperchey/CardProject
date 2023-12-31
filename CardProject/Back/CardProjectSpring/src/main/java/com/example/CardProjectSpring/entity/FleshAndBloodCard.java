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
    public int id;
    @NonNull
    public Integer cost;
    @NonNull
    public Integer pitch;
    @NonNull
    public String type;
    @NonNull
    public String talent;
    @NonNull
    public String text;
    @NonNull
    public int attack;
    @NonNull
    public int defense;

   /* @ManyToMany
    @NonNull
    @JsonIgnore
    private Collection<FleshAndBloodDeck> fleshAndBloodDeckListPresence;*/


}
