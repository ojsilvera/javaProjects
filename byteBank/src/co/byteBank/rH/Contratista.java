package co.byteBank.rH;

import co.byteBank.operaciones.Sucursal;

public class Contratista extends Empleado {
    // campos
    private int idEmpresa;
    private String nombreEmpresa;
    // private Empleado idJefeDirecto;

    // Constructores
    public Contratista() {
        super();
    }

    public Contratista(int codEmpresa, String nombreEmpresaContratista, String idEmpleado, Sucursal idSucursal,
            Cargo idCargo, String nombre, String direccion, String telefono, int edad, double salario) {

        super(idEmpleado, idSucursal, idCargo, nombre, direccion, telefono, edad, salario);

        this.idEmpresa = codEmpresa;
        this.nombreEmpresa = nombreEmpresaContratista;
    }

    // Getters y Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    // Metodos
}
