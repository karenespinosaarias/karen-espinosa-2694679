
package Class;


public class Ejercicio2 extends Class{

    @Override
    public void Logica() {
        if(Math.pow(this.getNum(), 2)>5000){
            System.out.println("El cuadrado es "+Math.pow(this.getNum(),2)+" y es mayor a 5000.");
        }else{
             System.out.println("El cuadrado es "+Math.pow(this.getNum(),2)+" y es menor a 5000.");
        }
    }
    
}
