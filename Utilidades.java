import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.util.*;

public class Utilidades {
    AgregarProductos productos = new AgregarProductos();
    Scanner lee = new Scanner(System.in);

    public void verListas(){
        Iterator iterTv = productos.listaTv().iterator();
        Iterator iterConsola = productos.listaConsolas().iterator();
        Iterator iterCompu = productos.listaCompu().iterator();
        while(iterTv.hasNext() && iterConsola.hasNext() && iterCompu.hasNext()){
            System.out.println(new StringBuilder().append(iterCompu.next().toString()).append(iterTv.next().toString()).append(iterConsola.next().toString()));
        }
    }
    public void tamListas(){
        System.out.println("Tamaño de lista de Computadoras= "+productos.listaCompu().size());
        System.out.println("Tamaño de lista de Televisores= "+productos.listaTv().size());
        System.out.println("Tamaño de lista de Consolas= "+productos.listaConsolas().size());
    }
    public void eliminarList(){
        System.out.println("Que lista desea eliminar?\n1-.Computadoras\n2-.Television\n3-.Consola");
        Integer op = lee.nextInt();
        Producto search;
        switch (op){
            case 1:
                String tipo = "Computadora";
                for(int i = 0; i<productos.listaCompu().size(); i++){
                    if(productos.listaCompu().get(i).getTipo() == tipo){
                        productos.listaCompu().remove(i);
                        System.out.println("Se ha eliminado");
                        break;
                    }
                }
                //productos.listaCompu().remove("tipo");
                break;
            case 2:
                productos.listaTv().remove(1);
                break;
            case 3:
                productos.listaConsolas().remove(1);
                break;
            default:
                System.out.println("Producto no encontrado\nTrata de nuevo");
        }
    }
    public void encontrarlista(String tipo){
        Producto search;
        switch (tipo){
            case "Computadora":
                System.out.println("Computadoras");
                search= productos.listaCompu().stream()
                        .filter(producto -> producto.getTipo().equals(tipo))
                        .limit(1)
                        .findFirst().orElse(null);
                System.out.println("Busqueda:\n"+search);
                break;
            case "Consola":
                System.out.println("Consolas");
                search = productos.listaConsolas().stream()
                        .filter(producto -> producto.getTipo().equals(tipo))
                        .limit(1)
                        .findFirst().orElse(null);
                System.out.println("Busqueda:\n"+search);
                break;
            case "Television":
                System.out.println("Television");
                search = productos.listaTv().stream()
                        .filter(producto -> producto.getTipo().equals(tipo))
                        .limit(1)
                        .findFirst().orElse(null);
                System.out.println("Busqueda:\n"+search);
                break;
            default:
                System.out.println("Opcion no se ecuentra en Produccion");
        }
    }
}
