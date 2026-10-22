public class Alquiler {
    private String fecha;
    private int dias;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(String fecha, int dias, Cliente cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.dias = dias;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public double calcularValorTotal(Vehiculo vehiculo){
        double total= vehiculo.calcularDiferencia()*dias;
        return total;
    }
}
