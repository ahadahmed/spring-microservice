package com.maico.ms.productservice.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ahadahmed - 1/12/21
 * @see <a href="#"> see this</a>
 */
@RestController("/api/")
public class ProductRestController {

    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable Long id){
        return null;
    }
}
