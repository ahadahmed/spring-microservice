package com.maico.ms.productservice.controller.rest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@DataJpaTest
@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;
    private static int count=0;

    @BeforeAll

    public static void setup(){
        count++;
        System.out.println("count:"+count);
    }

    @Test
    @Sql(value = "classpath:create-product.sql")
    void getProduct() {
//        Product p = productService.getProduct(1l);
        Product product = productService.getProduct(1l);
//        Optional<Product> product = productDao.findById(1l);
        System.out.println(product);
        assertTrue(product != null);
    }

    @Test
//    @Sql("classpath:create-product.sql")
    void getProducts() {
        List<Product> products = productService.getProducts();
        products.forEach(p -> System.out.println(p));
        assertEquals(products.size(), 3, "Products size did not match with sql script");
    }

}
