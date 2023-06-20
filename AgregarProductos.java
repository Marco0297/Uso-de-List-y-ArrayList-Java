import java.util.ArrayList;
import java.util.List;

public class AgregarProductos implements AgregableListas{

    /**
     * Clase para agregar productos a una lista
     */
    private List<Computadora>computadoras = new ArrayList<>();
    private List<Television>tv = new ArrayList<>();
    private List<Consola>consolas = new ArrayList<>();

    @Override
    public List<Computadora> listaCompu() {
        Computadora c = new Computadora();
        c.setNombre("Apple");
        c.setId(1l);
        c.setModelo("MackBook Air Pro");
        c.setTipo("Computadora");
        c.setColor("Blanco");
        c.setMemoria(1024);
        c.setProcesador("Machintosh");

        c.setPrecio(30000.00);
        c.setStock(10);
        computadoras.add(c);
        return computadoras;
        /*
         List<Computadora>agregarCompu = new ArrayList<>();
         agregarCompu.add(new Computadora("TODO LO QUE LLEVA EL CONSTRUCTOR")
         */
    }

    @Override
    public List<Television> listaTv() {
        Television tele = new Television();
        tele.setNombre("Samsung");
        tele.setId(2l);
        tele.setModelo("Samngung Pro");
        tele.setTipo("Television");
        tele.setColor("Negro");
        tele.setPrecio(15000.00);
        tele.setStock(3);
        tv.add(tele);
        return tv;
    }

    @Override
    public List<Consola> listaConsolas() {
        Consola con = new Consola();
        con.setNombre("PlayStation 5");
        con.setId(78l);
        con.setModelo("PlayStation 5 Slim");
        con.setTipo("Consola");
        con.setColor("Blanco");
        con.setCapacidad(850);
        con.setProcesador("Intel 9");

        con.setPrecio(13000.00);
        con.setStock(7);
        consolas.add(con);
        return consolas;
    }

}
