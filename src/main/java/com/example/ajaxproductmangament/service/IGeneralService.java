package com.example.ajaxproductmangament.service;

import java.util.Optional;

public interface IGeneralService <T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T smartPhone);

    void remove(Long id);
}
