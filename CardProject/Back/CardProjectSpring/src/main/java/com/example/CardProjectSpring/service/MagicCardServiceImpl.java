package com.example.CardProjectSpring.service;

import com.example.CardProjectSpring.entity.MagicCard;
import com.example.CardProjectSpring.repository.MagicCardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MagicCardServiceImpl implements MagicCardRepository {
    @Override
    public <S extends MagicCard> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MagicCard> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MagicCard> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<MagicCard> findAll() {
        return null;
    }

    @Override
    public Iterable<MagicCard> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(MagicCard entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends MagicCard> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
