package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name = "MagicCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MagicCard extends Card{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @NonNull
    private List<String> color;
}
