public class Cliente {

    // campos asociados al dominio de la clase cliente
    private String nombre;
    private String documento;
    private String telefono;

    public boolean setCliente(String nombre, String documento, String telefono) {

        if (nombre != null && documento != null && telefono != null) {

            this.nombre = nombre;
            this.documento = documento;
            this.telefono = telefono;

            return true;

        }

        return false;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

}
