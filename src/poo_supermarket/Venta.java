
package poo_supermarket;

import java.util.ArrayList;


public class Venta {
    protected double precio;
    protected String fecha;
    protected Cliente cli;
    ArrayList<Producto> listProd = new ArrayList<Producto>();

    public Venta(double precio, String fecha, Cliente cli) {
        this.precio = precio;
        this.fecha = fecha;
        this.cli = cli;
    }
     
}
