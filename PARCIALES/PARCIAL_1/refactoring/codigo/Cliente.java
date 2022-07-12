public class Cliente{
    private String nombre;
    private Tipo tipo;
    private List<Compra> compras;

    public Cliente(String unNombre){
        this.nombre = unNombre;
        this.tipo = new Basico();
        this.compras = new ArrayList<Compra>();
    }
    
    public Compra comprar(List<Producto> productos){
        Compra n = new Compra(productos, this.tipo);
        this.compras.add(n);
        this.actualizarTipo();
        return n;
    }
    public void actualizarTipo(){
        if(this.montoAcumuladoEnCompras() > 10000){
            this.tipo = new Advance();
        }else if(this.montoAcumuladoEnCompras() > 5000){
            this.tipo = new Premium();
        }
    }

    public double montoAcumuladoEnCompras(){...}

}