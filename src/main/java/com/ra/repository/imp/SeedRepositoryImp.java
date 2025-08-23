package com.ra.repository.imp;

import com.ra.model.Seed;
import com.ra.repository.SeedRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class SeedRepositoryImp implements SeedRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Seed> findAllAndSearchName(int page, int size, String searchName) {
      int offset = (page - 1) * size;
      String hql;
      if(searchName != null && !searchName.isEmpty()) {
          hql = "from Seed s where s.seedName like :searchName";
          return entityManager.createQuery(hql, Seed.class)
                  .setParameter("searchName", "%" + searchName + "%")
                  .setFirstResult(offset)
                  .setMaxResults(size)
                  .getResultList();

      }else{
          hql="from Seed s";
          return  entityManager.createQuery(hql, Seed.class)
                  .setFirstResult(offset)
                  .setMaxResults(size)
                  .getResultList();
      }
    }


    @Override
    public boolean save(Seed seed) {
       try{
           entityManager.persist(seed);
           return true;
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public Long countAllSeeds(String searchName) {
      String hql;
      if(searchName != null && !searchName.isEmpty()) {
          hql = "select count(s) from Seed s where s.seedName like :searchName";
          return entityManager.createQuery(hql,Long.class)
                  .setParameter("searchName","%"+searchName+"%")
                  .getSingleResult();
      }else{
          hql="select count(s) from Seed s";
          return entityManager.createQuery(hql,Long.class)
                  .getSingleResult();
      }
    }

    @Override
    public Seed findById(Long id) {
        return entityManager.find(Seed.class, id);
    }

    @Override
    public boolean update(Seed seed) {
       try{
           entityManager.merge(seed);
           return true;
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean delete(Long id) {
       try{
           entityManager.remove(entityManager.find(Seed.class, id));
           return true;
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }
}
