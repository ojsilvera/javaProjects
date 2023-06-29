public class Empleado {

    private String idEmpleado;
    private Sucursal idSucursal;
    private Cargo idCargo;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    private double salario;

    // constructor en blanco

    public Empleado() {

    }

    // Constructor parametrizado

    public Empleado(String codEmpleado, Sucursal codSucursal, Cargo codCargo, String nombreEmpleado,
            String direccionEmpleado, String telefonoEmpleado, int edadEmpleado, double salarioEmpleado) {

        this.idEmpleado = codEmpleado;
        this.idSucursal = codSucursal;
        this.idCargo = codCargo;
        this.nombre = nombreEmpleado;
        this.direccion = direccionEmpleado;
        this.telefono = telefonoEmpleado;
        this.edad = edadEmpleado;
        this.salario = salarioEmpleado;

    }

    // Consulta de atributos entidad empleado

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public Sucursal getIdSucursal() {
        return idSucursal;
    }

    public Cargo getidCargo() {
        return idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSalario() {
        return salario;
    }

    // aplicar bonificaciones por cargo

    public double setBonificacionEmpleado(double valorBonificacion) {

        return this.salario = this.salario + (this.salario * valorBonificacion);

    }

}
