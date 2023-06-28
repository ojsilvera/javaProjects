public class Cargo {

    private int idcargo;
    private String nombre;
    private double bono;

    // consultar campos del cargo
    public int getIdcargo() {
        return idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBono() {
        return bono;
    }

    // crear empleado
    public boolean setCreatedCargo(int codCargo, String nombreCargo, double valorBono) {

        if (codCargo != 0 && nombreCargo != "") {

            this.idcargo = codCargo;
            this.nombre = nombreCargo;
            this.bono = valorBono;
            return true;

        } else {

            return false;

        }
    }

}
