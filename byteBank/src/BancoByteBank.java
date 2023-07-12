import co.byteBank.operaciones.Cliente;
import co.byteBank.operaciones.CuentaAhorros;
import co.byteBank.operaciones.Sucursal;
import co.byteBank.rH.Cargo;
import co.byteBank.rH.Contador;
import co.byteBank.rH.Contratista;
import co.byteBank.rH.ControlBonificacion;
import co.byteBank.rH.Gerente;
import co.byteBank.rH.Secretaria;

public class BancoByteBank {
        public static void main(String[] args) throws Exception {
                // instanciamos objetos y cargamos sus valores.
                Cargo cargo1 = new Cargo(1, "Secretaria", 0.1);
                Cargo cargo2 = new Cargo(2, "Gerente", 1);
                Cargo cargo3 = new Cargo(3, "Contratista", 0.05);
                Cargo cargo4 = new Cargo(4, "Contador", 0.05);
                Sucursal sucursal1 = new Sucursal(1, "San_Isidro", "+57-3720440");

                ControlBonificacion control = new ControlBonificacion();

                Gerente gerente1 = new Gerente("1", sucursal1, cargo2, "Oscar Silvera", "calle 85 # 100 - 105",
                                "+57-364609", 40, 320000);

                Contador contador1 = new Contador("2", sucursal1, cargo4, "Mariluz cardona",
                                "calle 85 # 100 - 105", "+57-364609", 22, 620000);

                Contratista cont1 = new Contratista(1, "Los limoncitos de ella", "cont-1",
                                sucursal1, cargo3, "Aurelio Munoz", "los pinos calle 30 # 89", "+57-3689574", 28,
                                1000000);

                Secretaria secretaria1 = new Secretaria("4", sucursal1, cargo1, "Aurelio Munoz",
                                "los pinos calle 30 # 89", "+57-3689574", 28,
                                1000000);

                System.out.println("------------------Bonificaciones acumuladas----------");

                control.registrarSalario(gerente1);
                control.registrarSalario(cont1);
                control.registrarSalario(contador1);
                control.registrarSalario(secretaria1);

                System.out.println("-----------------------------------------------------");

                // verificamos logica de negocio para empleado y tipo de empleado

                System.out.println("Bono neto emp1: "
                                + gerente1.setBonificacionEmpleado(gerente1.getidCargo().getvalorBono()));

                System.out.println("Bono neto emp2: "
                                + contador1.setBonificacionEmpleado(contador1.getidCargo().getvalorBono()));

                cont1.setBonificacionEmpleado(cont1.getidCargo().getvalorBono());
                System.out.println("Salario contratista1: " + cont1.getSalario());

                // probando clientes y cuentas

                Cliente cliente1 = new Cliente("1", "Oscar Serrano", "N/A", "+58-3265478");
                Cliente cliente2 = new Cliente("2", "Johan Davila", "N/A", "+58-3262678");

                // depositos y carga de cuentas
                CuentaAhorros ca1 = new CuentaAhorros(sucursal1, cliente1, 14376817);
                ca1.depositar(100000);

                CuentaAhorros ca2 = new CuentaAhorros(sucursal1, cliente2, 14256817);
                ca2.depositar(50000);

                // transferencia entre cuentas
                ca1.transferir(20000, ca2);

        }

        // TODO: implementar interfaces donde sea posible.

        // TODO: eliminar las clases gerente, contratista, secretaria y contador

        // TODO: aplicar los conceptos de herencia y polimorfismos con las clases
        // empleado, cargo

        // TODO: reemplazar las clases cuenta de ahorros por tipo de cuenta.

}
