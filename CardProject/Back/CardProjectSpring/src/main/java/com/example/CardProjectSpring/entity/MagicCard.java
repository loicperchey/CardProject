package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="MagicCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MagicCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    public int id;

}
