public class Television extends Producto{
    private String nombre;

    public Television(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\tTELEVISION:\n"+"Nombre:" + nombre+", " + super.toString()+"\n";
    }
}
