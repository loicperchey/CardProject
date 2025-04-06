package com.metierbdd.cardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
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

    @NonNull
    private List<String> color;

    private String block;

    public MagicCard(String name, String edition, Year year, @NonNull List<String> color, String block) {
        super(name, edition, year);
        this.color = color;
        this.block = block;
    }
}
