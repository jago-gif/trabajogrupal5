package cl.laboratoria.model;

import java.util.ArrayList;

public interface ISistema {

    void agregarProducto();
    void listar(ArrayList<Aseo>listaAseo,ArrayList<Ropa>listaRopa,ArrayList<Bebida>listaBebida);
    void editarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida);
    void eliminarProducto();


}
