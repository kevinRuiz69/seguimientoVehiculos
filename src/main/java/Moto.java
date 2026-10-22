public class Moto extends Vehiculo{
    private String cilindraje;

    public Moto(String placa, String modelo, String marca, String añoFabricacion, double tarifaBase, boolean estado, String cilindraje) {
        super(placa, modelo, marca, añoFabricacion, tarifaBase, estado);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public double calcularDiferencia (){
        return getTarifaBase()*0.9;
    }
}
