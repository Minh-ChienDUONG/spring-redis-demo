package com.minhchien.springredis.services;

import com.minhchien.springredis.commands.ProductForm;
import com.minhchien.springredis.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
