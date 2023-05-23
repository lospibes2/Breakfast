/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_breakfast;

/**
 *
 * @author julie
 */
public class Cliente extends Persona{

    private int cantDes;
    private int telefono;
   

    public Cliente(String nombre, int telefono) {
        super(nombre);
        this.cantDes = 0;
        this.telefono = telefono;
    }

    public int getCantDes() {
        return cantDes;
    }

    public void setCantDes(int cantDes) {
        this.cantDes = cantDes;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    

    public String emitir() {
        return super.emitir() + " Cantidad Desayunos: " + cantDes + "Telefono: " + telefono;
    }
}
