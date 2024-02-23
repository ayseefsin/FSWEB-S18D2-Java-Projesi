package com.workintech.sp18d2.repository;

import com.workintech.sp18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query(value = "SELECT f.id, f.name, f.price, f.fruit_type FROM workintech.fruit AS f ORDER BY f.price DESC",nativeQuery = true)
    List<Fruit> orderPriceDesc();

    @Query(value = "SELECT f.id, f.name, f.price, f.fruit_type FROM workintech.fruit AS f ORDER BY f.price",nativeQuery = true)
    List<Fruit> orderPriceAsc();
    @Query(value = "SELECT f FROM Fruit f WHERE f.name ILIKE %:name% ")
    List<Fruit> searchByName(String name);
}
