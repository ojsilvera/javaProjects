public class Cargo {

    private int idcargo;
    private String nombre;
    private double valorBono;

    // consultar campos del cargo
    public int getIdcargo() {
        return idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getvalorBono() {
        return valorBono;
    }

    // crear empleado
    public boolean setCreatedCargo(int codCargo, String nombreCargo, double valorBono) {

        if (codCargo != 0 && nombreCargo != "") {

            this.idcargo = codCargo;
            this.nombre = nombreCargo;
            this.valorBono = valorBono;
            return true;

        } else {

            return false;

        }
    }

}
