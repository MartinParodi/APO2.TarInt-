package org.icesi;

public abstract class Product implements ProductType {

    public static final String nombreProducto;
    public static final String describcion;
    public static final String tipoProducto;

    public Product(String nombreProducto, String describcion, String tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.describcion = describcion;
        this.tipoProducto = tipoProducto;
    }

    // Métodos getter y setter para apellido
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    // Métodos getter y setter para descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos getter y setter para tipoProducto
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    // Método de la interfaz ProductType
    @Override
    public String getType() {
        return tipoProducto;
    }
}
