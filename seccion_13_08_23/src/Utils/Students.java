package Utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ambiente 209-2
 */
public class Students {
   
    private String Nivel;
    private double Promedio;
    private int MateriasReprobadas;

    public Students(String nivel, double Promedio, int MateriasReprobadas) {
        this.Nivel = nivel;
        this.Promedio = Promedio;
        this.MateriasReprobadas = MateriasReprobadas;
    }

    public String getNivel() {
        return Nivel;
    }

    public double getPromedio() {
        return Promedio;
    }

    public int getMateriasReprobadas() {
        return MateriasReprobadas;
    }
}


