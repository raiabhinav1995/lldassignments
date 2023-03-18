package dev.naman.lldassignments.designprinciples.srp.onlinestore.problem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private ProductCatalog productCatalog;
    private Map<String, Integer> cartItems=new HashMap<>();
    Cart(ProductCatalog productCatalog){
        this.productCatalog=productCatalog;
    }

    public double calculateTotal() {
        double total = 0;
        Map<String, Double> products=this.productCatalog.getProductCatalog();
        for (String item : cartItems.keySet()) {
            total += products.get(item) * cartItems.get(item);
        }
        return total;
    }
    public void addItem(String name, int quantity){
        int currentQuantity=0;
        if(cartItems.containsKey(name)){
            currentQuantity=cartItems.get(name);
        }
        quantity+=currentQuantity;
        cartItems.put(name, quantity);
    }
    public void removeItem(String name){
        if(cartItems.containsKey(name)){
            cartItems.remove(name);
        }
    }
    public Map<String, Integer> getItems(){
        return this.cartItems;
    }

}
