package cl.laboratoria.model;

public class Ropa extends Producto{
    protected String categoriaRopa;
    protected String talla;
    protected String color;

    /**
     * Constructor del objeto tipo producto.
     *
     * @param categoria   hace referencia al tipo de producto
     * @param precio      es el precio.
     * @param nombre      como se indica a su nombre identificatorio.
     * @param descripcion detalle del producto.
     * @param categoriaRopa detalla si es ropa de adulto o niño, hombre o mujer.
     * @param talla tamaño de prenda.
     * @param color detalla color del producto.
     */
    public Ropa(String categoria, double precio, String nombre, String descripcion, String categoriaRopa,
                String talla, String color) {
        super(categoria, precio, nombre, descripcion);
        this.categoriaRopa= categoriaRopa;
        this.talla=talla;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoriaRopa='" + categoriaRopa + '\'' +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
