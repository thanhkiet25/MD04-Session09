package com.ra.service.imp;

import com.ra.model.Seed;
import com.ra.repository.CategoryRepository;
import com.ra.repository.SeedRepository;
import com.ra.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeedServiceImp implements SeedService {
    @Autowired
    private SeedRepository seedRepository;
    @Override
    public List<Seed> findAllAndSearchName(int page, int size, String searchName) {
        return seedRepository.findAllAndSearchName(page, size, searchName);
    }

    @Override
    public boolean save(Seed seed) {
        return seedRepository.save(seed);
    }

    @Override
    public Long countAllAndSearchName(String name) {
        return seedRepository.countAllSeeds(name);
    }

    @Override
    public Seed findById(Long id) {
        return seedRepository.findById(id);
    }

    @Override
    public boolean update(Seed seed) {
        return seedRepository.save(seed);
    }

    @Override
    public boolean delete(Long id) {
        return seedRepository.delete(id);
    }
}
