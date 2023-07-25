/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

/**
 *
 * @author Ambiente 209-2
 */
public class TiempoC {
    private Double lunes;
    private Double miercoles;
    private Double viernes;
   private Double promedio;
   
   public TiempoC (){
   }

    public Double getLunes() {
        return lunes;
    }

    public Double getMiercoles() {
        return miercoles;
    }

    public Double getViernes() {
        return viernes;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setLunes(Double lunes) {
        this.lunes = lunes;
    }

    public void setMiercoles(Double miercoles) {
        this.miercoles = miercoles;
    }

    public void setViernes(Double viernes) {
        this.viernes = viernes;
    }

    private void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
   public Double mostrar(){
       this.setPromedio((this.getLunes()+this.getMiercoles()+this.getViernes())/3);
   return this.getPromedio();
   
   
   }
   
    
}
