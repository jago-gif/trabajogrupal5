package cl.laboratoria.model;
/**
 * Clase padre de de Productos con todos elementos básicos.
 *
 * @author Javier Garrido
 * @since 1.0
 * static sum es un valor que se agregó para que sea autoincrementable el id;
 */

//Aseo, ropa, bebestibles

public class Producto {
    protected int id;
    protected String categoria;
    protected double precio;
    protected String nombre;
    protected String descripcion;
    public static int sum = 1;


    /**
 *
 * Constructor del objeto tipo producto.
 *
 * @param categoria hace referencia al tipo de producto
 * @param precio es el precio.
 * @param nombre como se indica a su nombre identificatorio.
 * @param descripcion detalle del producto.
 */
    public Producto(String categoria, double precio, String nombre, String descripcion) {
        this.id = sum++;
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
