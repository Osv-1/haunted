package com.br.loja.haunted.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductsController {

    @GetMapping( "/products")
    public ModelAndView products() {
        return new ModelAndView("products");
    }

}
