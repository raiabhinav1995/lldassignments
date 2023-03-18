package dev.naman.lldassignments.designprinciples.srp.onlinestore.problem;

import java.util.Map;

public class InvoicePrinter {
    private ProductCatalog productCatalog;

    InvoicePrinter(ProductCatalog productCatalog){
        this.productCatalog=productCatalog;

    }
    public void printInvoice(Cart cart) {
        System.out.println("Invoice:");
        double total=cart.calculateTotal();
        Map<String, Integer> cartItems=cart.getItems();
        Map<String, Double> productCatalog=this.productCatalog.getProductCatalog();
        for (String item : cartItems.keySet()) {
            System.out.printf("%s: %d x $%.2f%n", item, cartItems.get(item), productCatalog.get(item));
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}
