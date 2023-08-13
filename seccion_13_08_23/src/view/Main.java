package view;





import Utils.Students;
import Utils.TuitionCalcular;
import Utils.fuctionString;
import Utils.fuctionNumeric;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ambiente 209-2
 */
public class Main {
    public static void main(String[] args) {
        fuctionString fs = new fuctionString();
            fuctionNumeric fn = new fuctionNumeric();
            Students s = new Students(fs.InputScanner("escriba el tipo de colegiatura"), fn.InputScanner("escriba el promedio"), 0);
            TuitionCalcular c = new TuitionCalcular();
        
        
                
        } 
}
             


