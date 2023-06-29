public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Empleado funcionario) {

        this.suma = (funcionario.getidCargo().getvalorBono() * funcionario.getSalario()) + this.suma;
        System.out.println("Acumulado: " + this.suma);

        return this.suma;

    }
}
