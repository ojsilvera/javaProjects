package co.byteBank.rH;

public class Cargo {

    // Campos propios

    private int idcargo;
    private String nombre;
    private double valorBono;

    // Constructores

    public Cargo(int codCargo, String nombreCargo, double valorBono) {

        this.idcargo = codCargo;
        this.nombre = nombreCargo;
        this.valorBono = valorBono;
    }

    // Getters y Setters

    public int getIdcargo() {
        return idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getvalorBono() {
        return valorBono;
    }

    // Otros metodos

}
