package Utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ambiente 209-2
 */
public class fuctionNumeric {
     private Double numero;

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }
    
    //Validar la captura de cualquier nuemro real
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        fuctionString fs = new fuctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }    
    
    //Capturar cualquier real por Scanner
    public Double InputDoubleNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }
    
    //Capturar cualquier real por JOptionPane
    public Double InputDoubleNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }

    public double InputStringNumericScanner(String escriba_el_promedio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double InputScanner(String escriba_el_promedio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
    

}