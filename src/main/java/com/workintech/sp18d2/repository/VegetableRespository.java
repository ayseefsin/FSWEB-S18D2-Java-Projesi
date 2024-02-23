package com.workintech.sp18d2.repository;

import com.workintech.sp18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRespository {

    @Query(value = "SELECT v FROM Vegetable ORDER BY price DESC")
    public List<Vegetable> orderPriceDesc();
    @Query(value = "SELECT v FROM Vegetable ORDER BY price DESC")
    public List<Vegetable> orderPriceAsc();
    @Query(value = "SELECT v FROM Vegetable WHERE v.name ILIKE %:name%")
    public List<Vegetable> searchByname(String name);


}
