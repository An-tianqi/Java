package com.hitema.dao;

import com.hitema.entities.Country;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountryDaoImplTest {


    @Test
    void create() {
        CountryDaoImpl dao = new CountryDaoImpl();
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        dao.create(country);
        assertTrue(country.getId()!=null, "ERROR While create COUNTRY");
    }

    @Test
    void read() {
        CountryDaoImpl dao = new CountryDaoImpl();
        var c = dao.read(1l);
        assertTrue(c.getCountry().equals("afghanistan"),"ERROR DB seems corrupted !!!!");
    }

    @Test
    void update() {
        CountryDaoImpl dao = new CountryDaoImpl();
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        dao.update(country);
        assertTrue(country.getCountry().equals("qwerty"),"ERROR While update COUNTRY");
    }

    @Test
    void delete() {
        CountryDaoImpl dao = new CountryDaoImpl();
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        dao.delete(country);
        assertTrue(country.getId()==null, "ERROR While delete COUNTRY");
    }

    @Test
    void findAll() {
        CountryDaoImpl dao = new CountryDaoImpl();
        List<Country> countryList = dao.findAll();
        assertTrue(countryList==null, "ERROR While findAll COUNTRY");
    }
}