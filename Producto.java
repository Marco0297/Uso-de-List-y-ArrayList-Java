public class Producto {

    private Long id;
    private String modelo;
    private String tipo;//Si es TV, COMPU o CONSOLA
    private String color;
    private Double precio;
    private Integer stock;

    public Producto(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", modelo=" + modelo +
                ", tipo=" + tipo +
                ", color=" + color+
                ", precio=" + precio +
                ", stock=" + stock;
    }
}
