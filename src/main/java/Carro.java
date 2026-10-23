public class Carro extends Vehiculo{
    private String puertas;

    public Carro(String placa, String modelo, String marca, String añoFabricacion, double tarifaBase, boolean estado, String puertas) {
        super(placa, modelo, marca, añoFabricacion, tarifaBase, estado);
        this.puertas = puertas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public double calcularDiferencia() {
        return getTarifaBase()+20000;
    }


}
