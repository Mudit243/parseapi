package com.parser.parserapi.Model;

import lombok.Data;

@Data
public class Product {
    private String subcategory;
    private String title;
    private String price;
    private String popularity;
    
    // Getter and setter methods for the fields
    
    // Method to convert popularity to integer
    public int getPopularityAsInt() {
        return Integer.parseInt(popularity);
    }
    
    // Method to convert price to integer
    public int getPriceAsInt() {
        return Integer.parseInt(price);
    }
}

