package com.hitema.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class AbstractDao {

    private SessionFactory factory;

    private Session currentSession;

    public Session getCurrentSession() {
        if ( ! ( currentSession != null && currentSession.isOpen()))
            currentSession=getSessionFactory().openSession();
        return currentSession;

    }

    private SessionFactory getSessionFactory() {
        if ( factory == null ){
            Configuration cfg = new Configuration().configure();
            factory = cfg.buildSessionFactory();
        }
        return factory;
    }

}
