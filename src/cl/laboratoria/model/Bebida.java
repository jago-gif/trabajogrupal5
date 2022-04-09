package cl.laboratoria.model;

public class Bebida extends Producto{
    protected int formato;
    protected boolean alcohol;
    /**
     * Constructor del objeto tipo producto.
     *
     * @param categoria   hace referencia al tipo de producto
     * @param precio      es el precio.
     * @param nombre      como se indica a su nombre identificatorio.
     * @param descripcion detalle del producto.
     */
    public Bebida(String categoria, double precio, String nombre, String descripcion, int formato,
                  boolean alcohol) {
        super(categoria, precio, nombre, descripcion);
        this.formato=formato;
        this.alcohol=alcohol;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "formato=" + formato +
                ", alcohol=" + alcohol +
                ", id=" + id +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
