/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Aluno01
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int x = 13;
        
        while (x != 1) {
            System.out.print(x + " -> ");
            if (x % 2 == 0){
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }
        System.out.print("1"); 
    }
}