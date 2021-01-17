package com.maico.ms.productservice.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ahadahmed - 1/12/21
 * @see <a href="#"> see this</a>
 */
@RestController
@RequestMapping("/api")
public class ProductRestController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id){
        return null;
    }

    @GetMapping("/product/log")
    public void logTest(){

        this.logger.info("Info looogerereraldfhlajsldfjlasjldfjlasjldfjlasj");
        this.logger.debug("Debug looogerereraldfhlajsldfjlasjldfjlasjldfjlasj");

    }
}
