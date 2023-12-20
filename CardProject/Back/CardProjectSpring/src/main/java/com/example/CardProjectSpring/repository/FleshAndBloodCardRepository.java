package com.example.CardProjectSpring.repository;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FleshAndBloodCardRepository extends JpaRepository<FleshAndBloodCard, Integer> {
  @Query("SELECT fleshAndBloodCard FROM FleshAndBloodCard fleshAndBloodCard WHERE fleshAndBloodCard.name = :name")
  FleshAndBloodCard findByName(String name);
}
