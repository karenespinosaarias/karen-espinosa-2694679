/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cronometro;

/**
 *
 * @author Ambiente 209-2
 */
public class Cronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TiempoC a = new TiempoC();
       a.setLunes(12.0);
       a.setMiercoles(11.0);
       a.setViernes(14.0);
       
        System.out.println(a.mostrar());
       
    }
    
}
