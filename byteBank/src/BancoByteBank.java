public class BancoByteBank {
    public static void main(String[] args) throws Exception {
        // instanciamos objetos
        Cargo cargo1 = new Cargo();
        Cargo cargo2 = new Cargo();
        Sucursal sucursal1 = new Sucursal();
        Empleado empleado1 = new Empleado();
        // Empleado empleado2 = new Empleado();

        // asignamos valores a los atributos de los objetos
        cargo1.setCreatedCargo(1, "Funcionario", 0.1);
        cargo2.setCreatedCargo(1, "Gerente", 1);

        sucursal1.setCreatedSucursal(1, "San_Isidro", "+57-3720440");

        empleado1.setCreatedEmpleado("1", sucursal1, cargo1, "Oscar Silvera", "calle 51 # 26 - 89", "+57-364609", 40,
                320000);

        System.out.println(empleado1.getNombre());
    }
}
