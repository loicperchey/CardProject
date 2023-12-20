package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "FleshAndBloodHeroes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class FleshAndBloodHeroes extends Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idFleshAndBloodHeroes;
    @NonNull
    private Integer intelligence;

    @NonNull
    private Integer pv;
}
