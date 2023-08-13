package Utils;


import Utils.Students;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ambiente 209-2
 */
public class TuitionCalcular {
    private static final double Costo_Preparatoria = 180.0;
    private static final double Costo_profecional = 300.0;

    private static final int UNIDADES_POR_CINCO = 5;

    private Students estudiante;

 

    public double calcularTotalAPagar() {
        int unidadesCursadas = 0;
        double descuento = 0.0;

        if (estudiante.getNivel().equals("preparatoria")) {
            if (estudiante.getPromedio() >= 9.5) {
                unidadesCursadas = 55;
                descuento = 0.25;
            } else if (estudiante.getPromedio() >= 9.0) {
                unidadesCursadas = 50;
                descuento = 0.10;
            } else if (estudiante.getPromedio() > 7.0) {
                unidadesCursadas = 50;
                // Sin descuento
            } else {
                if (estudiante.getMateriasReprobadas() >= 0 && estudiante.getMateriasReprobadas() <= 3) {
                    unidadesCursadas = 45;
                    // Sin descuento
                } else {
                    unidadesCursadas = 40;
                    // Sin descuento
                }
            }
        } else if (estudiante.getNivel().equals("profesional")) {
            if (estudiante.getPromedio() >= 9.5) {
                unidadesCursadas = 55;
                descuento = 0.20;
            } else {
                unidadesCursadas = 55;
                // Sin descuento
            }
        }

        double costoUnidades = calcularCostoUnidades(estudiante.getNivel(), unidadesCursadas);
        double descuentoAplicado = costoUnidades * descuento;
        double totalAPagar = costoUnidades - descuentoAplicado;

        return totalAPagar;
    }

    private double calcularCostoUnidades(String nivel, int unidades) {
        double costoPorUnidad = (nivel.equals("preparatoria")) ? Costo_Preparatoria : Costo_profecional;
        return costoPorUnidad * (unidades / UNIDADES_POR_CINCO);
    }
}


