package com.camp.northwind.business.abstracts;

import com.camp.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
