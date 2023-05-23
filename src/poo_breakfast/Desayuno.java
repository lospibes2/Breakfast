
package poo_breakfast;

public class Desayuno {

    private String nombreD;
    private String tipoD;
    private double precio;

    public Desayuno(String nombreD, String tipoD, double precio) {
        this.nombreD = nombreD;
        this.tipoD = tipoD;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombreD + " Tipo de desayuno: " + tipoD + " Precio: " + precio;

    }

}
