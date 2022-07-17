package com.example.bookstores.service;

import java.util.List;

public interface BaseService<T,ID> {
    T save(T entity);

    void delete(T entity);

    T update(T entity);

    T findOne(ID id);

    List<T> findAll();
}
