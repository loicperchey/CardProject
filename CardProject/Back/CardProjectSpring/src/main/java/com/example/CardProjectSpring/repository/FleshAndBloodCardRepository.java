package com.example.CardProjectSpring.repository;

import com.example.CardProjectSpring.entity.MagicCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FleshAndBloodCardRepository extends CrudRepository<MagicCard, Integer> {
}
