package cl.laboratoria.main;

import cl.laboratoria.model.Aseo;
import cl.laboratoria.model.Bebida;
import cl.laboratoria.model.ISistema;
import cl.laboratoria.model.Ropa;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema implements ISistema {
    @Override
    public void agregarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba el numero de la categoria en donde desea agregar un articulo");
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
        if (ingresar==1){
            String tipoDeAseo;
            String categoria = "Aseo";
            double precio;
            String nombre;
            String descripcion;
            System.out.println("Escriba el nombre del producto");
            opcion= scan.nextLine();
            nombre = opcion;
            System.out.println("Escriba el tipo de aseo del producto");
            opcion=scan.nextLine();
            tipoDeAseo=opcion;
            System.out.println("Escriba la descripcion del producto");
            opcion=scan.nextLine();
            descripcion=opcion;
            System.out.println("Escriba el valor del producto");
            opcion = scan.nextLine();;
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            precio= ingresar;
            if (tipoDeAseo == "" ||precio==0|| nombre == "" || descripcion == ""){
                System.out.println("falta definir alguno de los datos");
            }else {
                listaAseo.add(new Aseo(categoria,precio,nombre,descripcion,tipoDeAseo));
                System.out.println("has agregado un nuevo producto satisfactoriamente");
            }
        }else if (ingresar==2){
            String categoria = "Ropa";
            double precio;
            String nombre;
            String descripcion;
            String categoriaRopa;
            String talla;
            String color;
            System.out.println("Escriba el nombre del producto");
            opcion= scan.nextLine();
            nombre = opcion;
            System.out.println("Escriba la categoria correspondiente");
            opcion=scan.nextLine();
            categoriaRopa=opcion;
            System.out.println("Escriba la descripcion del producto");
            opcion=scan.nextLine();
            descripcion=opcion;
            System.out.println("Escriba el color de la prenda");
            opcion=scan.nextLine();
            color=opcion;
            System.out.println("Escriba la talla");
            opcion=scan.nextLine();
            talla=opcion;
            System.out.println("Escriba el valor del producto");
            opcion = scan.nextLine();;
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            precio= ingresar;
            if (categoriaRopa == "" ||precio==0|| nombre == "" || descripcion == ""||color==""||talla==""){
                System.out.println("falta definir alguno de los datos");
            }else {
                listaRopa.add(new Ropa(categoria,precio,nombre,descripcion,categoriaRopa,talla,color));
                System.out.println("has agregado un nuevo producto satisfactoriamente");
            }
        }else if (ingresar==3){
            //bebidas
            String categoria = "Ropa";
            double precio;
            String nombre;
            String descripcion;
            int formato;
            boolean alcohol=false;
            System.out.println("Escriba el nombre del producto");
            opcion= scan.nextLine();
            nombre = opcion;
            System.out.println("Escriba la descripcion del producto");
            opcion=scan.nextLine();
            descripcion=opcion;
            System.out.println("Escriba el precio");
            opcion=scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            precio= ingresar;
            System.out.println("Tamaño en cc");
            opcion=scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            formato=ingresar;
            System.out.println("escriba [1] si contiene alcohol o [2] si no tiene alcohol");
            opcion=scan.nextLine();
            try {
                ingresar = Integer.parseInt(opcion);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                ingresar = 100;
            }
            if (ingresar==1){
                alcohol=true;
                System.out.println("su bebida contiene alcohol");
            }else if (ingresar==2){
                alcohol=false;
                System.out.println("su bebida No contiene alcohol");
            }

            if (precio==0|| nombre == "" || descripcion == ""||formato==0){
                System.out.println("falta definir alguno de los datos");
            }else {
                listaBebida.add(new Bebida(categoria,precio,nombre,descripcion,formato,alcohol));
                System.out.println("has agregado un nuevo producto satisfactoriamente");
            }

        }else {
            System.out.println("opcion no valida");
        }
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
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setNombre(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI cambiar el Tipo de aseo ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que tipo va a ser ahora");
                        opcion = scan.nextLine();
                        listaAseo.get(i).setTipoDeAseo(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }

                }
                System.out.println("A terminado la modificacion");
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
                            System.out.println("No realizo modificacion");
                                           }
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setNombre(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI cambiar el Categoria de Ropa ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setCategoriaRopa(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }

                    System.out.println("escriba SI cambiar el la talla ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setTalla(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }

                    System.out.println("escriba SI cambiar el color de Ropa ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("escriba que categoria va a ser ahora");
                        opcion = scan.nextLine();
                        listaRopa.get(i).setColor(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                }
                System.out.println("a terminado la modificacion");
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
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI cambiar el Nombre ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba el nuevo nombre");
                        opcion = scan.nextLine();
                        listaBebida.get(i).setNombre(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
                    }
                    System.out.println("escriba SI para cambiar la descripcion ");
                    opcion = scan.nextLine().toUpperCase();
                    if(opcion.equals("SI")) {
                        System.out.println("Escriba la nueva descripcion");
                        opcion = scan.nextLine();
                        listaBebida.get(i).setDescripcion(opcion);
                    }else {
                        System.out.println("No realizo modificacion");
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
                        System.out.println("No realizo modificacion");
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
                    }

                }
                System.out.println("a terminado la modificacion");
            }


        }else {
            System.out.println("opcion no valida");
        }

    }

    @Override
    public void eliminarProducto(ArrayList<Aseo> listaAseo, ArrayList<Ropa>listaRopa, ArrayList<Bebida>listaBebida) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba el id del producto que desea eliminar");
        String opcion = scan.nextLine();
        int ingresar=0;
        try {
            ingresar = Integer.parseInt(opcion);
        } catch (NumberFormatException ex) {
            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
            ingresar = 100;
        }
        for (int i=0; i<listaAseo.size(); i++){
            if (listaAseo.get(i).getId()==ingresar){
                listaAseo.remove(i);
                System.out.println("articulo eliminaro");
            }
        }
        for (int r=0; r<listaRopa.size(); r++){
            if (listaRopa.get(r).getId()==ingresar){
                listaRopa.remove(r);
                System.out.println("articulo eliminaro");
            }
        }
        for (int b=0; b<listaBebida.size(); b++){
            if (listaBebida.get(b).getId()==ingresar){
                listaBebida.remove(b);
                System.out.println("articulo eliminaro");
            }
        }

    }


}
