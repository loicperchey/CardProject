package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.Year;
import java.util.List;

@Entity
@Table(name = "MagicCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class MagicCard extends Card{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    private List<String> color;

    public MagicCard(String name, String edition, Year year, List<String> color) {
        super(name, edition, year);
        this.color = color;
    }
}
