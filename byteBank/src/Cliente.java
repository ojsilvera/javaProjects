public class Cliente {
    private String idTitular;
    private String nombre;
    private String direccion;
    private String telefono;

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

    // metodo para crear un cliente nuevo
    public boolean setCreateCliente(String idTitular, String nombre, String direccion, String telefono) {

        if (idTitular != "" && nombre != "") {

            // asignando datos del cliente
            this.idTitular = idTitular;
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;

            // valor retornado al crear el cliente
            return true;

        } else {

            // valor retornado al no crear el cliente
            return false;

        }
    }
}
