/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

import java.util.Scanner;

/**
 *
 * @author Aluno01
 */
public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("digite o terceiro numero: ");
        double numero3 = scanner.nextDouble();
        
        // Calcule a mÃ©dia
        double media = (numero1 + numero2 + numero3) / 3;

        // Imprima a mÃ©dia
        System.out.println("A mÃ©dia dos trÃªs nÃºmeros Ã©: " + media);
    }
}



