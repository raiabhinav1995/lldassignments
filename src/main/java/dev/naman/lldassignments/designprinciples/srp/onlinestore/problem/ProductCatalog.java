package dev.naman.lldassignments.designprinciples.srp.onlinestore.problem;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private final Map<String, Double> products;
    ProductCatalog(){
        this.products=new HashMap<>();
    }
    public Double getProductPrice(String name){
        return products.get(name);
    }
    public Map<String, Double> getProductCatalog(){
        return this.products;
    }

    public void addProduct(String name, double price) {
        products.put(name, price);
    }

    public void removeProduct(String name) {
        products.put(name, null);
    }
}
