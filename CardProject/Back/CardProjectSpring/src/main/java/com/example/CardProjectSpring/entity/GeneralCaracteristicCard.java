package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Table;

import java.sql.Date;

@Table(name="GeneralCaracteristicCard")
@MappedSuperclass
public class GeneralCaracteristicCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String name;

    private String edition;

    private Date date;

    public GeneralCaracteristicCard() {
    }

    public GeneralCaracteristicCard(String name, String edition, Date date) {
        this.name = name;
        this.edition = edition;
        this.date = date;
    }

    @Override
    public String toString() {
        return "GeneralCaracteristicCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edition='" + edition + '\'' +
                ", date=" + date +
                '}';
    }
}
