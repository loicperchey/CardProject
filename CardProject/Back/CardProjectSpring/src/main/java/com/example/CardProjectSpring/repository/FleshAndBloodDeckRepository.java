package com.example.CardProjectSpring.repository;


import com.example.CardProjectSpring.entity.FleshAndBloodDeck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FleshAndBloodDeckRepository extends JpaRepository<FleshAndBloodDeck, Integer>
{
    @Query("SELECT fleshAndBloodDeck FROM FleshAndBloodDeck fleshAndBloodDeck WHERE fleshAndBloodDeck.deckName = :deckName")
    FleshAndBloodDeck findByName(String deckName);
}
