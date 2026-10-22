public class Residente extends Cliente {
    private String direccionResidente;

    public Residente(String nombre, String correoElectronico, String documentoIdentidad, String direccionResidente) {
        super(nombre, correoElectronico, documentoIdentidad);
        this.direccionResidente = direccionResidente;
    }

    public String getDireccionResidente() {
        return direccionResidente;
    }

    public void setDireccionResidente(String direccionResidente) {
        this.direccionResidente = direccionResidente;
    }
}
