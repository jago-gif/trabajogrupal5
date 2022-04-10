package cl.laboratoria.model;

import java.util.ArrayList;

public interface ISistema {

    void agregarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida);
    void listar(ArrayList<Aseo>listaAseo,ArrayList<Ropa>listaRopa,ArrayList<Bebida>listaBebida);
    void editarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida);
    void eliminarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida);


}
