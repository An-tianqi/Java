package com.hitema.dao;

import com.hitema.entities.City;
import com.hitema.entities.Film;

import java.util.List;

public class FilmDaoImpl extends AbstractDao implements Dao<Film, Long>{

    public FilmDaoImpl(){
    }

    @Override
    public Film create(Film entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().persist(entity);
        tx.commit();
        return entity;
    }

    @Override
    public Film read(Long aLong) {
        return getCurrentSession().find(Film.class, aLong);
    }

    @Override
    public void update(Film entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().merge(entity);
        tx.commit();
    }

    @Override
    public void delete(Film entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().delete(entity);
        tx.commit();
    }

    @Override
    public List<Film> findAll() {
        return getCurrentSession().createQuery("from Film").getResultList();
    }

    public List<Film> serachByTitle(String str){
        return getCurrentSession().createQuery("from Film where title is" + str).getResultList();
    }
}
