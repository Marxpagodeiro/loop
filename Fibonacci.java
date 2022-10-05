/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = 0;
        int menor = 0;
        int maior = 1;
        int prox = 0;
        System.out.println("Qual o valor de X ");
        X = in.nextInt();
        while(maior<=X){
            prox = maior+menor;
            menor=maior;
            maior=prox;
            prox=maior+menor;
            if(maior == X){
                System.out.println("O numero pertence a sequencia de Fibonacci .");
            }
            
        }
        if(maior!=X){
           System.out.println(" O maior numero de fibonacci menor que X é " + menor); 
        }  
    }
}
