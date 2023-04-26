package com.hitema.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao <T, Key>{
    public T create(T entity);

    public T read(Key id);
    public void update(T entity);

    public void delete(T entity);

    public List<T> findAll();

}
