package com.ra.service;

import com.ra.model.Seed;

import java.util.List;

public interface SeedService {
    List<Seed> findAllAndSearchName(int page, int size, String name);

    boolean save(Seed seed);

    Long countAllAndSearchName(String name);

    Seed findById(Long id);

    boolean update(Seed seed);

    boolean delete(Long id);
}
