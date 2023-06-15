package com.example.CardProjectSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="FleshAndBloodCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class FleshAndBloodCard extends Card {
}
