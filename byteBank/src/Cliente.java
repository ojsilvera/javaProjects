public class Cliente {
    private String idTitular;
    private String nombre;
    private String direccion;
    private String telefono;

    // metodo para crear un cliente nuevo
    public Cliente(String idTitular, String nombre, String direccion, String telefono) {

        // asignando datos del cliente
        this.idTitular = idTitular;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    // consultamos datos puntuales del cliente con los get
    public String getIdTitular() {
        return idTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

}
