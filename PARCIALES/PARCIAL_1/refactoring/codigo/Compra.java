public class Compra{
    private List<Producto> productos;
    private double subtotal;
    private double envio;
    private String estado;

    public Compra(List<Producto> productos, Tipo tipo){
        this.productos = productos;
        this.subtotal = this.calcularSubtotal();
        this.envio = tipo.calcularEnvio(subtotal);
        this.estado = "...";
    }

    private double calcularSubtotal(){
        return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }

}