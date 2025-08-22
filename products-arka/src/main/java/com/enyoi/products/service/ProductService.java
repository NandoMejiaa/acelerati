package com.enyoi.products.service;

import com.enyoi.products.entity.Product;
import com.enyoi.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Flux<Product> getProductsById(List<Integer> idFlux){
        //return productRepository.findAllById(idFlux);
        return productRepository.findByIdIn(idFlux);
    }

}
