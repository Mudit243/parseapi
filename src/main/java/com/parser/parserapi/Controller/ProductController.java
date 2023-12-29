package com.parser.parserapi.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parser.parserapi.Model.Product;

@RestController
public class ProductController {
    @PostMapping("/postProductWrapper")
    public List<Product> addProductWrapper(@RequestBody ProductWrapper productWrapper) {
        List<Product> list = new ArrayList<>();
        if (productWrapper != null && productWrapper.getProducts() != null) {
            Map<String, Product> products = productWrapper.getProducts();
            // Process the map entries as needed
            for (Map.Entry<String, Product> entry : products.entrySet()) {
                String key = entry.getKey();
                Product product = entry.getValue();
                list.add(product);
            }
            list.sort((p1, p2) -> Integer.compare(Integer.parseInt(p2.getPopularity()), Integer.parseInt(p1.getPopularity())));
            return list;
        } else {
            return list;
        }
    }
}
