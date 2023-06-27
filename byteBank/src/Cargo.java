public class Cargo {

    private int idcargo;
    private String nombre;

    public int getIdcargo() {
        return idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setCreatedCargo(int codCargo, String nombreCargo) {

        if (codCargo != 0 && nombreCargo != "") {

            this.idcargo = codCargo;
            this.nombre = nombreCargo;
            return true;

        } else {

            return false;

        }
    }

}
