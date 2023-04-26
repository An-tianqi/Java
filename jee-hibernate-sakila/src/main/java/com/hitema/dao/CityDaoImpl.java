package com.hitema.dao;

import com.hitema.entities.City;

import java.util.List;

public class CityDaoImpl extends AbstractDao implements Dao<City, Long>{

    public CityDaoImpl(){
    }

    @Override
    public City create(City entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().persist(entity);
        tx.commit();
        return entity;
    }

    @Override
    public City read(Long aLong) {
        return getCurrentSession().find(City.class, aLong);
    }

    @Override
    public void update(City entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().merge(entity);
        tx.commit();
    }

    @Override
    public void delete(City entity) {
        var tx = getCurrentSession().getTransaction();
        tx.begin();
        getCurrentSession().delete(entity);
        tx.commit();
    }

    @Override
    public List<City> findAll() {
        return getCurrentSession().createQuery("from City").getResultList();
    }
}
