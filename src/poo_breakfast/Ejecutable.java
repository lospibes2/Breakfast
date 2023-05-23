package poo_breakfast;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int contTicket = 0;
        boolean seguirP = true, cancelar = true, pedidos = true;
        Sueldo sueldoBasico = new Sueldo(50.5);
        Empleado emp1 = new Empleado("Alicia", sueldoBasico);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese su telfono: ");
        int telefono = teclado.nextInt();
        Cliente cliente = new Cliente(nombre, telefono);
        while (pedidos) {
            Pedido pedido = new Pedido(contTicket++, emp1, cliente);

            while (seguirP) {
                pedido.agregarD(menu());
                System.out.println("Desea seguir pidiendo? (si/no)");
                String respuesta = teclado.next();
                if ("si".equals(respuesta)) {
                    seguirP = true;
                } else {
                    seguirP = false;
                }
            }
            while (cancelar) {

                System.out.println("Desea cancelar algun pedido? (si/no)");
                String respuesta2 = teclado.next();
                if ("si".equals(respuesta2)) {
                    cancelar = true;
                    pedido.cancelarD(removeDesayuno(pedido));
                } else {
                    cancelar = false;
                }
            }
            pedido.emitirTicket();
            System.out.println("Desea hacer otro pedido? (si/no)");
            String respuesta3 = teclado.next();
            pedidos = "si".equals(respuesta3);
            seguirP = true;
            cancelar = true;
        }
        
    }

    public static Desayuno removeDesayuno(Pedido p) {
        String text = "Desayunos ordenados: \n";
        int index = 0;
        for (Desayuno d : p.getListDesayuno()) {
            text += index + ": " + d.mostrarDatos() + "\n";
            index++;
        }
        System.out.println(text);
        System.out.println("Elija el desayuno que desea cancelar: ");
        int opc = teclado.nextInt();
        return p.getListDesayuno().get(opc);

    }

    public static Desayuno menu() {
        ArrayList<Desayuno> desayunos = new ArrayList<>();
        desayunos.add(new Desayuno("Americano", "Bacon, Huevo frito", 50.2));
        desayunos.add(new Desayuno("Europeo", "Baguette con jamon crudo", 102.3));
        String text = "------Menu------\n";
        int index = 0;//posicion array
        for (Desayuno d : desayunos) {
            text += index + ": " + d.mostrarDatos() + "\n";
            index++;

        }
        System.out.println(text);
        System.out.println("Elija el desayuno que desee: ");
        int opc = teclado.nextInt();
        return desayunos.get(opc);
    }

}
