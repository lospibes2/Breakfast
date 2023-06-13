
package poo_supermarket;

import java.util.ArrayList;

public class RegistrodeVentas extends Venta{
     ArrayList<Venta> listVenta = new ArrayList<Venta>();
     
     public void agregarV(Venta v){
        this.listVenta.add(v);
    }
     
    public int cantProducCuidados(String fecha){
         int cantProducCuidados = 0;
        
         return cantProducCuidados;
        
    }
    public int cantProducPrimNec(String fecha){
         int cantProducPrimNec = 0;
        
         return cantProducPrimNec;
        
    }
}
