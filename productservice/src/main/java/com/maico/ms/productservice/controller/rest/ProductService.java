package com.maico.ms.productservice.controller.rest;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ahadahmed - 1/12/21
 * @see <a href="#"> see this</a>
 */
@Service
//@Component
public class ProductService {

    private ProductDao productDao;
    public ProductService(ProductDao productDao){
        this.productDao = productDao;
    }

    public Product getProduct(Long productId) {
        Product p;

//        Product p = this.findById(productId);
        Optional<Product> productOptional = this.productDao.findById(productId);

        p =  productOptional.get();

        return p;
    }



    public List<Product> getProducts(){

      return (List<Product>) this.productDao.findAll();
    }


    private Product findById(Long productId) {
        Faker productFacker = new Faker();
        Product product = new Product(productId, productFacker.food().ingredient(),
                productFacker.lorem().fixedString(50), Double.valueOf(productFacker.commerce().price()));

        return product;

    }
}
