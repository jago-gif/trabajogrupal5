package cl.laboratoria.model;

public class Aseo extends Producto{

    protected String tipoDeAseo;


    /**
     * Constructor del objeto tipo producto.
     *
     * @param categoria   hace referencia al tipo de producto
     * @param precio      es el precio.
     * @param nombre      como se indica a su nombre identificatorio.
     * @param descripcion detalle del producto.
     * @param tipoDeAseo detalla si es un producto de aseo personal o general.
     */
    public Aseo( String categoria, double precio, String nombre, String descripcion, String tipoDeAseo) {
        super(categoria, precio, nombre, descripcion);
        this.tipoDeAseo = tipoDeAseo;
    }

    public String getTipoDeAseo() {
        return tipoDeAseo;
    }

    public void setTipoDeAseo(String tipoDeAseo) {
        this.tipoDeAseo = tipoDeAseo;
    }

    @Override
    public String toString() {
        return "Aseo     " +
                "tipoDeAseo='" + tipoDeAseo + '\'' +
                ", id=" + id +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' ;
    }
}
