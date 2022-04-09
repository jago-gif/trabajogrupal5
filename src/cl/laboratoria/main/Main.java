package cl.laboratoria.main;

import java.util.ArrayList;
import java.util.Scanner;
import cl.laboratoria.model.*;

public class Main implements Imain{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu2;


        ArrayList<Aseo>listaAseo = new ArrayList<>();
        ArrayList<Ropa>listaRopa = new ArrayList<>();
        ArrayList<Bebida>listaBebida = new ArrayList<>();

        listaAseo.add(new Aseo("Aseo",3000,"cloromaxi3000",
                "Cloro multiuso muy bueno","Aseo General"));
        listaAseo.add(new Aseo("Aseo",2000,"Oralb",
                "dentrifrico oralb 250 gr","Aseo Personal"));
        listaRopa.add(new Ropa("Vestuario",10000,"polera","polera marca adidas",
                "HombreAdulto","XL","blanco con negro y azul con una pizca de amarillo"));
        listaRopa.add(new Ropa("Vestuario",45000,"polera","polera generica",
                "Mujer Adulto","m","Rosado"));
        listaBebida.add(new Bebida("Bebida",1000,"cachantun","agua mineral",500,
                false));
        listaBebida.add(new Bebida("Bebida",1500,"cachantun","agua mineral + granada",
                1500,false));

        do {
            String ingresar = scan.nextLine();
            try {
                menu2 = Integer.parseInt(ingresar);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                menu2 = 100;
            }
            switch (menu2){
                case OPCION_MENU_AGREGAR:{

                    break;
                }
                case OPCION_MENU_LISTAR:{
                    Sistema listar1 = new Sistema();
                    listar1.listar(listaAseo, listaRopa, listaBebida);
                    break;
                }
                case OPCION_MENU_EDITAR:{
                    Sistema editar = new Sistema();
                    editar.editarProducto(listaAseo, listaRopa, listaBebida);
                    break;
                }
                case OPCION_MENU_ELIMINAR:{

                }
            }

        }while (menu2 !=OPCION_MENU_SALIR);






    }
}
