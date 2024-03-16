package org.icesi;

import java.util.Date;
import java.util.LinkedList;

public class ControllerProduct {
    private LinkedList<Users> usersLists;
    private LinkedList<Product> productList;
    private LinkedList<ProductOrder> orderList;

    public ControllerProduct() {
        this.usersLists = new LinkedList<>();
        this.productList = new LinkedList<>();
        this.orderList = new LinkedList<>();
    }
    public void addUsers(String name, String lastName, String userName, String password, Date bornDate,
                         String direction, int tell, String email) {
        // Validate input data (optional but recommended)

        Users newUser = new ConcreteUsers(name, lastName, userName, password, bornDate, direction, tell, email);
        usersLists.add(newUser);
    }

    public void addProduct(String nombreProducto, String descripcion, String tipoProducto) {
        Product newProduct = new ConcreteProduct(nombreProducto, descripcion, tipoProducto);
        productList.add(newProduct);
    }

    public void addOrder(String purchasedProduct, String buyer){
        boolean productExists = false;

        for (Product product : productList) {
            if (product.equals(purchasedProduct)) {
                productExists = true;
                break;
            }
        }

        if (!productExists) {
            System.out.println("El producto no está disponible para ordenar.");
            return;
        }

        // Crear la orden si el producto está en la lista de productos
        new Date();
        ProductOrder newProductOrder = new ConcreteProductOrder(purchasedProduct, buyer);
        orderList.add(newProductOrder);
    }

    public void deleteProduct(String nombreProducto) {
        Product productToDelete = null;

        for (Product product : productList) {
            if (product.getNombreProducto().equals(nombreProducto)) {
                productToDelete = product;
                break;
            }
        }

        if (productToDelete != null) {
            productList.remove(productToDelete);
            System.out.println("Producto eliminado: " + productToDelete.getNombreProducto());
        } else {
            System.out.println("No se encontró el producto con el nombre: " + nombreProducto);
        }
    }

    public void deleteOrder(String buyer, String nombreProducto) {
        ProductOrder orderToDelete = null;


        for (ProductOrder order : orderList) {
            if (order.getBuyer().equals(buyer) && order.getPurchasedProduct().getNombreProducto().equals(nombreProducto)) {
                orderToDelete = order;
                break;
            }
        }

        if (orderToDelete != null) {
            orderList.remove(orderToDelete);
            System.out.println("Orden eliminada para el producto: " + nombreProducto + " a nombre del comprador: " + buyer);
        } else {
            System.out.println("No se encontró ninguna orden para el producto: " + nombreProducto + " a nombre de: " + buyer);
        }
    }
    public void showOrdersByBuyer(String buyer) {
        for (ProductOrder order : orderList) {
            if (order.getBuyer().equals(buyer)) {
                System.out.println("Producto: " + order.getPurchasedProduct().getNombreProducto());
                System.out.println("Precio: " + order.getPurchasedProduct().getDescripcion());
                System.out.println("Fecha de compra: " + order.getOrderDate());

            }else {
                System.out.println("No se encontraron ordenes a nombre de: " + buyer);
            }
            }
        }
    }


    private static class ConcreteUsers extends Users{
        public  ConcreteUsers(String name, String lastName, String userName, String password,Date bornDate, String direction, int tell, String email){
           super(name,lastName,userName,password,bornDate,direction,tell,email);
        }
    }


    private static class ConcreteProduct extends Product {
        public ConcreteProduct(String nombreProducto, String descripcion, String tipoProducto) {
            super(nombreProducto, descripcion, tipoProducto);
        }
    }
    private static  class ConcreteProductOrder extends ProductOrder{
        public ConcreteProductOrder(String purchasedProduct, String buyer){
            super(purchasedProduct,buyer);
        }
    }
}
