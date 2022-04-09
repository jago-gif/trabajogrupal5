package cl.laboratoria.main;

import cl.laboratoria.model.Aseo;
import cl.laboratoria.model.Bebida;
import cl.laboratoria.model.ISistema;
import cl.laboratoria.model.Ropa;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema extends Main implements ISistema {
    @Override
    public void agregarProducto() {

    }


    public void listar(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida) {
    for (int i=0; i<listaAseo.size(); i++){
        System.out.println(listaAseo.get(i).toString());
    }
    for (int r=0; r<listaRopa.size(); r++){
            System.out.println(listaRopa.get(r).toString());
    }
    for (int b=0; b<listaBebida.size(); b++){
        System.out.println(listaBebida.get(b).toString());
    }
    }


    @Override
    public void editarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida) {
        Scanner scan = new Scanner(System.in);
        System.out.println("desea editar un producto de");
        System.out.println("[1]  Aseo");
        System.out.println("[2]  Ropa");
        System.out.println("[3]  Bebidas");
        String opcion = scan.nextLine();
        int ingresar=0;
        try {
            ingresar = Integer.parseInt(opcion);
        } catch (NumberFormatException ex) {
            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
            ingresar = 100;
        }
        if (ingresar == 1){
            System.out.println("seleccione el id del producto que desea editar");
            opcion= scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            for (int i=0; i<listaAseo.size(); i++){
                if (listaAseo.get(i).getId()==ingresar){
                    opcion = scan.nextLine();
                    System.out.println("escriba SI para cambiar el precio ");
                    opcion = scan.nextLine().toUpperCase();
                    if (opcion.equals("SI")){
                        System.out.println("que valor tendrá ahora");
                        opcion = scan.nextLine();
                        try {
                            ingresar = Integer.parseInt(opcion);
                        } catch (NumberFormatException ex) {
                            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                            ingresar = 100;
                        }
                        listaAseo.get(i).setPrecio(ingresar);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    opcion = scan.nextLine();
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setNombre(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI cambiar el Tipo de aseo ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que tipo va a ser ahora");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setTipoDeAseo(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }

                }
            }

        }else if (ingresar== 2){
            System.out.println("seleccione el id del producto que desea editar");
            opcion= scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            for (int i=0; i<listaRopa.size(); i++){
                if (listaRopa.get(i).getId()==ingresar){
                    opcion = scan.nextLine();
                    System.out.println("escriba SI para cambiar el precio ");
                    opcion = scan.nextLine().toUpperCase();
                    if (opcion.equals("SI")){
                        System.out.println("que valor tendrá ahora");
                        opcion = scan.nextLine();
                        try {
                            ingresar = Integer.parseInt(opcion);
                        } catch (NumberFormatException ex) {
                            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                            ingresar = 100;
                        }
                        listaRopa.get(i).setPrecio(ingresar);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    opcion = scan.nextLine();
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setNombre(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI cambiar el Categoria de Ropa ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setCategoriaRopa(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }

                    System.out.println("escriba SI cambiar el la talla ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setTalla(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }

                    System.out.println("escriba SI cambiar el color de Ropa ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setColor(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                }
            }

        }else if(ingresar == 3){
            System.out.println("seleccione el id del producto que desea editar");
            opcion= scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            for (int i=0; i<listaBebida.size(); i++){
                if (listaBebida.get(i).getId()==ingresar){
                    opcion = scan.nextLine();
                    System.out.println("escriba SI para cambiar el precio ");
                    opcion = scan.nextLine().toUpperCase();
                    if (opcion.equals("SI")){
                        System.out.println("que valor tendrá ahora");
                        opcion = scan.nextLine();
                        try {
                            ingresar = Integer.parseInt(opcion);
                        } catch (NumberFormatException ex) {
                            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                            ingresar = 100;
                        }
                        listaBebida.get(i).setPrecio(ingresar);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    opcion = scan.nextLine();
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaBebida.get(i).setNombre(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaBebida.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI cambiar el Tipo de aseo ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que tipo va a ser ahora");
                        opcion = scan.nextLine();
                        try {
                            ingresar = Integer.parseInt(opcion);
                        } catch (NumberFormatException ex) {
                            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                            ingresar = 100;
                        }
                        listaBebida.get(i).setFormato(ingresar);
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }
                    System.out.println("escriba SI para editar si contiene alcohol ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba [SI], si contiene alcohol o [NO]si no contiene");
                        opcion = scan.nextLine().toUpperCase();
                        if (opcion.equals("SI")){
                            listaBebida.get(i).setAlcohol(true);
                        }else if(opcion.equals("NO")){
                            listaBebida.get(i).setAlcohol(false);
                        }else {
                            System.out.println("no escribio una alternativa valida");
                        }
                    }else {
                        System.out.println("debe escribir si no dije oiga");
                    }

                }
            }


        }else {
            System.out.println("opcion no valida");
        }



    }

    @Override
    public void eliminarProducto() {

    }
}
