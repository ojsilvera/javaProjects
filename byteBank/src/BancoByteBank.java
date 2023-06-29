public class BancoByteBank {
        public static void main(String[] args) throws Exception {
                // instanciamos objetos y cargamos sus valores.
                Cargo cargo1 = new Cargo();
                Cargo cargo2 = new Cargo();
                Cargo cargo3 = new Cargo();

                Sucursal sucursal1 = new Sucursal();

                Empleado empleado1 = new Empleado("1", sucursal1, cargo1, "Oscar Silvera",
                                "calle 85 # 100 - 105", "+57-364609", 40,
                                320000);

                Empleado empleado2 = new Empleado("2", sucursal1, cargo2, "Mariluz cardona de Silvera",
                                "calle 85 # 100 - 105", "+57-364609", 22, 620000);

                Contratista cont1 = new Contratista(1, "Los limoncitos de ella", "cont-1",
                                sucursal1, cargo3, "Aurelio Munoz", "los pinos calle 30 # 89", "+57-3689574", 28,
                                1000000);

                cargo1.setCreatedCargo(1, "Funcionario", 0.1);
                cargo2.setCreatedCargo(2, "Gerente", 1.1);
                cargo3.setCreatedCargo(3, "Contratista", 0);

                sucursal1.setCreatedSucursal(1, "San_Isidro", "+57-3720440");

                // verificamos logica de negocio
                System.out.println(empleado1.setBonificacionEmpleado(empleado1.getidCargo().getvalorBono()));
                System.out.println("-----------------------------------------------------");

                System.out.println(empleado2.setBonificacionEmpleado(empleado2.getidCargo().getvalorBono()));
                System.out.println("-----------------------------------------------------");

                System.out.println(cont1.getidCargo().getvalorBono());
                System.out.println("-----------------------------------------------------");

                cont1.setBonificacionEmpleado(cont1.getidCargo().getvalorBono());
                System.out.println("Salario contratista1: " + cont1.getSalario());

        }

        // FIXME: PASAR DEL METODO SETCREATED A LOS DOS CONSTRUCTORES UNO
        // VACIOS(DEFAULT) Y OTRO PARAMETRIZADP, CON EL OBJETIVO DE CREAR LOS OBJETOS
        // INICIALES CON CONSTRUCTORES

}
