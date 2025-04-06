package com.metierbdd.cardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Year;


@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@ToString
@SuperBuilder
public class Card {

    @NonNull
    public String name;

    @NonNull
    public String edition;

    @NonNull
    public Year year;

    public Card(String name, String edition, Year year) {
        this.name = name;
        this.edition = edition;
        this.year = year;
    }
}
