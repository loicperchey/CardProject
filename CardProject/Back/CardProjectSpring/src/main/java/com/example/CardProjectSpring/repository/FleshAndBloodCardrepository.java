package com.example.CardProjectSpring.repository;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FleshAndBloodCardrepository extends CrudRepository<FleshAndBloodCard, Integer> {
}
