package org.icesi;

import java.util.Date;

public class ProductOrder {
    private Product purchasedProduct;
    private Users buyer;
    private Date orderDate;

    // Constructor
    public ProductOrder(Product purchasedProduct, Users buyer, Date orderDate) {
        this.purchasedProduct = purchasedProduct;
        this.buyer = buyer;
        this.orderDate = orderDate;
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
