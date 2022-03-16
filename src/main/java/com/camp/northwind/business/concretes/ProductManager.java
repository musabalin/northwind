package com.camp.northwind.business.concretes;

import com.camp.northwind.business.abstracts.ProductService;
import com.camp.northwind.dataAccess.abstracts.ProductDao;
import com.camp.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {

        return productDao.findAll();
    }
}
