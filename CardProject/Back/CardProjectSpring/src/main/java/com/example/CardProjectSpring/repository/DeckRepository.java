package com.example.CardProjectSpring.repository;

import com.example.CardProjectSpring.entity.Deck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends CrudRepository<Deck, Integer> {
}
