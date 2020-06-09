package com.solvd.mavenUberCarService.myBatis.dao;

import java.util.List;
import java.util.Optional;

public interface IDAO<T> {
    Optional<T> getById(Long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);

    default void deleteById(Long id) {
        Optional<T> t = getById(id);
        if(t.isPresent()) {
            delete(t.get());
        }
    };
}
