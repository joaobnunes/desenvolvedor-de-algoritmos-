/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

/**
 *
 * @author Aluno01
 */
public class Atividade6 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        System.out.print("SÃ©rie de Fibonacci atÃ© passar de 100: ");
        
        while (a <= 100){
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
