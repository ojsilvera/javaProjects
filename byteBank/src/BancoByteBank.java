public class BancoByteBank {
        public static void main(String[] args) throws Exception {
                // instanciamos objetos y cargamos sus valores.
                Cargo cargo1 = new Cargo();
                Cargo cargo2 = new Cargo();
                Cargo cargo3 = new Cargo();
                ControlBonificacion control = new ControlBonificacion();
                Sucursal sucursal1 = new Sucursal();

                cargo1.setCreatedCargo(1, "Funcionario", 0.1);
                cargo2.setCreatedCargo(2, "Gerente", 1);
                cargo3.setCreatedCargo(3, "Contratista", 0.05);

                sucursal1.setCreatedSucursal(1, "San_Isidro", "+57-3720440");

                Empleado empleado1 = new Empleado("1", sucursal1, cargo1, "Oscar Silvera",
                                "calle 85 # 100 - 105", "+57-364609", 40,
                                320000);

                control.registrarSalario(empleado1);

                Empleado empleado2 = new Empleado("2", sucursal1, cargo2, "Mariluz cardona de Silvera",
                                "calle 85 # 100 - 105", "+57-364609", 22, 620000);

                control.registrarSalario(empleado2);

                Contratista cont1 = new Contratista(1, "Los limoncitos de ella", "cont-1",
                                sucursal1, cargo3, "Aurelio Munoz", "los pinos calle 30 # 89", "+57-3689574", 28,
                                1000000);

                control.registrarSalario(cont1);

                // verificamos logica de negocio para empleado y tipo de empleado
                System.out.println(empleado1.setBonificacionEmpleado(empleado1.getidCargo().getvalorBono()));
                System.out.println("-----------------------------------------------------");

                System.out.println(empleado2.setBonificacionEmpleado(empleado2.getidCargo().getvalorBono()));
                System.out.println("-----------------------------------------------------");

                System.out.println(cont1.getidCargo().getvalorBono());
                System.out.println("-----------------------------------------------------");

                cont1.setBonificacionEmpleado(cont1.getidCargo().getvalorBono());
                System.out.println("Salario contratista1: " + cont1.getSalario());
                System.out.println("-----------------------------------------------------");

                // probando clientes y cuentas

                Cliente cliente1 = new Cliente("1", "Oscar Serrano", "N/A", "+58-3265478");
                Cliente cliente2 = new Cliente("2", "Johan Davila", "N/A", "+58-3262678");

                CuentaAhorros ca1 = new CuentaAhorros(sucursal1, cliente1, 14376817);
                ca1.depositar(100000);
                System.out.println("Saldo cuenta 1: " + ca1.getSaldo());

                CuentaAhorros ca2 = new CuentaAhorros(sucursal1, cliente2, 14256817);
                ca2.depositar(50000);
                System.out.println("saldo cuenta 2: " + ca2.getSaldo());

                // transferencia entre cuentas
                System.out.println("-----------------------------------------------------");
                ca1.transferir(20000, ca2);
                System.out.println("saldo cuenta 2: " + ca2.getSaldo());
                System.out.println("saldo cuenta 1: " + ca1.getSaldo());
                System.out.println("-----------------------------------------------------");

        }

        // FIXME: bug en la transferencia entre cuentas, se cobra comision a quien
        // deposita y quien recibe el salgo, la comision solo es para que realiza la
        // transferencia.

        // FIXME: PASAR DEL METODO SETCREATED A LOS DOS CONSTRUCTORES UNO
        // VACIOS(DEFAULT) Y OTRO PARAMETRIZADP, CON EL OBJETIVO DE CREAR LOS OBJETOS
        // INICIALES CON CONSTRUCTORES

}
