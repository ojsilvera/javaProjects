public class Empleado {

    private String idEmpleado;
    private Sucursal idSucursal;
    private Cargo idCargo;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    private double salario;

    // Consulta de atributos entidad empleado

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public Sucursal getIdSucursal() {
        return idSucursal;
    }

    public Cargo getidCargo() {
        return idcargo;
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

    // crear empleado

    public boolean setCreatedEmpleado(String codEmpleado, Sucursal codSucursal, Cargo codCargo, String nombreEmpleado,
            String direccionEmpleado, String telefonoEmpleado, int edadEmpleado, double salarioEmpleado) {

        if (idEmpleado != "" && idSucursal != null && idCargo != null && nombre != "" && telefono != ""
                && salario != 0) {

            String idEmpleado = codEmpleado;
            Sucursal idSucursal = codSucursal;
            Cargo idCargo = codCargo;
            String nombre = nombreEmpleado;
            String direccion = direccionEmpleado;
            String telefono = telefonoEmpleado;
            int edad = edadEmpleado;
            double salario = salarioEmpleado;

            return true;

        } else {

            return false;
        }
    }

}
