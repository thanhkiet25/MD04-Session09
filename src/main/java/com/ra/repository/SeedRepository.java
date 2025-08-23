package com.ra.repository;

import com.ra.model.Seed;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SeedRepository {
    @Transactional(readOnly = true)
    List<Seed> findAllAndSearchName(int page, int size, String searchName);

    boolean save(Seed seed);
@Transactional(readOnly = true)
    Long countAllSeeds( String searchName);
@Transactional(readOnly = true)
    Seed findById(Long id);

    boolean update(Seed seed);

    boolean delete(Long id);
}
