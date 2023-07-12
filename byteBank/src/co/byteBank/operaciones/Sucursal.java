package co.byteBank.operaciones;

public class Sucursal {
    // campos
    private int idSucursal;
    private String direccion;
    private String telefono;

    // constructores

    public Sucursal(int codSucursal, String direccionSucursal, String telefonoSucursal) {

        this.idSucursal = codSucursal;
        this.direccion = direccionSucursal;
        this.telefono = telefonoSucursal;

    }

    // Getters y Setters

    public int getIdSucursal() {
        return idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // Otros metodos

}
