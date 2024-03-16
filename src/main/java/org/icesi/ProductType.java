package org.icesi;

public interface ProductType {

    // Constantes para los tipos de productos
    String LIBROS = "Libros";
    String ELECTRONICA = "Electrónica";
    String ROPA_Y_ACCESORIOS = "Ropa y Accesorios";
    String ALIMENTOS_Y_BEBIDAS = "Alimentos y Bebidas";
    String PAPELERIA = "Papelería";
    String DEPORTES = "Deportes";
    String BELLEZA_Y_CUIDADO_PERSONAL = "Productos de Belleza y Cuidado Personal";
    String JUGUETES = "Juguetes";
    String VIDEOJUEGOS = "Videojuegos";

    // Método para obtener el tipo de producto
    String getType();

}
