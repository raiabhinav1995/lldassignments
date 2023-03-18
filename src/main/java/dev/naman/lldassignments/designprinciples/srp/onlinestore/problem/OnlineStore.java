package dev.naman.lldassignments.designprinciples.srp.onlinestore.problem;

public class OnlineStore {
    private ProductCatalog productCatalog;
    private final InvoicePrinter invoicePrinter;
    private Cart cart;
    ProductCatalog getProductCatalog(){
        return this.productCatalog;
    }
    OnlineStore(){
        this.productCatalog=new ProductCatalog();
        this.invoicePrinter=new InvoicePrinter(this.productCatalog);
        this.cart=new Cart(this.productCatalog);
    }
    public void printInvoice(Cart cart){
        this.invoicePrinter.printInvoice(cart);
    }

    Cart createCart(){
        return this.cart;
    }


}
