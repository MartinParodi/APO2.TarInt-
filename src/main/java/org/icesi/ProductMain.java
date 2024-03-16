package org.icesi;

import java.util.Scanner;
public class ProductMain {
    private static ControllerProduct controler;
    private static Scanner lector;
    public static void main(String[] args) {
        System.out.println("bienbenido usuario");
        lector = new Scanner(System.in);

        showMenu();

    }
    public static void showMenu() {
        ProductMain obj = new ProductMain();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. hacer un pedido");
            System.out.println("4. Eliminar un pedido ya existente");
            System.out.println("5. Consultar pedidos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese el tipo del producto: ");
                    String tipoProducto = scanner.nextLine();

                    controler.addProduct(nombreProducto, descripcion, tipoProducto);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreProductoEliminar = scanner.nextLine();
                    controler.deleteProduct(nombreProductoEliminar);
                    break;

                case 3:
                    System.out.println("ingrese por favor los datos de su orden");

                    System.out.println("prducto a comprar");
                    String purchasedProduct = scanner.nextLine();

                    System.out.println("ingrese su nombre de comprador(nombre de usuario)");
                    String buyer = scanner.nextLine();
                    controler.addOrder(purchasedProduct,buyer);
                    break;

                case 4:
                    System.out.print("ingrese su nombre de usuario: ");
                    String Exbuyer = scanner.nextLine();
                    System.out.println("ingrese el prducto a aliminar");
                    String EXpurchasedProduct = scanner.nextLine();

                    controler.deleteOrder(Exbuyer,EXpurchasedProduct);
                    break;

                case 5:
                    System.out.print("ingrese su nombre de usuario: ");
                    String SEbuyer = scanner.nextLine();
                    System.out.println("ingrese el prducto a consultar");
                    String SEpurchasedProduct = scanner.nextLine();
                    break;

                case 6:
                    System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                    lector.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (choice!= 6);

        // Cerrar el scanner al salir del programa
        scanner.close();
    }

    }
}