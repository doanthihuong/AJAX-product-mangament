package com.example.ajaxproductmangament.repository;

import com.example.ajaxproductmangament.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {
}
