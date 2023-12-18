package com.laurentiuspilca.springframeworke12.repositories;

import com.laurentiuspilca.springframeworke12.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    

}

