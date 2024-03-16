package org.icesi;

import java.util.Date;

public class ProductOrder {
    private Users buyer;
    private Product purchasedProduct;
    private Date orderDate;

    // Constructor
    public ProductOrder(Users buyer,Product purchasedProduct, Date orderDate) {
        this.buyer = buyer;

        this.purchasedProduct = purchasedProduct;

        this.orderDate = orderDate;
    }

    public ProductOrder(String purchasedProduct, String buyer) {
    }

    // Getter and Setter methods for purchasedProduct
    public Product getPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(Product purchasedProduct) {
        this.purchasedProduct = purchasedProduct;
    }

    // Getter and Setter methods for buyer
    public Users getBuyer() {
        return buyer;
    }

    public void setBuyer(Users buyer) {
        this.buyer = buyer;
    }

    // Getter and Setter methods for orderDate
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
