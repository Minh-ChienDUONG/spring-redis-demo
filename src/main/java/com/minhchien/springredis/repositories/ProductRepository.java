package com.minhchien.springredis.repositories;

import com.minhchien.springredis.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}

