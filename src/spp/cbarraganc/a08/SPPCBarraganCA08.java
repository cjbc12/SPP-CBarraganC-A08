/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.a08;
import java.util.Scanner;
/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarraganCA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
        int promedio, sumaNon=0, sumaPar=0, cont=0;
        int [][]calc={{10,30,89,48,56},
                      {32,23,84,20,10},
                      {48,58,74,46,33}};
        
        for (int[] calc1 : calc) {
            for (int j = 0; j < calc1.length; j= j+2) {
                sumaPar = sumaPar + calc1[j];
                cont++;
            }
        }
        System.out.println("La suma de los numeros pares introducidos es: "+ sumaPar);
       
       
        
        for (int[] calc1 : calc) {
            for (int j = 1; j < calc1.length; j=j+2) {
                sumaNon = sumaNon + calc1[j];
            }
        }
        System.out.println("\nLa suma de los numeros impares es: "+ sumaNon);
        System.out.println("¡Hasta la vista Baby!");
    }
    
}
