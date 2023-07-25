/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion_22_07;

/**
 *
 * @author Ambiente 209-2
 */
public class NumPulsaciones {
    private int edad;
    private double pulsaciones;

    public  NumPulsaciones() {
    }
    public int getEdad(){
        return  this.edad;
    }
    public Double getPulsaciones(){
        return this.pulsaciones;
        
    
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPulsaciones(Double pulsaciones) {
        this.pulsaciones = pulsaciones;
    }
    public Double Mostrar(){
        this.pulsaciones=((220- this.getEdad())/10);
        return this.getPulsaciones();
    }
    
    }
    

