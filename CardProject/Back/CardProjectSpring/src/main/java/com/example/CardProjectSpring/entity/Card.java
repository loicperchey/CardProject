package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.time.Year;
import java.util.Date;





@MappedSuperclass
@Getter
@Setter
@RequiredArgsConstructor
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
}
