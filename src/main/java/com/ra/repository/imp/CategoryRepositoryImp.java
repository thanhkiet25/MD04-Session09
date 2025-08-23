package com.ra.repository.imp;

import com.ra.model.Category;
import com.ra.repository.CategoryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class CategoryRepositoryImp implements CategoryRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Category> findAll() {
return entityManager.createQuery("from Category",Category.class).getResultList();
    }

    @Override
    @Transactional
    public boolean save(Category category) {
try{
    entityManager.persist(category);
    return true;
}catch (Exception e){
   e.printStackTrace();
}
return false;
    }

    @Override
    public Category findById(Long id) {
return entityManager.find(Category.class, id);
    }

    @Override
    public boolean update(Category category) {
try{
    entityManager.merge(category);
    return true;
} catch (Exception e) {
    e.printStackTrace();
}
return false;
    }

    @Override
    public boolean delete(Long id) {
try{
    entityManager.remove(entityManager.find(Category.class, id));
    return true;
}catch (Exception e){
    e.printStackTrace();
}
return false;
    }
}
