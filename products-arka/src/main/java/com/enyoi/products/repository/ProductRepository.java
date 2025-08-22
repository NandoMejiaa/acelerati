package com.enyoi.products.repository;

import com.enyoi.products.entity.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import java.util.Collection;

public interface ProductRepository extends R2dbcRepository<Product, Integer> {

    //Flux<Product> findAllById(Flux<Integer> ids);
    Flux<Product> findByIdIn(Collection<Integer> ids);
}
