
package Class;


public class Ejercicio10 extends Class{
    private Double num2;

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    @Override
    public void Logica() {
        if(this.getNum()>this.getNum2()){
            System.out.println("El primer numero es mayor: "+this.getNum());
        }else{
            System.out.println("El segundo numero es mayor: "+this.getNum2());
        }
    }

    @Override
    public void Lectura() {
        System.out.println("Ingrese dos numeros:");
        this.setNum(scan.nextDouble());
        this.setNum2(scan.nextDouble());
    }
    
}
