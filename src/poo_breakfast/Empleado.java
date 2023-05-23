package poo_breakfast;

import java.util.Random;


public class Empleado extends Persona {

    private Sueldo sueldoB;

    public Empleado(String nombre, Sueldo sueldoB) {
        super(nombre);
        this.sueldoB = sueldoB;
        Random random = new Random();
        sueldoB = random.nextInt(98001 - 84000) + 84000;
    }

    public Sueldo getSueldoB() { 
        return sueldoB;
    }

    public void setSueldoB(Sueldo sueldoB) {
        this.sueldoB = sueldoB;
    }
}

