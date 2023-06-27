public class Sucursal {
    // campos
    private int idSucursal;
    private String direccion;
    private String telefono;

    // consultar
    public int getIdSucursal() {
        return idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // acciones
    // crear
    public boolean setCreatedSucursal(int codSucursal, String direccionSucursal, String telefonoSucursal) {

        if (codSucursal != 0 && telefonoSucursal != "") {

            this.idSucursal = codSucursal;
            this.direccion = direccionSucursal;
            this.telefono = telefonoSucursal;
            return true;

        } else {

            return true;

        }
    }
}
