package com.enyoi.products.controller;

import com.enyoi.products.entity.Product;
import com.enyoi.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping(value = "/getall", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Product> getProductsByIds(@RequestBody List<Integer> ids){
        return productService.getProductsById(ids);
    }

}
