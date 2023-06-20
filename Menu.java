import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    public void menuProductos(){
        Scanner lee = new Scanner(System.in);
        Integer op;
        do {
            Utilidades util = new Utilidades();
            String tipo;
            System.out.println("1-.Ver Productos\n" +
                    "2-.Buscar Producto\n" +
                    "3-.Eliminar Producto\n" +
                    "4-.Tamanio de Listas de Producto\n");
            op = lee.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\t\nPRODUCTOS EN LISTA");
                    util.verListas();
                    break;
                case 2:
                    Scanner tec = new Scanner(System.in);
                    System.out.println("\t\nBUSCAR PRODUCTOS EN LISTA");
                    System.out.println("Ingresa que producto deseas encontrar: (Computadora, Television o Consola): ");
                    tipo = tec.nextLine();
                    util.encontrarlista(tipo);
                    break;
                case 3:
                    System.out.println("\t\nELIMINAR PRODUCTOS EN LISTA");
                    util.eliminarList();
                    break;
                case 4:
                    System.out.println("\t\nTAMANIO DE LAS LISTAS");
                    util.tamListas();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Error de opcion.\nIntente de nuevo");
            }
        }while(op != 5);
    }
}
