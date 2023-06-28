public class BancoByteBank {
    public static void main(String[] args) throws Exception {
        // instanciamos objetos
        Cargo cargo1 = new Cargo();
        Cargo cargo2 = new Cargo();
        Sucursal sucursal1 = new Sucursal();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        // asignamos valores a los atributos de los objetos

        cargo1.setCreatedCargo(1, "Funcionario", 0.1);
        cargo2.setCreatedCargo(2, "Gerente", 1);

        sucursal1.setCreatedSucursal(1, "San_Isidro", "+57-3720440");

        empleado1.setCreatedEmpleado("1", sucursal1, cargo1, "Oscar Silvera", "calle 85 # 100 - 105", "+57-364609", 40,
                320000);

        empleado2.setCreatedEmpleado("2", sucursal1, cargo2, "Mariluz cardona de Silvera", "calle 85 # 100 - 105",
                "+57-364609", 22,
                620000);

        System.out.println(empleado1.setBonificacionEmpleado(empleado1.getidCargo().getvalorBono()));
        System.out.println("-----------------------------------------------------");

        System.out.println(empleado2.setBonificacionEmpleado(empleado2.getidCargo().getvalorBono()));
        System.out.println("-----------------------------------------------------");

    }

    // FIXME: PASAR DEL METODO SETCREATED A LOS DOS CONSTRUCTORES UNO
    // VACIOS(DEFAULT) Y OTRO PARAMETRIZADP, CON EL OBJETIVO DE CREAR LOS OBJETOS
    // INICIALES CON CONSTRUCTORES

    // TODO: CREAR LA CLASE CONTRATISTA QUE HEREDA DE LA CLASE EMPLEADO Y CON ESTO
    // DIVIDIMOS A LOS EMPLEADOS ENTRE DIRECTOS Y CONTRATISTAS, CON ESTO VERIFICAMOS
    // EL USO DEL PILAR HERENCIA DE POO
}
