/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fabiano06;

/**
 *
 * @author Aluno01
 */
public class Fabiano06 {

    public static void main(String[] args) {
        for (int n = 1, i = 1; n <= 15; n++, i *= n)
            System.out.println("Fatorial de " + n + " (int) = " + i);

        long l = 1;
        for (int n = 1; n <= 15; n++, l *= n)
            System.out.println("Fatorial de " + n + " (long) = " + l);
    }
}

