/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mostrar;

import CalculadoraBasica.CalculadoraBasica;
import CalculadoraAvanzada.CalculadoraAvanzada;
/**
 *
 * @author jose4
 */
public class Mostrar {
    
    //Instancia de las clases Calculadora basica y Calculadora avanzada
    static CalculadoraBasica cb = new CalculadoraBasica();
    static CalculadoraAvanzada ca = new CalculadoraAvanzada();
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Calculadora Basica
        cb.Suma();
        cb.Resta();
        cb.Division();
        cb.Multiplicacion();
        
        //Calculadora Avanzada
        ca.Potencia();
        ca.Factorial();
    }
}
