
package poo_breakfast;

public class Sueldo {
    // ATRIBUTOS
   private double sueldoB; 
  
    public Sueldo(double sueldoB) {
        this.sueldoB = sueldoB;
    }
   
    public double calcSueldoN() {
        double sn = 0.0;
        sn=this.sueldoB -(this.sueldoB * 0.11) - (this.sueldoB * 0.03) + (this.sueldoB * 0.10);
        
        return  sn;

    }
    public double emitirSueldo(){
       return calcSueldoN();
       System.out.println("Sueldo sin modificar: $" + this.sueldoB " Sueldo modificado: $" + this.calcSueldoN());
       
    }
}