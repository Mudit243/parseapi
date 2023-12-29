package com.parser.parserapi.Controller;
import java.util.Map;

import com.parser.parserapi.Model.Product;


public class ProductWrapper {
    private int count;
    private Map<String, Product> products;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }
}
