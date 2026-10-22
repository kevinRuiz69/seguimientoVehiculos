public class Camioneta extends Vehiculo {
    private String capacidadCarga;

    public Camioneta(String placa, String modelo, String marca, String añoFabricacion, double tarifaBase, boolean estado, String capacidadCarga) {
        super(placa, modelo, marca, añoFabricacion, tarifaBase, estado);
        this.capacidadCarga = capacidadCarga;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularDiferencia() {
        return getTarifaBase()+50000;
    }
}
