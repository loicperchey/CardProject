package com.example.CardProjectSpring.repository;


import com.example.CardProjectSpring.entity.FleshAndBloodHeroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FleshAndBloodHeroesRepository extends JpaRepository<FleshAndBloodHeroes, Integer> {
    @Query("SELECT fleshAndBloodHeroes FROM FleshAndBloodHeroes fleshAndBloodHeroes WHERE fleshAndBloodHeroes.name = :name")
    FleshAndBloodHeroes findByName(String name);
}
