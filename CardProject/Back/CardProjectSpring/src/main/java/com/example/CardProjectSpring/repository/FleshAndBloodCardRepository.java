package com.example.CardProjectSpring.repository;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FleshAndBloodCardRepository extends CrudRepository<FleshAndBloodCard, Integer> {

    @Query("SELECT name FROM FleshAndBloodCard WHERE fleshAndBloodCard.name = :name")

    FleshAndBloodCard findByName(@Param("name")String name);
}
