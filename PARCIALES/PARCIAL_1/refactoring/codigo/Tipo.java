public abstract class Tipo{
    public abstract double getPorcentaje();

    public double calcularEnvio(double subtotal){
        return subtotal * this.getPorcentaje();
    }

}
