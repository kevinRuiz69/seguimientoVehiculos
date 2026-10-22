import java.util.List;

public class AutoRent {
    private String codigo;
    private String nombre;
    private String direccion;
    private List<Cliente> listaClientes;
    private List<Alquiler> listaAlquileres;
    private List<Vehiculo> listaVehiculos;

    public AutoRent(String codigo, String nombre, String direccion, List<Cliente> listaClientes, List<Alquiler> listaAlquileres, List<Vehiculo> listaVehiculos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaClientes = listaClientes;
        this.listaAlquileres = listaAlquileres;
        this.listaVehiculos = listaVehiculos;
    }

    public AutoRent(String codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void agregarCLiente(Cliente cliente){
        listaClientes.add(cliente);
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    public void agregarAlquiler(Alquiler alquiler){
        listaAlquileres.add(alquiler);
    }
}
