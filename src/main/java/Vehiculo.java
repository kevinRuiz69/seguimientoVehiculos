public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String añoFabricacion;
    private double tarifaBase;
    private boolean estado;

    public Vehiculo(String placa, String modelo, String marca, String añoFabricacion, double tarifaBase, boolean estado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
        this.tarifaBase = tarifaBase;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public abstract double calcularDiferencia ();
}
