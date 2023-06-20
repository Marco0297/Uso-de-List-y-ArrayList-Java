public class Consola extends Producto{
    private String nombre;
    private String procesador;
    private Integer capacidad;

    public Consola(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "\tConsola:\n"+"Nombre:" + nombre+", " + super.toString()+" Memoria="+capacidad +" Procesador="+procesador+"\n";
    }
}
