package poo_breakfast;

import java.util.ArrayList;

public class Pedido {

    private int nroTicket;
    private double importeP;
    private Empleado empleado;
    private Cliente cliente;
    private ArrayList<Desayuno> listDesayuno = new ArrayList();

    public Pedido(int nroTicket, Empleado empleado, Cliente cliente) {
        this.nroTicket = nroTicket;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public ArrayList<Desayuno> getListDesayuno() {
        return listDesayuno;
    }

    public boolean desayunoGratis() {
        boolean desc = false;
        if ((cliente.getCantDes() + listDesayuno.size()) > 10) {
            desc = true;
            cliente.setCantDes(0);
        }

        return desc;
    }

    public double pagoTotal() {
        double sum = 0;
        for (Desayuno desayuno : this.listDesayuno) {
            if (this.desayunoGratis()) {
                desayuno.setPrecio(0);
            }
            sum += desayuno.getPrecio();//suma de cada desayuno

        }
        cliente.setCantDes(cliente.getCantDes() + listDesayuno.size());
        return sum;
    }

    public void agregarD(Desayuno desayuno) {
        this.listDesayuno.add(desayuno);
    }

    public void cancelarD(Desayuno desayuno) {
        this.listDesayuno.remove(desayuno);
    }

    public void emitirTicket() {
        String text = "";
        text += "---------------\n";
        text += "Numero de ticket: " + this.nroTicket + "\n";
        for (Desayuno desayuno : this.listDesayuno) {
            text += "Desayuno: \n";
            text += "      " + desayuno.mostrarDatos() + "\n";

        }
        text += "---------------\n";
        text += "Total: " + this.pagoTotal();
        System.out.println(text);
    }

}
