public class Computadora extends Producto{
    private String nombre;
    private String procesador;
    private Integer memoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "\tComputadora:\n"+"Nombre:" + nombre+", " + super.toString()+" Memoria="+memoria +" Procesador="+procesador+"\n";
    }
}
